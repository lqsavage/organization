package cn.chinaunicom.func.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

import cn.chinaunicom.func.entity.FuncRegister;

/**
 * <p>
 * 节点注册 服务类
 * </p>
 *
 * @author zhw
 * @since 2018-09-12
 */
public interface FuncRegisterService extends IService<FuncRegister> {

	/**
	 * 
	*描述:获取节点注册列表 
	*@return List<FuncRegister>
	 */
	public List<FuncRegister> getFuncList();
	
	/**
	 * 
	*描述: 保存节点注册信息 
	*@param entity
	*@return Integer
	 */
	public Integer saveFunc(FuncRegister entity);
}
