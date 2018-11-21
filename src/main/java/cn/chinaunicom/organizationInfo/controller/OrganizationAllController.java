package cn.chinaunicom.organizationInfo.controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;


import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import cn.chinaunicom.common.DateUtil;
import cn.chinaunicom.common.FastJsonUtils;
import cn.chinaunicom.organizationInfo.entity.DataList;
import cn.chinaunicom.organizationInfo.entity.OrgStructureVersions;
import cn.chinaunicom.organizationInfo.entity.OrganizationAll;
import cn.chinaunicom.organizationInfo.service.AuthCtrlValueService;
import cn.chinaunicom.organizationInfo.service.OrgStructureVersionsService;
import cn.chinaunicom.organizationInfo.service.OrgStructuresService;
import cn.chinaunicom.organizationInfo.service.OrganizationAllService;
import cn.chinaunicom.utils.entity.TreeData;
import cn.chinaunicom.utils.service.TreeDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * ************************************** 描述: 组织信息表
 * 
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController
 * @author lizhenhao
 * @since 2018-11-05
 * @version V1.0 **************************************
 */

@Api(value = "组织信息综合查询", tags = "组织信息综合查询")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/organization")
public class OrganizationAllController {

	@Autowired
	TreeDataService				service;
	@Autowired
	OrganizationAllService		organizationAllService;
	@Autowired
	OrgStructuresService		orgStructuresService;
	@Autowired
	AuthCtrlValueService		authCtrlValueService;
	@Autowired
	OrgStructureVersionsService	orgStructureVersionsService;

