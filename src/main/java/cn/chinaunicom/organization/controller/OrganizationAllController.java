package cn.chinaunicom.organization.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.organization.entity.OrgTree;
import cn.chinaunicom.organization.entity.OrganizationAll;
import cn.chinaunicom.organization.service.OrganizationAllService;
import cn.chinaunicom.platform.utils.MessageResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.web.bind.annotation.RestController;

/**
 * **************************************
 * 描述: 组织信息表
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController 
 * @author zuohongwei 
 * @since 2018-10-24
 * @version V1.0
 * **************************************
 */
@Api(value = "组织信息表", tags = "组织信息表")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/organizationAll")
public class OrganizationAllController {

	@Autowired
	OrganizationAllService service;
	
	@ApiOperation(value = "组织信息表列表", notes = "组织信息表列表", response = OrganizationAll.class, httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
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
    public ResponseEntity<Object> getOrganizationAllList(){
		List<OrganizationAll> list = service.getOrganizationAllList();
        if(list==null) {
            list = new ArrayList<OrganizationAll>();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
	
	@ApiOperation(value = "保存组织信息表", notes = "保存组织信息表", response = MessageResponse.class, httpMethod = "POST")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
	         @ApiResponse(
	                 code = 200,
	                 message = "添加成功"
	         )
	})
	@PostMapping("/save")
	public ResponseEntity<Object> saveOrganizationAll(@RequestBody OrganizationAll entity){
		MessageResponse vo = new MessageResponse();
        Integer i = service.saveOrganizationAll(entity);
        if(i>0) {
        	vo.setMsg("添加成功");
        }else {
        	vo.setMsg("添加失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    
    @ApiOperation(value = "更新组织信息表", notes = "更新组织信息表", response = MessageResponse.class, httpMethod = "POST")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
	         @ApiResponse(
	                 code = 200,
	                 message = "添加成功"
	         )
	})
	@PostMapping("/update")
	public ResponseEntity<Object> updateOrganizationAll(@RequestBody OrganizationAll entity){
		MessageResponse vo = new MessageResponse();
        Integer i = service.updateOrganizationAll(entity);
        if(i>0) {
        	vo.setMsg("更新成功");
        }else {
        	vo.setMsg("更新失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    
    @ApiOperation(value = "删除组织信息表", notes = "删除组织信息表", response = MessageResponse.class, httpMethod = "POST")
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
	public ResponseEntity<Object> deleteOrganizationAll(@PathVariable("id") Long id){
		MessageResponse vo = new MessageResponse();
        Integer i = service.deleteOrganizationAll(id);
        if(i>0) {
        	vo.setMsg("删除成功");
        }else {
        	vo.setMsg("删除失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    

	@ApiOperation(value = "组织信息树", notes = "组织信息树", response = OrganizationAll.class, httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
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
    @GetMapping("/tree")
    public ResponseEntity<Object> getOrganizationTree(String id,Boolean isSelf){
		List<OrgTree> list = service.getOrganizationTree(id,isSelf);
        if(list==null) {
            list = new ArrayList<OrgTree>();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}

