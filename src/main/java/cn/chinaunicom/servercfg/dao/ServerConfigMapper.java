package cn.chinaunicom.servercfg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import cn.chinaunicom.dao.HRBaseMapper;
import cn.chinaunicom.servercfg.entity.ServerConfig;

@Repository
@Mapper
public interface ServerConfigMapper extends HRBaseMapper<ServerConfig> {

	List<ServerConfig> getByModle(String module);
}
