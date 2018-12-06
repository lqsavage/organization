package cn.chinaunicom.orgrelation.service;

import cn.chinaunicom.orgrelation.entity.OrgRelation;
import cn.chinaunicom.platform.service.IHrService;
import java.util.List;

/**
 * <p>
 * 组织业务关系表 服务类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-12-03
 */
public interface OrgRelationService extends IHrService<OrgRelation> {

	public List<OrgRelation> getOrgRelationList();
	
	public Integer saveOrgRelation(OrgRelation entity);
	
	public Integer updateOrgRelation(OrgRelation entity);
	
	public Integer deleteOrgRelation(Long id);
	
}
