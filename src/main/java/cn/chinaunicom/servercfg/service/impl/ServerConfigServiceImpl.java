package cn.chinaunicom.servercfg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chinaunicom.servercfg.dao.ServerConfigMapper;
import cn.chinaunicom.servercfg.entity.ServerConfig;
import cn.chinaunicom.servercfg.service.ServerConfigService;
import cn.chinaunicom.service.impl.HrServiceImpl;

/**
 * **************************************
 * 描述: 服务管理service实现类 
 * @ClassName: cn.chinaunicom.servercfg.service.impl.ServerConfigServiceImpl 
 * @author zhw 
 * @version V1.0
***************************************
 */
@Service
public class ServerConfigServiceImpl extends HrServiceImpl<ServerConfigMapper, ServerConfig> implements ServerConfigService {

	@Autowired
	ServerConfigMapper mapper;
	
	@Override
	public List<ServerConfig> getByModule(String module) {
		return mapper.getByModle(module);
	}
	
	@Override
	public Integer saveServer(ServerConfig entity) {
		return mapper.insert(entity);
	}
}