	/**
	 * 描述: （组织信息综合查询页面初始化）
	 * 
	 * @param login_name
	 * @param resp_id
	 * @return ResponseEntity<Object>
	 */
	@SuppressWarnings("static-access")
	@ApiOperation(value = "组织信息综合查询页面初始化", notes = "组织信息综合查询页面初始化", response = TreeData.class, httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "获取数据成功",
                    response = List.class
            ),
            @ApiResponse(
                    code = 404,
                    message = "未查询到数据"
            )
    })
	@GetMapping("/list")
	public ResponseEntity<Object> getOrganizationAllList(String login_name, String resp_id, String orgName) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<OrgStructureVersions> initialization = new ArrayList<OrgStructureVersions>();
		List<DataList> dataList = new ArrayList<DataList>();
		OrgStructureVersions structureVersions = new OrgStructureVersions();
		List<TreeData> tree = new ArrayList<TreeData>();
		List<TreeData> treePlus = new ArrayList<TreeData>();
		boolean flag=false;

		// 树组件根据组织名称模糊查询
		if (StringUtils.isNotBlank(orgName))
		{
			
			long id = getByName(orgName);
			if(id==-1){
				map.put("flag",flag);
				return new ResponseEntity<>(map, HttpStatus.OK);
			}else{
				flag=true;
				tree = getParentNode(id);
				if(tree!=null && tree.size()>0) {
					tree.remove(0);
					tree.remove(0);
				}
				map.put("dataTree",tree);
				map.put("flag",flag);
			}

			return new ResponseEntity<>(map, HttpStatus.OK);
		}

		String jsonValue = authCtrlValueService.getTopId(login_name, resp_id);
		String topId = (String)FastJsonUtils.stringToCollect(jsonValue).get("orgIds");// 获取顶层组织id
		String structureName = orgStructuresService.selectById(topId).getStructureName();// 获取结构版本名称
		map.put("topId", topId);
		map.put("structureName", structureName);
		initialization = orgStructureVersionsService.getInitialization(Integer.parseInt(topId));// 初始化版本信息
		if (initialization != null && initialization.size() > 0)
		{
			structureVersions = initialization.get(0);
			map.put("flexValue", structureVersions.getOrgStructureVersionIdEhr());
			map.put("flexName", structureVersions.getVersionNumber());
			map.put("dateFrom", DateUtil.date_string(structureVersions.getDateFrom(), "yyyy-MM-dd"));
			map.put("dateTo", structureVersions.getDateTo());
			for (int j = 0; j < initialization.size(); j++)
			{
				DataList dta = new DataList();
				dta.setReal(String.valueOf(initialization.get(j).getOrgStructureVersionIdEhr()));
				dta.setShow(String.valueOf(initialization.get(j).getVersionNumber()));
				dataList.add(dta);
			}
		}
		map.put("dataList", dataList);
		/**
		 * 取顶层节点信息下级节点信息拼装初始化二级树返回
		 */
		List<TreeData> resultTree = getResultTree(topId, String.valueOf(structureVersions.getOrgStructureVersionIdEhr()));
		map.put("treeData", resultTree);
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	/**
	 * 描述: （获取组织下级节点）
	 * 
	 * @param
	 * @param
	 * @return ResponseEntity<Object>
	 */
	@ApiOperation(value = "获取组织下级节点", notes = "获取组织下级节点", response = TreeData.class, httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "获取数据成功",
                    response = List.class
            ),
            @ApiResponse(
                    code = 404,
                    message = "未查询到数据"
            )
    })
	@GetMapping("/sub")
	public ResponseEntity<Object> getSubTree(String topId, String versionId) {
		List<TreeData> list = getChildrenTree(topId, versionId);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	
	
	
	/**
	 * 描述: （组织结构图查询当前节点下所有子节点）
	 * 
	 * @param
	 * @param
	 * @return ResponseEntity<Object>
	 */
	@ApiOperation(value = "导出组织结构excel", notes = "导出组织结构excel", response = TreeData.class, httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "获取数据成功",
                    response = List.class
            ),
            @ApiResponse(
                    code = 404,
                    message = "未查询到数据"
            )
    })
	@GetMapping("/all")
	public ResponseEntity<Object> getSubAllTree(String topId,String lev,HttpServletResponse response)throws Exception {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("organizationId",Integer.parseInt(topId));
		params.put("lev", Integer.parseInt(lev));
		OrganizationAll all = organizationAllService.getData(params);
		List<OrganizationAll> list = organizationAllService.getAllData(params);

		OrganizationAll info=new OrganizationAll();
		if(StringUtils.isNotBlank(topId)) {
			info.setOrganizationId(Integer.parseInt(topId));
		}

		if(StringUtils.isNotBlank(lev)) {
			info.setLev(Integer.parseInt(lev));
		}


		String fileName = list.get(0).getName()+"组织结构.xls";
		response.setContentType("application/msexcel;charset=UTF-8");
		response.setHeader("Content-Disposition","attachment;filename="+java.net.URLEncoder.encode(fileName, "UTF-8"));
		response.addHeader("Pargam","no-cache");
    	response.addHeader("Cache-Control", "no-cache");
    	OutputStream os = response.getOutputStream();


    	try{


    		InputStream stream=(InputStream)this.getClass().getClassLoader().getResourceAsStream("templet/orgpreqry/intOrgTree.xls");
			HSSFWorkbook wb = new HSSFWorkbook(stream);

			this.exportM(wb,list,all,info.getLev());

			wb.write(os);

		}catch(Exception e){
			e.printStackTrace();
		}

		//关闭输出流
		if(os!=null){
			os.flush();
			os.close();
		}

				return new ResponseEntity<>(null, HttpStatus.OK);
	}




	/**
	 * 描述: （根据版本号重新刷新树组织）
	 *
	 * @param
	 * @param
	 * @return ResponseEntity<Object>
	 */
	@ApiOperation(value = "根据版本号重新刷新树组织", notes = "根据版本号重新刷新树组织", response = TreeData.class, httpMethod = "GET")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
			@ApiResponse(
					code = 200,
					message = "获取数据成功",
					response = List.class
			),
			@ApiResponse(
					code = 404,
					message = "未查询到数据"
			)
	})
	@GetMapping("/rash")
	public ResponseEntity<Object> getRefRashTree(String topId, String versionId) {
		Map<String,Object> map = new HashMap<String,Object>();
		List<TreeData> treeData = getResultTree(topId, versionId);
		map.put("treeDate",treeData);
		return new ResponseEntity<>(map, HttpStatus.OK);
	}


	/**
	 *
	 * @param topId:顶层组织id
	 * @param versionId:版本号
	 * @return
	 */
	private List<TreeData> getResultTree(String topId, String versionId ){
	List<TreeData> dataList = new ArrayList<TreeData>();
	List<TreeData> treePlus = new ArrayList<TreeData>();
	TreeData treeData = getTopTree(topId);
	dataList= getChildrenTree(topId, versionId);
	treeData.setChildren(dataList);
	treePlus.add(treeData);
	return treePlus;

}

