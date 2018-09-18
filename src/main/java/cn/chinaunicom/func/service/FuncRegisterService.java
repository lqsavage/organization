package cn.chinaunicom.func.service;

import cn.chinaunicom.func.entity.FuncRegister;
import cn.chinaunicom.platform.service.IHrService;

import java.util.List;

/**
 * <p>
 * 节点注册 服务类
 * </p>
 *
 * @author zhw
 * @since 2018-09-17
 */
public interface FuncRegisterService extends IHrService<FuncRegister> {

	public List<FuncRegister> getFuncRegisterList();
	
	public Integer saveFuncRegister(FuncRegister entity);
	
}
