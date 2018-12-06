package cn.chinaunicom.orgInfo.dao;

import cn.chinaunicom.orgInfo.entity.OrgDetailInfo;
import cn.chinaunicom.orgInfo.entity.OrganizationInformation;
import cn.chinaunicom.platform.dao.HrBaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author wangrunpu
 * @since 2018-10-17
 */
public interface OrganizationInformationMapper extends HrBaseMapper<OrganizationInformation> {

	OrgDetailInfo getOrgBasicInfoByOrgId(@Param("orgId") int orgId);

	OrgDetailInfo getOrgLocationInfoByOrgId(@Param("orgId") int orgId);

}
