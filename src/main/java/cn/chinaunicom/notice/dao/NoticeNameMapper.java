package cn.chinaunicom.notice.dao;

import java.util.List;
import java.util.Map;

import cn.chinaunicom.notice.entity.NoticeName;
import cn.chinaunicom.platform.dao.HrBaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zuohongwei
 * @since 2018-11-29
 */
public interface NoticeNameMapper extends HrBaseMapper<NoticeName> {

	public List<Map<String, Object>> searchNoticeList(String userId);
}
