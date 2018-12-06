package cn.chinaunicom.orgInfo.service.impl;

import cn.chinaunicom.orgInfo.dao.EhrcucOrgStructureVersionsMapper;
import cn.chinaunicom.orgInfo.entity.EhrcucOrgStructureVersions;
import cn.chinaunicom.orgInfo.service.EhrcucOrgStructureVersionsService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author wangrunpu
 * @since 2018-10-29
 */
@Service
public class EhrcucOrgStructureVersionsServiceImpl extends HrServiceImpl<EhrcucOrgStructureVersionsMapper, EhrcucOrgStructureVersions> implements EhrcucOrgStructureVersionsService {

	@Resource
    EhrcucOrgStructureVersionsMapper mapper;

	@Override
	public List<EhrcucOrgStructureVersions> getEhrcucOrgStructureVersionsList() {
		return mapper.selectList(new EntityWrapper<EhrcucOrgStructureVersions>().eq("1", "1"));
	}

	@Override
	public Integer saveEhrcucOrgStructureVersions(EhrcucOrgStructureVersions entity) {
		return mapper.insert(entity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EhrcucOrgStructureVersions selectVerInfoById(int Vid) {
		// TODO Auto-generated method stub
		return mapper.selectVerInfoById(Vid);
	}

	/*
	 * @Override public List<Integer> selectAllVerId() {
	 * List<EhrcucOrgStructureVersions> result = mapper.selectAllVerId();
	 * List<Integer> vids = new ArrayList<Integer>(); for (int i = 0; i <
	 * result.size() - 1; i++) {
	 * vids.add(result.get(i).getOrgStructureVersionIdEhr()); } return vids; }
	 */

}