private void exportM(HSSFWorkbook wb,List<OrganizationAll> list,OrganizationAll info,Integer lev) {


		wb.setActiveSheet(0);
		HSSFSheet sheet = wb.getSheetAt(0);

		//创建单元格,并设置值表头 设置表头居中
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment( HSSFCellStyle.ALIGN_CENTER);

		if(lev == 1){
			sheet.createRow(0).createCell(0).setCellValue(info.getName());
		}else{
			this.mergeColumn(sheet,list,info,info.getOrganizationId(), 2, info.getLev(), 0);
		}

	}

	/**
	 * @param sheet
	 * @param list 数据总集合
	 * @param pId  父id
	 * @param level 树级别
	 * @param maxLevel 最大显示树级别
	 * @param start  excel合并开始位置
	 */
	private void mergeColumn(HSSFSheet sheet, List<OrganizationAll> list,OrganizationAll info,long pId, Integer level, Integer maxLevel, Integer start) {
		List<OrganizationAll> data = getDataByPid(pId, list);
		/*if(level > maxLevel || null == data || 0 == data.size()) {
			return ;
		}*/

		if(null == data || 0 == data.size()) {
			return ;
		}
		for(OrganizationAll d : data) {
			int s = start;
			start = this.mergeColumnD(sheet, list,info, d, level, start);
			this.mergeColumn(sheet,list,info,d.getOrganizationId(), level+1, maxLevel,  s);
		}

	}

	/**
	 * 根据树级别获取这个级别的数据
	 * @param
	 * @param list
	 * @return
	 */
	private List<OrganizationAll> getDataByPid(long pid, List<OrganizationAll> list) {
		List<OrganizationAll> newList = new ArrayList<OrganizationAll>();
		for(OrganizationAll p : list) {
			if(p.getOrganizationIdParent() == pid) {
				newList.add(p);
			}
		}
		return newList;
	}

	/**
	 * @param sheet
	 * @param list 数据总集合
	 * @param data 当前要合并的元素
	 * @param level 当前元素级别
	 * @param start 当前元素合并开始位置
	 * @return
	 */
	private Integer mergeColumnD(HSSFSheet sheet, List<OrganizationAll> list,OrganizationAll info, OrganizationAll data, Integer level, Integer start) {
		Integer index = level-1;
		HSSFRow r = sheet.getRow(start);
		HSSFRow row = null;
		if(null == r) {
			row = sheet.createRow(start);
		} else {
			row = r;
		}
		/**
		 * 获取子树需要合并的行数
		 */
		Integer count = this.getChildMergeCount(data.getOrganizationId(), list);
		Integer end =  start+count;
		end = end -1 < start ? start : end;

			sheet.addMergedRegion(new CellRangeAddress(start, end-1, index, index));
			sheet.addMergedRegion(new CellRangeAddress(0, end-1, 0, 0));

		
        //在sheet里增加合并单元格
		HSSFCell cell = row.createCell(index);
        //cell.setCellStyle(createStyle(sheet.getWorkbook()));
        cell.setCellValue(data.getName());

        HSSFCell cell1 = row.createCell(0);
		cell1.setCellValue(info.getName());

        start += count;

		return start;
	}

	/**
	 * 查找父元素下的最末尾叶子数
	 * @param pid
	 * @param list
	 * @return
	 */
	private Integer getChildMergeCount(long pid, List<OrganizationAll> list) {
		List<OrganizationAll> data = getDataByPid(pid, list);
		Integer count = 0;
		if(data == null || data.size() == 0) {
			count = 1;
		} else {
			for(OrganizationAll l : data) {
				List<OrganizationAll> childData = getDataByPid(l.getOrganizationId(), list);
				if(childData == null || childData.size() == 0) {
					count += 1;
				} else {
					for(OrganizationAll cl : childData) {
						Integer c = this.getChildMergeCount(cl.getOrganizationId(), list);
						count += c;
					}
				}
			}
		}
		return count;
	}




	/**
	 * 描述: （查询顶层节点）
	 *
	 * @param topId
	 * @return OrganizationAll
	 */
	private TreeData getTopTree(String topId) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", topId);
		params.put("wherePart", " 1=1 ");
		params.put("tableName", "EHRBASE_ORGANIZATION_ALL");
		params.put("idCode", "ORGANIZATION_ID");
		params.put("pidCode", "ORGANIZATION_ID_PARENT");
		params.put("nameCode", "NAME");
		TreeData treeData = service.getData(params).get(0);

		return treeData;

	}

	/**
	 * 描述: （查询下级信息）
	 * 
	 * @param topId
	 * @param versionId
	 * @return List<OrganizationAll>
	 */
	private List<TreeData> getChildrenTree(String topId, String versionId) {
		StringBuffer sb = new StringBuffer();
		sb.append("(SELECT organization_id_child FROM EHRCUC_ORG_STRUCTURE_ELEMENTS A WHERE A.ORG_STRUCTURE_VERSION_ID_EHR =").append(versionId).append(" and A.organization_id_parent =").append(topId)
				.append(")");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("tableName", "EHRBASE_ORGANIZATION_ALL");
		params.put("idCode", "ORGANIZATION_ID");
		params.put("pidCode", "ORGANIZATION_ID_PARENT");
		params.put("nameCode", "NAME");
		params.put("tempTable", sb.toString());
		params.put("templete", " IFNULL(DATE_TO, DATE_FORMAT(sysdate(), '%Y-%m-%d')) >= DATE_FORMAT(sysdate(), '%Y-%m-%d')");
		List<TreeData> tempTB = service.getChildrenDataByTempTB(params);
		return tempTB;

	}

	/**
	 * 
	 * 描述: （取当前节点所有父节点包括自己）
	 * 
	 * @return List<TreeData>
	 */
	private List<TreeData> getParentNode(long orgId) {
		StringBuffer sb = new StringBuffer();
		sb.append("(\r\n" + 
				"    select @id idlist, @lv:=@lv+1 lv,\r\n" + 
				"    (select @id:=group_concat(ORGANIZATION_ID_PARENT separator ',') from ehrbase_organization_all where find_in_set(ORGANIZATION_ID,@id)) sub\r\n" + 
				"    from ehrbase_organization_all,(select @id:=").append(orgId).append(",@lv:=0) vars\r\n" + 
						"    where @id is not null) tl,ehrbase_organization_all t\r\n" + 
						"where find_in_set(t.ORGANIZATION_ID,tl.idlist) order by tl.lv desc");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("idCode", "t.ORGANIZATION_ID");
		params.put("pidCode", "t.ORGANIZATION_ID_PARENT");
		params.put("nameCode", "t.NAME");
		params.put("templete", sb.toString());
		List<TreeData> parentByTempTB = service.getParentByTempTB(params);
		return parentByTempTB;

	}
	
	/**
	 * 
	*描述: （根据名称查询当前id） 
	*@return String
	 */
	private long getByName(String name) {
		 EntityWrapper<OrganizationAll> ew = new EntityWrapper<OrganizationAll>();
		 ew.where("name= {0}",name);
		 long idPlus=-1;
		 long organizationId=0;
		 OrganizationAll all = organizationAllService.selectOne(ew);

		 if(all==null){
		 	return  idPlus;
		 }else{
			 organizationId= all.getOrganizationId();

		 }
		 return organizationId;
		
	}
	
	
	public static void main(String[] args) {
		String temp="attachment; filename="+"四川省分公司"+"组织结构"+".xls";
		System.out.println(temp);
		
	}
}
