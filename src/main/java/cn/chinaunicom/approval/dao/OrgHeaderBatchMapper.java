package cn.chinaunicom.approval.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import cn.chinaunicom.approval.entity.OrgHeaderBatch;
import cn.chinaunicom.platform.dao.HrBaseMapper;

/**
 * <p>
 * 前置流城业务表 Mapper 接口
 * </p>
 *
 * @author zuohongwei
 * @since 2018-10-19
 */
public interface OrgHeaderBatchMapper extends HrBaseMapper<OrgHeaderBatch> {

	List<Map<String, Object>> searchAllBaInfo(RowBounds rowBounds, Map params);
	
	List<Map<String, Object>> searchAllBaInfoByEmNum(RowBounds rowBounds, Map params);
	
	public List<Map<String, Object>> getAttachmentListByHeadId(Long id);
}
