package cn.chinaunicom.organizationInfo.service.impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chinaunicom.organizationInfo.dao.AuthCtrlValueMapper;
import cn.chinaunicom.organizationInfo.entity.AuthCtrlValue;
import cn.chinaunicom.organizationInfo.service.AuthCtrlValueService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-05
 */
@Service
public class AuthCtrlValueServiceImpl extends HrServiceImpl<AuthCtrlValueMapper, AuthCtrlValue> implements AuthCtrlValueService {

	@Autowired
	AuthCtrlValueMapper mapper;

	@Override
	public String getTopId(@Param("login_name") String login_name, @Param("respId") String resp_id) {
		return mapper.getTopId(login_name, resp_id);
	}

}
