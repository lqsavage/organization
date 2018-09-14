package cn.chinaunicom.func.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.func.entity.FuncRegister;
import cn.chinaunicom.func.service.FuncRegisterService;
import cn.chinaunicom.utils.MessageResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * **************************************
 * 描述: 节点注册
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController 
 * @author zhw 
 * @version V1.0
 * **************************************
 */
@Api(value = "节点注册", tags = "节点注册")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/func")
public class FuncRegisterController {

	@Autowired
	FuncRegisterService service;
	
	@ApiOperation(value = "服务列表", notes = "服务列表", response = FuncRegister.class, httpMethod = "GET")
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
    public ResponseEntity<Object> getFuncList(){
		List<FuncRegister> list = service.getFuncList();
        if(list==null) {
            list = new ArrayList<FuncRegister>();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
	
	@ApiOperation(value = "保存节点", notes = "保存节点", response = MessageResponse.class, httpMethod = "POST")
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
	public ResponseEntity<Object> saveServer(FuncRegister entity){
		MessageResponse vo = new MessageResponse();
        Integer i = service.saveFunc(entity);
        if(i>0) {
        	vo.setMsg("添加成功");
        }else {
        	vo.setMsg("添加失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
}

