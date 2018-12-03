package cn.chinaunicom.orgmanage.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import cn.chinaunicom.orgmanage.entity.OrgHeaderDoc;
import cn.chinaunicom.platform.dao.HrBaseMapper;

/**
 * <p>
 * 批文信息表 Mapper 接口
 * </p>
 *
 * @author zuohongwei
 * @since 2018-11-22
 */
public interface OrgHeaderDocMapper extends HrBaseMapper<OrgHeaderDoc> {

	/**
	 * 
	*描述: 查询组织新增列表
	*@param rowBounds
	*@param params
	*@return List<Map<String,Object>>
	 */
	List<Map<String, Object>> searchOrgCreateInfo(RowBounds rowBounds, Map params);
	
	/**
	 * 
	*描述: 查询组织合并列表
	*@param rowBounds
	*@param params
	*@return List<Map<String,Object>>
	 */
	List<Map<String, Object>> searchOrgMergeInfo(RowBounds rowBounds, Map params);
	
	/**
	 * 
	*描述: 查询组织更名列表
	*@param rowBounds
	*@param params
	*@return List<Map<String,Object>>
	 */
	List<Map<String, Object>> searchOrgRenameInfo(RowBounds rowBounds, Map params);
	
	/**
	 * 
	*描述: 查询组织撤销列表
	*@param rowBounds
	*@param params
	*@return List<Map<String,Object>>
	 */
	List<Map<String, Object>> searchOrgDeleteInfo(RowBounds rowBounds, Map params);
	
}
