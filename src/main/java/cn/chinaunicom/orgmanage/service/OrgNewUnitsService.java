package cn.chinaunicom.orgmanage.service;

import cn.chinaunicom.orgmanage.entity.OrgNewUnits;
import cn.chinaunicom.orgrelation.entity.OrgRelation;
import cn.chinaunicom.platform.service.IHrService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 组织增加业务表 服务类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-12-03
 */
public interface OrgNewUnitsService extends IHrService<OrgNewUnits> {

	public List<OrgNewUnits> getOrgNewUnitsList();
	
	public Integer saveOrgNewUnits(OrgNewUnits entity,OrgRelation relationInfo);
	
	public Integer updateOrgNewUnits(OrgNewUnits entity,OrgRelation relationInfo);
	
	public Integer deleteOrgNewUnits(Long id);
	
	public Integer checkNameIsRepeat(Map<String, Object> params);
	
	public List<Map<String,Object>> checkOrgIsDelete(Map<String, Object> params);
	
}
