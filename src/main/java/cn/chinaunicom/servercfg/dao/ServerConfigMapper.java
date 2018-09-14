package cn.chinaunicom.servercfg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import cn.chinaunicom.dao.HrBaseMapper;
import cn.chinaunicom.servercfg.entity.ServerConfig;

/**
 * **************************************
 * 描述: 服务管理mapper 
 * @ClassName: cn.chinaunicom.servercfg.dao.ServerConfigMapper 
 * @author zhw 
 * @version V1.0
***************************************
 */
@Repository
@Mapper
public interface ServerConfigMapper extends HrBaseMapper<ServerConfig> {

	/**
	 * 
	*描述: 根据模块名获取服务注册信息 
	*@param module
	*@return List<ServerConfig>
	 */
	List<ServerConfig> getByModle(String module);
}
