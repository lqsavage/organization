package cn.chinaunicom.orgmanage.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.orgmanage.dao.OrgHeaderDocMapper;
import cn.chinaunicom.orgmanage.entity.OrgHeaderDoc;
import cn.chinaunicom.orgmanage.service.OrgHeaderDocService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

/**
 * <p>
 * 批文信息表 服务实现类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-11-22
 */
@Service
public class OrgHeaderDocServiceImpl extends HrServiceImpl<OrgHeaderDocMapper, OrgHeaderDoc> implements OrgHeaderDocService {

	@Autowired
	OrgHeaderDocMapper mapper;
	
	@Override
	public Page<Map<String, Object>> getOrgHeaderDocList(String docCode,
			String isApprove,
			String docVerifier,
			String docStatus,
			String docDateS,
			String docDateE,
			String operatorId,
			Integer xBusinessGroupId,
			Integer pageNumber,
			Integer pageSize) {
		Page<Map<String, Object>> page = new Page<Map<String, Object>>(pageNumber, pageSize);
        Map params = new HashMap();
        params.put("docCode", docCode);
        params.put("isApprove", isApprove);
        params.put("docVerifier", docVerifier);
        params.put("docStatus", docStatus);
        params.put("docDateS", docDateS);
        params.put("docDateE", docDateE);
        params.put("operatorId", operatorId);
		return page.setRecords(this.mapper.searchOrgCreateInfo(page,params));
	}

	@Override
	public Integer saveOrgHeaderDoc(OrgHeaderDoc entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updateOrgHeaderDoc(OrgHeaderDoc entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deleteOrgHeaderDoc(Long id) {
		return mapper.deleteById(id);
	}

}
