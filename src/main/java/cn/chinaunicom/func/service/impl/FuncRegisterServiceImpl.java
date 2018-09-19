package cn.chinaunicom.func.service.impl;

import cn.chinaunicom.func.entity.FuncRegister;
import cn.chinaunicom.func.dao.FuncRegisterMapper;
import cn.chinaunicom.func.service.FuncRegisterService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 * 节点注册 服务实现类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-09-17
 */
@Service
public class FuncRegisterServiceImpl extends HrServiceImpl<FuncRegisterMapper, FuncRegister> implements FuncRegisterService {

	@Autowired
	FuncRegisterMapper mapper;
	
	@Override
	public List<FuncRegister> getFuncRegisterList() {
		return mapper.selectList(new EntityWrapper<FuncRegister>().eq("1", "1"));
	}

	@Override
	public Integer saveFuncRegister(FuncRegister entity) {
		return mapper.insert(entity);
	}
}
