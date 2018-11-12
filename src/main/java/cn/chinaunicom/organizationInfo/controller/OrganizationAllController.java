package cn.chinaunicom.organizationInfo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;

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

		// 树组件根据组织名称模糊查询
		if (StringUtils.isNotBlank(orgName))
		{
			
			Integer id = getByName(orgName);
			tree = getParentNode(id);
			if(tree!=null && tree.size()>0) {
				tree.remove(0);
				tree.remove(0);
			}
			return new ResponseEntity<>(tree, HttpStatus.OK);
		}

		String jsonValue = authCtrlValueService.getTopId(login_name, resp_id);
		String topId = (String) new FastJsonUtils().stringToCollect(jsonValue).get("orgIds");// 获取顶层组织id
		String structureName = orgStructuresService.selectById(topId).getStructureName();// 获取结构版本名称
		map.put("topId", topId);
		map.put("structureName", structureName);
		initialization = orgStructureVersionsService.getInitialization(Integer.parseInt(topId));// 初始化版本信息
		if (initialization != null && initialization.size() > 0)
		{
			structureVersions = initialization.get(0);
			map.put("flexValue", structureVersions.getOrgStructureVersionIdEhr());
			map.put("flexName", structureVersions.getVersionNumber());
			map.put("dateFrom", new DateUtil().date_string(structureVersions.getDateFrom(), "yyyy-MM-dd"));
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
		TreeData treeData = getTopTree(topId);
		tree = getChildrenTree(topId, String.valueOf(structureVersions.getOrgStructureVersionIdEhr()));
		treeData.setChildren(tree);
		map.put("treeData", treeData);
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	/**
	 * 描述: （获取组织下级节点）
	 * 
	 * @param login_name
	 * @param resp_id
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
	 * @param login_name
	 * @param resp_id
	 * @return ResponseEntity<Object>
	 */
	@ApiOperation(value = "组织结构图查询当前节点下所有子节点", notes = "组织结构图查询当前节点下所有子节点", response = TreeData.class, httpMethod = "GET")
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
	public ResponseEntity<Object> getSubAllTree(String topId) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("id",topId);
		params.put("wherePart", " 1=1 ");
		params.put("tableName", "EHRCUC_PFMC_ORGANIZATION");
		params.put("idCode", "ORG_ID");
		params.put("pidCode", "PARENT_ID");
		params.put("nameCode", "ORG_NAME");
		List<TreeData> tree = service.getAllData(params);
		if(tree==null) {
        	tree = new ArrayList<TreeData>();
        }
		return new ResponseEntity<>(tree, HttpStatus.OK);
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
	private List<TreeData> getParentNode(Integer orgId) {
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
	private Integer getByName(String name) {
		 EntityWrapper<OrganizationAll> ew = new EntityWrapper<OrganizationAll>();
		 ew.where("name= {0}",name);
		 Integer id = organizationAllService.selectOne(ew).getOrganizationId();
		return id;
		
	}

}
