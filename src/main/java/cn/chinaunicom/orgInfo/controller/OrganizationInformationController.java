package cn.chinaunicom.orgInfo.controller;

import cn.chinaunicom.orgInfo.entity.EhrcucOrgStructureVersions;
import cn.chinaunicom.orgInfo.entity.OrgDetailInfo;
import cn.chinaunicom.orgInfo.entity.OrganizationInformation;
import cn.chinaunicom.orgInfo.service.EhrcucOrgStructureVersionsService;
import cn.chinaunicom.orgInfo.service.OrganizationInformationService;
import cn.chinaunicom.platform.utils.MessageResponse;
import com.baomidou.mybatisplus.plugins.Page;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * ************************************** 描述: 组织信息查询及变更
 * 
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController
 * @author wangrunpu
 * @since 2018-10-17
 * @version V1.0 **************************************
 */
@Api(
		value = "组织信息详情查询",
		tags = "组织信息详情查询.")
@CrossOrigin(
		origins = "*",
		maxAge = 3600)
@RestController
@RequestMapping("/api/orgInfo")
public class OrganizationInformationController {

	@Autowired
	OrganizationInformationService service;

	@Autowired
	EhrcucOrgStructureVersionsService ehservice;

	@ApiOperation(
			value = "列表",
			notes = "列表",
			response = OrganizationInformation.class,
			httpMethod = "GET")
	@ApiImplicitParams({ @ApiImplicitParam(
			name = "x-token-code",
			value = "用户登录令牌",
			paramType = "header",
			dataType = "String",
			required = true,
			defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4") })
	@ApiResponses({ @ApiResponse(
			code = 200,
			message = "获取数据成功",
			response = Page.class),
			@ApiResponse(
					code = 404,
					message = "未查询到数据") })
	@GetMapping("/list")
	public ResponseEntity<Object> getOrganizationInformationList() {
		List<OrganizationInformation> list = service.getOrganizationInformationList();
		if (list == null)
		{
			list = new ArrayList<OrganizationInformation>();
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@ApiOperation(
			value = "保存",
			notes = "保存",
			response = MessageResponse.class,
			httpMethod = "POST")
	@ApiImplicitParams({ @ApiImplicitParam(
			name = "x-token-code",
			value = "用户登录令牌",
			paramType = "header",
			dataType = "String",
			required = true,
			defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4") })
	@ApiResponses({ @ApiResponse(
			code = 200,
			message = "添加成功") })
	@PostMapping("/save")
	public ResponseEntity<Object> saveOrganizationInformation(OrganizationInformation entity) {
		MessageResponse vo = new MessageResponse();
		Integer i = service.saveOrganizationInformation(entity);
		if (i > 0)
		{
			vo.setMsg("添加成功");
		} else
		{
			vo.setMsg("添加失败");
		}
		return new ResponseEntity<>(vo, HttpStatus.OK);
	}
	/**
	 * 描述: （根据orgId查询版本详细信息） OrganizationInformation
	 */
	@ApiOperation(
			value = "查询版本信息",
			notes = "接口发布说明",
			httpMethod = "POST")
	@RequestMapping("/getOrgInfoById")
	public OrgDetailInfo getOrgInfoById(@RequestParam("orgId") String orgId) {
		OrgDetailInfo orgInfo = new OrgDetailInfo();
		if(null!=orgId&&(!"".equals(orgId))){
			orgInfo=service.getOrganizationInfoById(Integer.parseInt(orgId));
		}
		return orgInfo;
	}

	/**
	 * 描述: （根据版本号ID查询版本号信息） void
	 */
	@ApiOperation(
			value = "查询版本信息",
			notes = "接口发布说明",
			httpMethod = "POST")
	@RequestMapping("/getVerById")
	private EhrcucOrgStructureVersions getVersionInfoByVid(@RequestParam(
			value = "Vid",
			required = true) int Vid) {
		return ehservice.selectVerInfoById(Vid);
	}

}
