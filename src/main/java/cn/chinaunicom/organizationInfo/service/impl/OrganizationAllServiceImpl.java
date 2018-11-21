package cn.chinaunicom.organizationInfo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chinaunicom.organizationInfo.dao.OrganizationAllMapper;
import cn.chinaunicom.organizationInfo.entity.OrganizationAll;
import cn.chinaunicom.organizationInfo.service.OrganizationAllService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

/**
 * <p>
 * 组织信息表 服务实现类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-05
 */
@Service
public class OrganizationAllServiceImpl extends HrServiceImpl<OrganizationAllMapper, OrganizationAll> implements OrganizationAllService {

	@Autowired
	OrganizationAllMapper mapper;

	@Override
	public List<OrganizationAll> getExcelTreeData(Map<String, Object> map) {
		return mapper.getExcelTreeData(map);
	}

	@Override
	public OrganizationAll getData(Map<String, Object> map) {
		return mapper.getData(map);
	}

	@Override
	public List<OrganizationAll> getAllData(Map<String, Object> map) {
		OrganizationAll organizationAll = mapper.getData(map);
		List<OrganizationAll> orgList = new ArrayList<OrganizationAll>();
		orgList.add(organizationAll);
		ArrayList<String> idList = new ArrayList<String>();
		idList.add(map.get("organizationId").toString());
		map.put("ids", idList);
		List<OrganizationAll> excelTreeData = mapper.getExcelTreeData(map);
		orgList.addAll(excelTreeData);
		if (excelTreeData.size() > 0)
		{
			setChildrenList(map, excelTreeData, orgList);
		}
		return orgList;
	}

	private void setChildrenList(Map<String, Object> map, List<OrganizationAll> excelTreeData, List<OrganizationAll> orgList) {
		List<String> keyList = new ArrayList<String>();
		for (OrganizationAll organizationAll : excelTreeData)
		{
			keyList.add(String.valueOf(organizationAll.getOrganizationId()));
		}
		map.put("ids", keyList);
		List<OrganizationAll> excelTreeDataPlus = mapper.getExcelTreeData(map);
		orgList.addAll(excelTreeDataPlus);
		if (excelTreeDataPlus.size() > 0)
		{
			setChildrenList(map, excelTreeDataPlus, orgList);
		}

	}

}
