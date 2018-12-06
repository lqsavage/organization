package cn.chinaunicom.notice.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.baomidou.mybatisplus.plugins.Page;
import cn.chinaunicom.notice.entity.NoticeName;
import cn.chinaunicom.notice.service.NoticeNameService;
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
 * 描述: 
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController 
 * @author zuohongwei 
 * @since 2018-11-29
 * @version V1.0
 * **************************************
 */
@Api(value = "", tags = "")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/noticeName")
public class NoticeNameController {

	@Autowired
	NoticeNameService service;
	
	@ApiOperation(value = "列表", notes = "列表", response = NoticeName.class, httpMethod = "GET")
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
    public ResponseEntity<Object> getNoticeNameList(){
		List<NoticeName> list = service.getNoticeNameList();
        if(list==null) {
            list = new ArrayList<NoticeName>();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
	
	@ApiOperation(value = "保存", notes = "保存", response = MessageResponse.class, httpMethod = "POST")
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
	public ResponseEntity<Object> saveNoticeName(@RequestBody NoticeName entity){
		MessageResponse vo = new MessageResponse();
        Integer i = service.saveNoticeName(entity);
        if(i>0) {
        	vo.setMsg("添加成功");
        }else {
        	vo.setMsg("添加失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    
    @ApiOperation(value = "更新", notes = "更新", response = MessageResponse.class, httpMethod = "POST")
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
	public ResponseEntity<Object> updateNoticeName(@RequestBody NoticeName entity){
		MessageResponse vo = new MessageResponse();
        Integer i = service.updateNoticeName(entity);
        if(i>0) {
        	vo.setMsg("更新成功");
        }else {
        	vo.setMsg("更新失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    
    @ApiOperation(value = "删除", notes = "删除", response = MessageResponse.class, httpMethod = "POST")
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
	public ResponseEntity<Object> deleteNoticeName(@PathVariable("id") Long id){
		MessageResponse vo = new MessageResponse();
        Integer i = service.deleteNoticeName(id);
        if(i>0) {
        	vo.setMsg("删除成功");
        }else {
        	vo.setMsg("删除失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    
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
    @GetMapping("/getNoticeList")
    public ResponseEntity<Object> getNoticeList(@RequestParam(value = "X-Person-Id", required = false) String userId){
    	userId = "2";
    	List<Map<String, Object>> list = service.searchNoticeList(userId);
        if(list==null) {
            list = new ArrayList<Map<String, Object>>();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}

