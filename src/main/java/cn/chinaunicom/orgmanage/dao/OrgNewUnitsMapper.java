package cn.chinaunicom.orgmanage.dao;

import java.util.Map;

import cn.chinaunicom.orgmanage.entity.OrgNewUnits;
import cn.chinaunicom.platform.dao.HrBaseMapper;

/**
 * <p>
 * 组织增加业务表 Mapper 接口
 * </p>
 *
 * @author zuohongwei
 * @since 2018-12-03
 */
public interface OrgNewUnitsMapper extends HrBaseMapper<OrgNewUnits> {

	public Integer checkNameIsRepeat(Map<String, Object> params);
	
}
