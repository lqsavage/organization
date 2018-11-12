package cn.chinaunicom.organizationInfo.dao;

import org.apache.ibatis.annotations.Param;

import cn.chinaunicom.organizationInfo.entity.AuthCtrlValue;
import cn.chinaunicom.platform.dao.HrBaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-05
 */
public interface AuthCtrlValueMapper extends HrBaseMapper<AuthCtrlValue> {
	/**
	 * 
	 * 描述: 获取顶级id
	 * 
	 * @param login_name
	 * @param resp_id
	 * @return String
	 */
	String getTopId(@Param("login_name") String login_name, @Param("respId") String resp_id);
}
