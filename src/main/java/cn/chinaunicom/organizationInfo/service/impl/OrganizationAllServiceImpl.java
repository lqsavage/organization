package cn.chinaunicom.organizationInfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chinaunicom.organizationInfo.dao.OrganizationAllMapper;
import cn.chinaunicom.organizationInfo.entity.OrganizationAll;
import cn.chinaunicom.organizationInfo.service.OrganizationAllService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

/**
 * <p>
 * 组织信息表 服务实现类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-05
 */
@Service
public class OrganizationAllServiceImpl extends HrServiceImpl<OrganizationAllMapper, OrganizationAll> implements OrganizationAllService {

	@Autowired
	OrganizationAllMapper mapper;

}
