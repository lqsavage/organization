package cn.chinaunicom.notice.service.impl;

import cn.chinaunicom.notice.entity.NoticeName;
import cn.chinaunicom.notice.dao.NoticeNameMapper;
import cn.chinaunicom.notice.service.NoticeNameService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-11-29
 */
@Service
public class NoticeNameServiceImpl extends HrServiceImpl<NoticeNameMapper, NoticeName> implements NoticeNameService {

	@Autowired
	NoticeNameMapper mapper;
	
	@Override
	public List<NoticeName> getNoticeNameList() {
		return mapper.selectList(new EntityWrapper<NoticeName>().eq("1", "1"));
	}

	@Override
	public Integer saveNoticeName(NoticeName entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updateNoticeName(NoticeName entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deleteNoticeName(Long id) {
		return mapper.deleteById(id);
	}

	@Override
	public List<Map<String, Object>> searchNoticeList(String userId) {
		return mapper.searchNoticeList(userId);
	}
}
