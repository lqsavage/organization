package cn.chinaunicom.orgInfo.service.impl;

import cn.chinaunicom.orgInfo.dao.OrganizationInformationMapper;
import cn.chinaunicom.orgInfo.entity.OrgDetailInfo;
import cn.chinaunicom.orgInfo.entity.OrganizationInformation;
import cn.chinaunicom.orgInfo.service.OrganizationInformationService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author wangrunpu
 * @since 2018-10-17
 */
@Service
public class OrganizationInformationServiceImpl extends HrServiceImpl<OrganizationInformationMapper, OrganizationInformation> implements OrganizationInformationService {

	@Autowired
    OrganizationInformationMapper mapper;

	@Override
	public List<OrganizationInformation> getOrganizationInformationList() {
		return mapper.selectList(new EntityWrapper<OrganizationInformation>().eq("1", "1"));
	}

	@Override
	public Integer saveOrganizationInformation(OrganizationInformation entity) {
		return mapper.insert(entity);
	}

	@Override
	public OrgDetailInfo getOrganizationInfoById(int OrgId) {
		OrgDetailInfo result=mapper.getOrgBasicInfoByOrgId(OrgId);
		OrgDetailInfo  location=mapper.getOrgLocationInfoByOrgId(OrgId);
		if(null!=location){
			if(null!=location.getLocation()){
				result.setLocation(location.getLocation());
			}
			if(null!=location.getInterOrter()){
				result.setInterOrter(location.getInterOrter());
			}
			if (null != location.getPrivince()) {
				result.setPrivince(location.getPrivince());
			}
			if(null!=location.getPostCode()){
				result.setPostCode(location.getPostCode());
			}
			if(null!=location.getLocationDetailInfo()){
				result.setLocationDetailInfo(location.getLocationDetailInfo());
			}
			if(null!=location.getNational()){
				result.setNational(location.getNational());
			}
		}
		return result;
	};

}
