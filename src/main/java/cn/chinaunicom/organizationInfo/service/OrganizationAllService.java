package cn.chinaunicom.organizationInfo.service;

import java.util.List;
import java.util.Map;

import cn.chinaunicom.organizationInfo.entity.OrganizationAll;
import cn.chinaunicom.platform.service.IHrService;

/**
 * <p>
 * 组织信息表 服务类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-05
 */
public interface OrganizationAllService extends IHrService<OrganizationAll> {
	List<OrganizationAll> getExcelTreeData(Map<String, Object> map);

	OrganizationAll getData(Map<String, Object> map);

	List<OrganizationAll> getAllData(Map<String, Object> map);
}
