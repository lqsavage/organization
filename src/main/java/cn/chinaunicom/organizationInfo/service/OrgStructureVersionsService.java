package cn.chinaunicom.organizationInfo.service;

import java.util.List;

import cn.chinaunicom.organizationInfo.entity.OrgStructureVersions;
import cn.chinaunicom.platform.service.IHrService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-05
 */
public interface OrgStructureVersionsService extends IHrService<OrgStructureVersions> {
	List<OrgStructureVersions> getInitialization(int organizationIdTop);
}
