package cn.chinaunicom.approval.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.approval.dao.OrgHeaderBatchMapper;
import cn.chinaunicom.approval.entity.OrgHeaderBatch;
import cn.chinaunicom.approval.service.OrgHeaderBatchService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

/**
 * <p>
 * 前置流城业务表 服务实现类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-10-19
 */
@Service
public class OrgHeaderBatchServiceImpl extends HrServiceImpl<OrgHeaderBatchMapper, OrgHeaderBatch> implements OrgHeaderBatchService {

	@Autowired
	OrgHeaderBatchMapper mapper;
	
	@Override
	public Page<OrgHeaderBatch> getOrgHeaderBatchList(String batchCode,Integer pageNumber, Integer pageSize) {
		Page<OrgHeaderBatch> page = new Page<OrgHeaderBatch>(pageNumber, pageSize);
		EntityWrapper<OrgHeaderBatch> entityWrapper = new EntityWrapper<OrgHeaderBatch>();
		entityWrapper.eq("1", "1");
		if(!StringUtils.isEmpty(batchCode)) {
			entityWrapper.like("DOC_CODE", batchCode);
		}
		return page.setRecords(mapper.selectPage(page,entityWrapper ));
	}

	@Override
	public Integer saveOrgHeaderBatch(OrgHeaderBatch entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updateOrgHeaderBatch(OrgHeaderBatch entity) {
		return mapper.updateById(entity);
	}

	@Override
	public Page<Map<String, Object>> selectAllList(String batchCode, String workFlowStatus, String batchVerifier, String fullName, String batDateS, String batDateE, String operatorId,
			Integer xBusinessGroupId, Integer pageNumber, Integer pageSize) {
        Page<Map<String, Object>> page = new Page<Map<String, Object>>(pageNumber, pageSize);
        Map params = new HashMap();
        params.put("batchCode", batchCode);
        params.put("workFlowStatus", workFlowStatus);
        params.put("batchVerifier", batchVerifier);
        params.put("fullName", fullName);
        params.put("batDateS", batDateS);
        params.put("batDateE", batDateE);
        params.put("operatorId", operatorId);
		return page.setRecords(this.mapper.searchAllBaInfo(page,params));
	}

	@Override
	public Integer deleteHeaderBatch(Long id) {
		return mapper.deleteById(id);
	}
	
	@Override
	public List<Map<String, Object>> getAttachmentListByHeadId(Long id) {
		return mapper.getAttachmentListByHeadId(id);
	}
}
