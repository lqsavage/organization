package cn.chinaunicom.utils.service;

import java.util.List;

import cn.chinaunicom.platform.service.IHrService;
import cn.chinaunicom.utils.entity.FlexValueData;

/**
 * @author zuohongwei
 * @since 2018-10-24
 */
public interface FlexValueDataService extends IHrService<FlexValueData> {

	public List<FlexValueData> getData(String type);

}
