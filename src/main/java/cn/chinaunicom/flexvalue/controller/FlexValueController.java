package cn.chinaunicom.flexvalue.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.utils.entity.FlexValueData;
import cn.chinaunicom.utils.service.FlexValueDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * **************************************
 * 描述: 信息集档案
 * @ClassName: cn.chinaunicom.flexvalue.controller.FlexValueController 
 * @author zuohongwei 
 * @version V1.0
***************************************
 */
@Api(value = "", tags = "")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/flexValue")
public class FlexValueController {

	@Autowired
	FlexValueDataService service;
	
    
    @ApiOperation(value = "列表", notes = "列表", response = Map.class, httpMethod = "GET")
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
    @GetMapping("/getData")
    public ResponseEntity<Object> getData(String type){
    	List<FlexValueData> list = service.getData(type);
        if(list==null) {
            list = new ArrayList<FlexValueData>();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}

