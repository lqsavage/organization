package cn.chinaunicom.orgmanage.service.impl;

import cn.chinaunicom.orgmanage.entity.OrgNewUnits;
import cn.chinaunicom.orgmanage.dao.OrgNewUnitsMapper;
import cn.chinaunicom.orgmanage.service.OrgNewUnitsService;
import cn.chinaunicom.orgrelation.dao.OrgRelationMapper;
import cn.chinaunicom.orgrelation.entity.OrgRelation;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 * 组织增加业务表 服务实现类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-12-03
 */
@Service
public class OrgNewUnitsServiceImpl extends HrServiceImpl<OrgNewUnitsMapper, OrgNewUnits> implements OrgNewUnitsService {

	@Autowired
	OrgNewUnitsMapper mapper;
	@Autowired
	OrgRelationMapper relationMapper;
	
	@Override
	public List<OrgNewUnits> getOrgNewUnitsList() {
		return mapper.selectList(new EntityWrapper<OrgNewUnits>().eq("1", "1"));
	}

	@Transactional
	@Override
	public Integer saveOrgNewUnits(OrgNewUnits entity,OrgRelation relationInfo) {
		//根据批文id查询是否有新增
		List<OrgRelation> relInfo = relationMapper.selectList(new EntityWrapper<OrgRelation>()
				.eq("DOC_HEADER_ID", relationInfo.getDocHeaderId())
				.eq("M_TYPE_CODE", relationInfo.getmTypeCode()).eq("D_TYPE_CODE", relationInfo.getdTypeCode()));
		if(relInfo != null && relInfo.size()>0){
			entity.setrChangeId(relInfo.get(0).getrChangeId());
		}else{
			//插入新增记录关系
			relationMapper.insert(relationInfo);
			entity.setrChangeId(relationInfo.getrChangeId());
		}
		//插入新增组织信息
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updateOrgNewUnits(OrgNewUnits entity,OrgRelation relationInfo) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deleteOrgNewUnits(Long id) {
		return mapper.deleteById(id);
	}
	
	@Override
	public Integer checkNameIsRepeat(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}
}
