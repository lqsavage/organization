package cn.chinaunicom.orgInfo.dao;

import cn.chinaunicom.orgInfo.entity.EhrcucOrgStructureVersions;
import cn.chinaunicom.platform.dao.HrBaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author wangrunpu
 * @since 2018-10-29
 */
public interface EhrcucOrgStructureVersionsMapper extends HrBaseMapper<EhrcucOrgStructureVersions> {

	EhrcucOrgStructureVersions selectVerInfoById(@Param("Vid") int Vid);

}
