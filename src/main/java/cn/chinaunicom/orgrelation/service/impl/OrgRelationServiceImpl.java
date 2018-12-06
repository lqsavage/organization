package cn.chinaunicom.orgrelation.service.impl;

import cn.chinaunicom.orgrelation.entity.OrgRelation;
import cn.chinaunicom.orgrelation.dao.OrgRelationMapper;
import cn.chinaunicom.orgrelation.service.OrgRelationService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 * 组织业务关系表 服务实现类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-12-03
 */
@Service
public class OrgRelationServiceImpl extends HrServiceImpl<OrgRelationMapper, OrgRelation> implements OrgRelationService {

	@Autowired
	OrgRelationMapper mapper;
	
	@Override
	public List<OrgRelation> getOrgRelationList() {
		return mapper.selectList(new EntityWrapper<OrgRelation>().eq("1", "1"));
	}

	@Override
	public Integer saveOrgRelation(OrgRelation entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updateOrgRelation(OrgRelation entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deleteOrgRelation(Long id) {
		return mapper.deleteById(id);
	}
}
