package cn.chinaunicom.organizationInfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chinaunicom.organizationInfo.dao.OrgStructuresMapper;
import cn.chinaunicom.organizationInfo.entity.OrgStructures;
import cn.chinaunicom.organizationInfo.service.OrgStructuresService;
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
public class OrgStructuresServiceImpl extends HrServiceImpl<OrgStructuresMapper, OrgStructures> implements OrgStructuresService {

	@Autowired
	OrgStructuresMapper mapper;

}
