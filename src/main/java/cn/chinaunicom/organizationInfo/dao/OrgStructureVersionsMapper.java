package cn.chinaunicom.organizationInfo.dao;

import java.util.List;

import cn.chinaunicom.organizationInfo.entity.OrgStructureVersions;
import cn.chinaunicom.platform.dao.HrBaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-05
 */
public interface OrgStructureVersionsMapper extends HrBaseMapper<OrgStructureVersions> {
	List<OrgStructureVersions> getInitialization(int organizationIdTop);
}
