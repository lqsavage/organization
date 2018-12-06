package cn.chinaunicom.orgmanage.service;

import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.orgmanage.entity.OrgHeaderDoc;
import cn.chinaunicom.platform.service.IHrService;

/**
 * <p>
 * 批文信息表 服务类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-11-22
 */
public interface OrgHeaderDocService extends IHrService<OrgHeaderDoc> {

	public Page<Map<String, Object>> getOrgHeaderDocList(String docCode,
			String isApprove,
			String docVerifier,
			String docStatus,
			String docDateS,
			String docDateE,
			String operatorId,
			Integer xBusinessGroupId,
			Integer pageNumber,
			Integer pageSize);
	
	public Integer saveOrgHeaderDoc(OrgHeaderDoc entity);
	
	public Integer updateOrgHeaderDoc(OrgHeaderDoc entity);
	
	public Integer deleteOrgHeaderDoc(Long id);
	
}
