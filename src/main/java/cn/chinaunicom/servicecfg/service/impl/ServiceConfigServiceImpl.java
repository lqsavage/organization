package cn.chinaunicom.servicecfg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import cn.chinaunicom.servicecfg.dao.ServicerConfigMapper;
import cn.chinaunicom.servicecfg.entity.ServiceConfig;
import cn.chinaunicom.servicecfg.service.ServiceConfigService;

/**
 * **************************************
 * 描述: 服务管理service实现类 
 * @ClassName: cn.chinaunicom.servercfg.service.impl.ServerConfigServiceImpl 
 * @author zhw 
 * @version V1.0
***************************************
 */
@Service
public class ServiceConfigServiceImpl extends HrServiceImpl<ServicerConfigMapper, ServiceConfig> implements ServiceConfigService {

	@Autowired
	ServicerConfigMapper mapper;
	
	@Override
	public List<ServiceConfig> getByModule(String module) {
		return mapper.getByModle(module);
	}
	
	@Override
	public Integer saveServer(ServiceConfig entity) {
		return mapper.insert(entity);
	}
}
