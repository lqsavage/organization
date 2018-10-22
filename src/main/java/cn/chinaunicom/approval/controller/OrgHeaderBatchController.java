package cn.chinaunicom.approval.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import cn.chinaunicom.approval.entity.OrgHeaderBatch;
import cn.chinaunicom.approval.service.OrgHeaderBatchService;
import cn.chinaunicom.platform.utils.MessageResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * **************************************
 * 描述: 前置流程业务表
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController 
 * @author zuohongwei 
 * @since 2018-10-19
 * @version V1.0
 * **************************************
 */
@Api(value = "前置流程业务表", tags = "前置流程业务表")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/orgHeaderBatch")
public class OrgHeaderBatchController {

	@Autowired
	OrgHeaderBatchService service;
	
	@ApiOperation(value = "前置流程业务表列表", notes = "前置流程业务表列表", response = OrgHeaderBatch.class, httpMethod = "GET")
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
    public ResponseEntity<Object> getOrgHeaderBatchList(
    		@RequestParam(value = "batchCode", required = false) String batchCode,
    		@RequestParam(value = "pageNumber", defaultValue = "1") Integer pageNumber,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize){
        Page<OrgHeaderBatch> policyRulePage = service.getOrgHeaderBatchList(batchCode,
                pageNumber,
                pageSize);

        MessageResponse dto = new MessageResponse();
        if (null != policyRulePage) {
            dto.setMsg("查询成功");
            return new ResponseEntity<>(policyRulePage, HttpStatus.OK);
        } else {
            String msg = "未找到变更依据数据";
            dto.setMsg(msg);
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }
    }
	
	@ApiOperation(value = "删除前置流程业务表", notes = "删除前置流程业务表", response = MessageResponse.class, httpMethod = "DELETE")
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
	public ResponseEntity<Object> delete(@PathVariable("id") Long id){
		MessageResponse vo = new MessageResponse();
        Integer i = service.deleteHeaderBatch(id);
        if(i>0) {
        	vo.setMsg("删除成功");
        }else {
        	vo.setMsg("删除失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
	
	@ApiOperation(value = "保存前置流程业务表", notes = "保存前置流程业务表", response = MessageResponse.class, httpMethod = "POST")
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
	public ResponseEntity<Object> saveOrgHeaderBatch(@RequestBody OrgHeaderBatch entity){
		MessageResponse vo = new MessageResponse();
        Integer i = service.saveOrgHeaderBatch(entity);
        if(i>0) {
        	vo.setMsg("添加成功");
        }else {
        	vo.setMsg("添加失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
	
	@ApiOperation(value = "更新前置流程业务表", notes = "更新前置流程业务表", response = MessageResponse.class, httpMethod = "POST")
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
	public ResponseEntity<Object> updateOrgHeaderBatch(@RequestBody OrgHeaderBatch entity){
		MessageResponse vo = new MessageResponse();
        Integer i = service.updateOrgHeaderBatch(entity);
        if(i>0) {
        	vo.setMsg("添加成功");
        }else {
        	vo.setMsg("添加失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
	
	/**
     * 查询-全部
     *
     * @param xBusinessGroupId
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @ApiOperation(value = "获取变更依据", notes = "获取变更依据", response = Page.class, responseContainer = "List", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-Business-Group-Id", value = "业务组ID", required = true, dataType = "String", paramType = "header", defaultValue = "101"),
            @ApiImplicitParam(name = "batchCode", value = "文件名称和文号", required = false, dataType = "String"),
            @ApiImplicitParam(name = "workFlowStatus", value = "流程状态", required = false, dataType = "String"),
            @ApiImplicitParam(name = "batchVerifier", value = "文件拟稿人", required = false, dataType = "String"),
            @ApiImplicitParam(name = "fullName", value = "文件发起人", required = false, dataType = "String"),
            @ApiImplicitParam(name = "batDateS", value = "发起开始时间", required = false, dataType = "String"),
            @ApiImplicitParam(name = "batDateE", value = "发起结束时间", required = false, dataType = "String"),
            @ApiImplicitParam(name = "pageNumber", value = "当前页数", required = true, dataType = "Int"),
            @ApiImplicitParam(name = "pageSize", value = "页面条数", required = true, dataType = "Int", defaultValue = "10"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "获取变更依据数据成功", response = Page.class, responseContainer = "List"),
            @ApiResponse(code = 404, message = "未获取到有效的变更依据", response = Page.class)
    })
	@GetMapping("/all")
    public ResponseEntity<Object> selectAllList(@RequestParam(value = "batchCode", required = false) String batchCode,
                                                @RequestParam(value = "workFlowStatus", required = false) String workFlowStatus,
                                                @RequestParam(value = "batchVerifier", required = false) String batchVerifier,
                                                @RequestParam(value = "fullName", required = false) String fullName,
                                                @RequestParam(value = "batDateS", required = false) String batDateS,
                                                @RequestParam(value = "batDateE", required = false) String batDateE,
                                                @RequestParam(value = "operatorId",required = false) String operatorId,
                                                @RequestParam("pageNumber") Integer pageNumber,
                                                @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
    	String xBusinessGroupId = "101";
        Page<Map<String, Object>> policyRulePage = service.selectAllList(
        		batchCode,
        		workFlowStatus,
        		batchVerifier,
        		fullName,
        		batDateS,
        		batDateE,
        		operatorId,
                Integer.valueOf(xBusinessGroupId),
                pageNumber,
                pageSize);

        MessageResponse dto = new MessageResponse();
        if (null != policyRulePage) {
            dto.setMsg("查询成功");
            return new ResponseEntity<>(policyRulePage, HttpStatus.OK);
        } else {
            String msg = "未找到变更依据数据";
            dto.setMsg(msg);
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }
    }
    
    @ApiOperation(value = "附件列表", notes = "附件列表", response = OrgHeaderBatch.class, httpMethod = "GET")
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
    @GetMapping("/getAttachData")
    public ResponseEntity<Object> getAttachData(Long id){
		List<Map<String,Object>> list = service.getAttachmentListByHeadId(id);
        if(list==null) {
            list = new ArrayList<Map<String,Object>>();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}

