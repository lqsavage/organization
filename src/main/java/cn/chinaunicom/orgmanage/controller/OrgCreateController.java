package cn.chinaunicom.orgmanage.controller;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.orgmanage.entity.OrgHeaderDoc;
import cn.chinaunicom.orgmanage.entity.OrgNewUnits;
import cn.chinaunicom.orgmanage.service.OrgHeaderDocService;
import cn.chinaunicom.orgmanage.service.OrgNewUnitsService;
import cn.chinaunicom.orgrelation.entity.OrgRelation;
import cn.chinaunicom.platform.utils.MessageResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * **************************************
 * 描述: 组织新增
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController 
 * @author zuohongwei 
 * @since 2018-11-22
 * @version V1.0
 * **************************************
 */
@Api(value = "组织新增", tags = "组织新增")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/orgCreate")
public class OrgCreateController {

	@Autowired
	OrgHeaderDocService service;
	
	@Autowired
	OrgNewUnitsService createService;
	
	@ApiOperation(value = "批文信息表列表", notes = "批文信息表列表", response = Page.class, httpMethod = "GET")
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "X-Business-Group-Id", value = "业务组ID", required = true, dataType = "String", paramType = "header", defaultValue = "101"),
        @ApiImplicitParam(name = "docCode", value = "依据编号", required = false, dataType = "String"),
        @ApiImplicitParam(name = "isApprove", value = "是否有批文", required = false, dataType = "String"),
        @ApiImplicitParam(name = "docVerifier", value = "校验人", required = false, dataType = "String"),
        @ApiImplicitParam(name = "docStatus", value = "批文状态", required = false, dataType = "String"),
        @ApiImplicitParam(name = "docDateS", value = "起始日期", required = false, dataType = "String"),
        @ApiImplicitParam(name = "docDateE", value = "结束日期", required = false, dataType = "String"),
        @ApiImplicitParam(name = "pageNumber", value = "当前页数", required = true, dataType = "Int"),
        @ApiImplicitParam(name = "pageSize", value = "页面条数", required = true, dataType = "Int", defaultValue = "10")
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "获取数据成功",
                    response = Page.class
            ),
            @ApiResponse(
                    code = 404,
                    message = "未查询到数据"
            )
    })
    @GetMapping("/list")
    public ResponseEntity<Object> getOrgHeaderDocList(@RequestParam(value = "docCode", required = false) String docCode,
            @RequestParam(value = "isApprove", required = false) String isApprove,
            @RequestParam(value = "docVerifier", required = false) String docVerifier,
            @RequestParam(value = "docStatus", required = false) String docStatus,
            @RequestParam(value = "docDateS", required = false) String docDateS,
            @RequestParam(value = "docDateE", required = false) String docDateE,
            @RequestParam(value = "operatorId",required = false) String operatorId,
            @RequestParam("pageNumber") Integer pageNumber,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize){
		String xBusinessGroupId = "101";
		Page<Map<String, Object>> list = service.getOrgHeaderDocList(docCode,
				isApprove,
				docVerifier,
				docStatus,
				docDateS,
				docDateE,
				operatorId,
                Integer.valueOf(xBusinessGroupId),
                pageNumber,
                pageSize);
		MessageResponse dto = new MessageResponse();
        if (null != list) {
            dto.setMsg("查询成功");
            return new ResponseEntity<>(list, HttpStatus.OK);
        } else {
            String msg = "未找到组织新增数据";
            dto.setMsg(msg);
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }
    }
	
    
    @ApiOperation(value = "删除批文信息表", notes = "删除批文信息表", response = MessageResponse.class, httpMethod = "POST")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
	         @ApiResponse(
	                 code = 200,
	                 message = "删除成功"
	         )
	})
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteOrgHeaderDoc(@PathVariable("id") Long id){
		MessageResponse vo = new MessageResponse();
        Integer i = service.deleteOrgHeaderDoc(id);
        if(i>0) {
        	vo.setMsg("删除成功");
        }else {
        	vo.setMsg("删除失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    
    @ApiOperation(value = "保存变更依据", notes = "保存变更依据", response = MessageResponse.class, httpMethod = "POST")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
	         @ApiResponse(
	                 code = 200,
	                 message = "添加成功"
	         )
	})
	@PostMapping("/saveOrgHeaderDoc")
	public ResponseEntity<Object> saveOrgHeaderDoc(@RequestBody OrgHeaderDoc entity,
			@RequestParam(value = "X-Person-Id", required = false) String userId){
    	userId = "2";
    	MessageResponse vo = new MessageResponse();
		entity.setDocStatus("S");
		entity.setCreateBy(Long.valueOf(userId));
		entity.setCreateDate(new Date());
		entity.setAttribute9("ADD");
        Integer i = service.saveOrgHeaderDoc(entity);
        if(i>0) {
        	vo.setMsg("添加成功");
        	vo.setId(entity.getDocHeaderId());
        }else {
        	vo.setMsg("添加失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
	
	@ApiOperation(value = "更新变更依据", notes = "更新变更依据", response = MessageResponse.class, httpMethod = "POST")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
	         @ApiResponse(
	                 code = 200,
	                 message = "添加成功"
	         )
	})
	@PostMapping("/updateOrgHeaderDoc")
	public ResponseEntity<Object> updateOrgHeaderDoc(@RequestBody OrgHeaderDoc entity,@RequestParam(value = "X-Person-Id", required = false) String userId){
		userId = "2";
		entity.setUpdateBy(Long.valueOf(userId));
		entity.setUpdateDate(new Date());
		MessageResponse vo = new MessageResponse();
        Integer i = service.updateOrgHeaderDoc(entity);
        if(i>0) {
        	vo.setMsg("添加成功");
        }else {
        	vo.setMsg("添加失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
	
	@ApiOperation(value = "判断组织名是否重复", notes = "判断组织名是否重复", response = Integer.class, httpMethod = "POST")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
	         @ApiResponse(
	                 code = 200,
	                 message = "查询成功"
	         )
	})
	@PostMapping("/checkNameIsRepeat")
	public ResponseEntity<Object> checkNameIsRepeat(String newOrgName,String docHeaderId,String tOrgId){
		HashMap<String, Object> params = new HashMap<String, Object>();
        Integer i = createService.checkNameIsRepeat(params);
        return new ResponseEntity<>(i, HttpStatus.OK);
	}
	
	@ApiOperation(value = "组织新增保存", notes = "组织新增保存", response = MessageResponse.class, httpMethod = "POST")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
	         @ApiResponse(
	                 code = 200,
	                 message = "添加成功"
	         )
	})
	@PostMapping("/saveNewAddOrgInfo")
	public ResponseEntity<Object> saveNewAddOrgInfo(@RequestBody OrgNewUnits entity,
			@RequestParam(value = "X-Person-Id", required = false) String userId){
    	userId = "2";
    	MessageResponse vo = new MessageResponse();
    	Long docHeaderId = entity.getDocHeaderId();
    	// 关系表
    	OrgRelation relationInfo = new OrgRelation();
		if (!StringUtils.isEmpty(docHeaderId)) {
			relationInfo.setDocHeaderId(docHeaderId);
		}
		relationInfo.setCreateBy(Long.parseLong(userId));
		relationInfo.setUpdateBy(Long.parseLong(userId));
		relationInfo.setmTypeCode("A");// 新增
		relationInfo.setdTypeCode("A");// 新增
		relationInfo.setRelaDescription("A");// 备注
		
		Long gettOrgId = entity.gettOrgId();
		Integer i = null;
		if (null == gettOrgId) {
			i = createService.saveOrgNewUnits(entity,relationInfo);
		}else {
			i = createService.updateOrgNewUnits(entity,relationInfo);
		}
        if(i>0) {
        	vo.setMsg("添加成功");
        	vo.setId(entity.gettOrgId());
        }else {
        	vo.setMsg("添加失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
}

