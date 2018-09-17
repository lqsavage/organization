package cn.chinaunicom.menu.service;

import cn.chinaunicom.menu.entity.MenuitemReg;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;

/**
 * <p>
 * 菜单注册 服务类
 * </p>
 *
 * @author zhw
 * @since 2018-09-17
 */
public interface MenuitemRegService extends IService<MenuitemReg> {

	public List<MenuitemReg> getMenuitemRegList();
	
	public Integer saveMenuitemReg(MenuitemReg entity);
	
}
