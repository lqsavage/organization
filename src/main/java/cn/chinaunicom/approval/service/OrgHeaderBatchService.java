package cn.chinaunicom.approval.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.approval.entity.OrgHeaderBatch;
import cn.chinaunicom.platform.service.IHrService;

/**
 * <p>
 * 前置流城业务表 服务类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-10-19
 */
public interface OrgHeaderBatchService extends IHrService<OrgHeaderBatch> {

	public Page<OrgHeaderBatch> getOrgHeaderBatchList(Integer pageNumber, Integer pageSize);
	
	public Integer saveOrgHeaderBatch(OrgHeaderBatch entity);
	
	public Integer updateOrgHeaderBatch(OrgHeaderBatch entity);
	
	public Integer deleteHeaderBatch(Long id);
	
	public Page<Map<String, Object>> selectAllList(String batchCode,
			String workFlowStatus,
			String batchVerifier,
			String fullName,
			String batDateS,
			String batDateE,
			String operatorId,
            Integer xBusinessGroupId,
            Integer pageNumber,
            Integer pageSize);
	
	public List<Map<String, Object>> getAttachmentListByHeadId(Long id);
	
}
