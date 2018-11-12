package cn.chinaunicom.organizationInfo.service;

import org.apache.ibatis.annotations.Param;

import cn.chinaunicom.organizationInfo.entity.AuthCtrlValue;
import cn.chinaunicom.platform.service.IHrService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-05
 */
public interface AuthCtrlValueService extends IHrService<AuthCtrlValue> {

	String getTopId(@Param("login_name") String login_name, @Param("respId") String resp_id);

}
