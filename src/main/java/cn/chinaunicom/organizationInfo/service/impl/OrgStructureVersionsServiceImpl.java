package cn.chinaunicom.organizationInfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chinaunicom.organizationInfo.dao.OrgStructureVersionsMapper;
import cn.chinaunicom.organizationInfo.entity.OrgStructureVersions;
import cn.chinaunicom.organizationInfo.service.OrgStructureVersionsService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-05
 */
@Service
public class OrgStructureVersionsServiceImpl extends HrServiceImpl<OrgStructureVersionsMapper, OrgStructureVersions> implements OrgStructureVersionsService {

	@Autowired
	OrgStructureVersionsMapper mapper;

	@Override
	public List<OrgStructureVersions> getInitialization(int organizationIdTop) {
		return mapper.getInitialization(organizationIdTop);
	}

}
