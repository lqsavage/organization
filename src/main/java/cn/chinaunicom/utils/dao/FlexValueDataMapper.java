package cn.chinaunicom.utils.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import cn.chinaunicom.platform.dao.HrBaseMapper;
import cn.chinaunicom.utils.entity.FlexValueData;

/**
 *
 * @author zuohongwei
 * @since 2018-10-24
 */
public interface FlexValueDataMapper extends HrBaseMapper<FlexValueData> {

	@Value("select ffv.flex_value as id,ffv.flex_value as title from FND_FLEX_VALUE_SETS s, " + 
			"where ffv.flex_value_set_id=s.flex_value_set_id " + 
			"			and s.flex_value_set_name = #{type}" + 
			"			 and IFNULL(ffv.ENABLED_FLAG, 'N') = 'Y' " + 
			"		   and IFNULL(ffv.SUMMARY_FLAG, 'N') = 'N' " + 
			" and  DATE_FORMAT(sysdate(), '%Y-%m-%d') between DATE_FORMAT(IFNULL(ffv.START_DATE_ACTIVE,sysdate()), '%Y-%m-%d') and DATE_FORMAT(IFNULL(ffv.END_DATE_ACTIVE, sysdate()), '%Y-%m-%d')")
	public List<FlexValueData> getData(String type);
}
