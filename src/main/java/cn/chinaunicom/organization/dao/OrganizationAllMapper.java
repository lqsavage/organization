package cn.chinaunicom.organization.dao;

import java.util.List;
import java.util.Map;

import cn.chinaunicom.organization.entity.OrgTree;
import cn.chinaunicom.organization.entity.OrganizationAll;
import cn.chinaunicom.platform.dao.HrBaseMapper;

/**
 * <p>
 * 组织信息表 Mapper 接口
 * </p>
 *
 * @author zuohongwei
 * @since 2018-10-24
 */
public interface OrganizationAllMapper extends HrBaseMapper<OrganizationAll> {

	public List<OrgTree> getOrganizationTree(Map<String,Object> params);
}
