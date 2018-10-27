package cn.chinaunicom.organization.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.chinaunicom.utils.entity.TreeData;
import cn.chinaunicom.utils.service.TreeDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * **************************************
 * 描述: 组织信息
 * @ClassName: cn.chinaunicom.utils.controller.TreeDataController 
 * @author zuohongwei 
 * @since 2018-10-27
 * @version V1.0
 * **************************************
 */
@Api(value = "获取组织信息", tags = "获取组织信息")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/org")
public class OrganizationController {

	@Autowired
	TreeDataService service;
	
	@ApiOperation(value = "获取本级", notes = "获取本级", response = TreeData.class, httpMethod = "GET")
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
    @GetMapping("/getData")
    public ResponseEntity<Object> getData(String id){
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("id",id);
		params.put("wherePart", " 1=1 ");
		params.put("tableName", "EHRCUC_PFMC_ORGANIZATION");
		params.put("idCode", "ORG_ID");
		params.put("pidCode", "PARENT_ID");
		params.put("nameCode", "ORG_NAME");
		List<TreeData> list = service.getData(params);
        if(list==null) {
            list = new ArrayList<TreeData>();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
	
	@ApiOperation(value = "获取下级", notes = "获取下级", response = TreeData.class, httpMethod = "GET")
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
    @GetMapping("/getChildrenData")
    public ResponseEntity<Object> getChildrenData(String id){
		Map<String,Object> params = new HashMap<String,Object>();
		ArrayList<String> idList = new ArrayList<String>();
		idList.add(id);
		params.put("ids",idList);
		params.put("wherePart", " 1=1 ");
		params.put("tableName", "EHRCUC_PFMC_ORGANIZATION");
		params.put("idCode", "ORG_ID");
		params.put("pidCode", "PARENT_ID");
		params.put("nameCode", "ORG_NAME");
		List<TreeData> list = service.getChildrenData(params);
        if(list==null) {
            list = new ArrayList<TreeData>();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
	
	@ApiOperation(value = "所有组织信息树", notes = "所有组织信息树", response = TreeData.class, httpMethod = "GET")
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
    @GetMapping("/allData")
    public ResponseEntity<Object> getAllData(String id){
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("id",id);
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
}

