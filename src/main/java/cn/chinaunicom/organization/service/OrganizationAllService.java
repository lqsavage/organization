package cn.chinaunicom.organization.service;

import cn.chinaunicom.organization.entity.OrgTree;
import cn.chinaunicom.organization.entity.OrganizationAll;
import cn.chinaunicom.platform.service.IHrService;
import java.util.List;

/**
 * <p>
 * 组织信息表 服务类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-10-24
 */
public interface OrganizationAllService extends IHrService<OrganizationAll> {

	public List<OrganizationAll> getOrganizationAllList();
	
	public Integer saveOrganizationAll(OrganizationAll entity);
	
	public List<OrgTree> getOrganizationTree(String id,Boolean isSelf);
	
}
