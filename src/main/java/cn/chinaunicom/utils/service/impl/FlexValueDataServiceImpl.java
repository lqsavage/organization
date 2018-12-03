package cn.chinaunicom.utils.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import cn.chinaunicom.utils.dao.FlexValueDataMapper;
import cn.chinaunicom.utils.entity.FlexValueData;
import cn.chinaunicom.utils.service.FlexValueDataService;

/**
 * @author zuohongwei
 * @since 2018-10-24
 */
@Service
public class FlexValueDataServiceImpl extends HrServiceImpl<FlexValueDataMapper, FlexValueData> implements FlexValueDataService {

	@Autowired
	FlexValueDataMapper mapper;

	@Override
	public List<FlexValueData> getData(String type) {
		List<FlexValueData> arrayList = mapper.getData(type);
		return arrayList;
	}
}
