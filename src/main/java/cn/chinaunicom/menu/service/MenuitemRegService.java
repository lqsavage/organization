package cn.chinaunicom.menu.service;

import com.baomidou.mybatisplus.service.IService;

import cn.chinaunicom.menu.entity.MenuitemReg;

import java.util.List;

/**
 * <p>
 * 菜单注册 服务类
 * </p>
 *
 * @author zhw
 * @since 2018-09-13
 */
public interface MenuitemRegService extends IService<MenuitemReg> {

	/**
	 * 
	*描述: 获取菜单注册列表 
	*@return List<MenuitemReg>
	 */
	public List<MenuitemReg> getMenuitemRegList();
	
	/**
	 * 
	*描述: 保存菜单注册信息 
	*@param entity
	*@return Integer
	 */
	public Integer saveMenuitemReg(MenuitemReg entity);
	
}
