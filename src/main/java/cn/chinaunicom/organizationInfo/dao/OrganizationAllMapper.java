package cn.chinaunicom.organizationInfo.dao;

import java.util.List;
import java.util.Map;

import cn.chinaunicom.organizationInfo.entity.OrganizationAll;
import cn.chinaunicom.platform.dao.HrBaseMapper;

/**
 * <p>
 * 组织信息表 Mapper 接口
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-05
 */
public interface OrganizationAllMapper extends HrBaseMapper<OrganizationAll> {
	List<OrganizationAll> getExcelTreeData(Map<String, Object> map);

	OrganizationAll getData(Map<String, Object> map);
}
