package cn.chinaunicom.organization.service.impl;

import cn.chinaunicom.organization.entity.OrgTree;
import cn.chinaunicom.organization.entity.OrganizationAll;
import cn.chinaunicom.organization.dao.OrganizationAllMapper;
import cn.chinaunicom.organization.service.OrganizationAllService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 * 组织信息表 服务实现类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-10-24
 */
@Service
public class OrganizationAllServiceImpl extends HrServiceImpl<OrganizationAllMapper, OrganizationAll> implements OrganizationAllService {

	@Autowired
	OrganizationAllMapper mapper;
	
	@Override
	public List<OrganizationAll> getOrganizationAllList() {
		return mapper.selectList(new EntityWrapper<OrganizationAll>().eq("1", "1"));
	}

	@Override
	public Integer saveOrganizationAll(OrganizationAll entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updateOrganizationAll(OrganizationAll entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deleteOrganizationAll(Long id) {
		return mapper.deleteById(id);
	}
	
	@Override
	public List<OrgTree> getOrganizationTree(String id, Boolean isSelf) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("id", id);
		params.put("isSelf", isSelf?"Y":"N");
		List<OrgTree> list = mapper.getOrganizationTree(params);
		if(list.size()>0) {
			for (OrgTree orgTree : list)
			{
				orgTree.setKey(orgTree.getValue());
			}
			return list;
		}
		return null;
	}
}
