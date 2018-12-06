package cn.chinaunicom.orgInfo.service;

import cn.chinaunicom.orgInfo.entity.OrgDetailInfo;
import cn.chinaunicom.orgInfo.entity.OrganizationInformation;
import cn.chinaunicom.platform.service.IHrService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wangrunpu
 * @since 2018-10-17
 */
public interface OrganizationInformationService extends IHrService<OrganizationInformation> {

	public List<OrganizationInformation> getOrganizationInformationList();

	public Integer saveOrganizationInformation(OrganizationInformation entity);

	public OrgDetailInfo getOrganizationInfoById(int OrgId);

}
