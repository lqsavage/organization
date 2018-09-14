package cn.chinaunicom.func.service.impl;

import cn.chinaunicom.func.dao.FuncRegisterMapper;
import cn.chinaunicom.func.entity.FuncRegister;
import cn.chinaunicom.func.service.FuncRegisterService;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 节点注册 服务实现类
 * </p>
 *
 * @author zhw
 * @since 2018-09-12
 */
@Service
public class FuncRegisterServiceImpl extends ServiceImpl<FuncRegisterMapper, FuncRegister> implements FuncRegisterService {

	@Autowired
	FuncRegisterMapper mapper;
	
	@Override
	public List<FuncRegister> getFuncList() {
		return mapper.selectList(new EntityWrapper<FuncRegister>().eq("1", "1"));
	}

	@Override
	public Integer saveFunc(FuncRegister entity) {
		return mapper.insert(entity);
	}

}
