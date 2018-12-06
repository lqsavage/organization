package cn.chinaunicom.orgInfo.service;

import cn.chinaunicom.orgInfo.entity.EhrcucOrgStructureVersions;
import cn.chinaunicom.platform.service.IHrService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wangrunpu
 * @since 2018-10-29
 */
public interface EhrcucOrgStructureVersionsService extends IHrService<EhrcucOrgStructureVersions> {

	public List<EhrcucOrgStructureVersions> getEhrcucOrgStructureVersionsList();

	public Integer saveEhrcucOrgStructureVersions(EhrcucOrgStructureVersions entity);

	public EhrcucOrgStructureVersions selectVerInfoById(int Vid);

}
