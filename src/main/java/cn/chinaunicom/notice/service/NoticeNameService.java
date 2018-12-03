package cn.chinaunicom.notice.service;

import cn.chinaunicom.notice.entity.NoticeName;
import cn.chinaunicom.platform.service.IHrService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-11-29
 */
public interface NoticeNameService extends IHrService<NoticeName> {

	public List<NoticeName> getNoticeNameList();
	
	public Integer saveNoticeName(NoticeName entity);
	
	public Integer updateNoticeName(NoticeName entity);
	
	public Integer deleteNoticeName(Long id);
	
	public List<Map<String, Object>> searchNoticeList(String userId);
	
}
