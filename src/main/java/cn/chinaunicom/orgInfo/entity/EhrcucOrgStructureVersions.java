package cn.chinaunicom.orgInfo.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangrunpu
 * @since 2018-10-29
 */
@TableName("ehrcuc_org_structure_versions")
@ApiModel("")
public class EhrcucOrgStructureVersions extends Model<EhrcucOrgStructureVersions> {

	private static final long	serialVersionUID	= 1L;

	@TableId("ORG_STRUCTURE_VERSION_ID_EHR")
	private Integer				orgStructureVersionIdEhr;
	@TableField("BUSINESS_GROUP_ID")
	private Integer				businessGroupId;
	@TableField("ORGANIZATION_ID_TOP")
	private Integer				organizationIdTop;
	@TableField("DATE_FROM")
	private String				dateFrom;
	@TableField("DATE_TO")
	private String				dateTo;
	@TableField("VERSION_NUMBER")
	private Integer				versionNumber;
	@TableField("NEW_VERSION_FLAG")
	private String				newVersionFlag;
	/**
	 * N���޸�.Pͬ����.Oͬ�����.
	 */
	@ApiModelProperty(
			value = "N���޸�.Pͬ����.Oͬ�����.")
	@TableField("STATUS")
	private String				status;
	@TableField("LAST_UPDATE_REQUEST_ID")
	private BigDecimal			lastUpdateRequestId;
	@TableField("ORG_STRUCTURE_VERSION_ID_HRMS")
	private BigDecimal			orgStructureVersionIdHrms;
	@TableField("LAST_UPDATE_DATE")
	private Date				lastUpdateDate;
	@TableField("LAST_UPDATED_BY")
	private BigDecimal			lastUpdatedBy;
	@TableField("LAST_UPDATE_LOGIN")
	private BigDecimal			lastUpdateLogin;
	@TableField("CREATED_BY")
	private BigDecimal			createdBy;
	@TableField("CREATION_DATE")
	private Date				creationDate;
	@TableField("CREATION_REQUEST_ID")
	private BigDecimal			creationRequestId;

	public Integer getOrgStructureVersionIdEhr() {
		return orgStructureVersionIdEhr;
	}

	public void setOrgStructureVersionIdEhr(Integer orgStructureVersionIdEhr) {
		this.orgStructureVersionIdEhr = orgStructureVersionIdEhr;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return businessGroupId
	 *
	 */
	public Integer getBusinessGroupId() {
		return businessGroupId;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param businessGroupId
	 *            参数businessGroupId
	 *
	 */
	public void setBusinessGroupId(Integer businessGroupId) {
		this.businessGroupId = businessGroupId;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return organizationIdTop
	 *
	 */
	public Integer getOrganizationIdTop() {
		return organizationIdTop;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param organizationIdTop
	 *            参数organizationIdTop
	 *
	 */
	public void setOrganizationIdTop(Integer organizationIdTop) {
		this.organizationIdTop = organizationIdTop;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return dateFrom
	 *
	 */
	public String getDateFrom() {
		return dateFrom;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param dateFrom
	 *            参数dateFrom
	 *
	 */
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return dateTo
	 *
	 */
	public String getDateTo() {
		return dateTo;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param dateTo
	 *            参数dateTo
	 *
	 */
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return versionNumber
	 *
	 */
	public Integer getVersionNumber() {
		return versionNumber;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param versionNumber
	 *            参数versionNumber
	 *
	 */
	public void setVersionNumber(Integer versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getNewVersionFlag() {
		return newVersionFlag;
	}

	public void setNewVersionFlag(String newVersionFlag) {
		this.newVersionFlag = newVersionFlag;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getLastUpdateRequestId() {
		return lastUpdateRequestId;
	}

	public void setLastUpdateRequestId(BigDecimal lastUpdateRequestId) {
		this.lastUpdateRequestId = lastUpdateRequestId;
	}

	public BigDecimal getOrgStructureVersionIdHrms() {
		return orgStructureVersionIdHrms;
	}

	public void setOrgStructureVersionIdHrms(BigDecimal orgStructureVersionIdHrms) {
		this.orgStructureVersionIdHrms = orgStructureVersionIdHrms;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public BigDecimal getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public BigDecimal getLastUpdateLogin() {
		return lastUpdateLogin;
	}

	public void setLastUpdateLogin(BigDecimal lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}

	public BigDecimal getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public BigDecimal getCreationRequestId() {
		return creationRequestId;
	}

	public void setCreationRequestId(BigDecimal creationRequestId) {
		this.creationRequestId = creationRequestId;
	}

	@Override
	protected Serializable pkVal() {
		return this.orgStructureVersionIdEhr;
	}

	@Override
	public String toString() {
		return "EhrcucOrgStructureVersions{" + ", orgStructureVersionIdEhr=" + orgStructureVersionIdEhr + ", businessGroupId=" + businessGroupId + ", organizationIdTop=" + organizationIdTop
				+ ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", versionNumber=" + versionNumber + ", newVersionFlag=" + newVersionFlag + ", status=" + status + ", lastUpdateRequestId="
				+ lastUpdateRequestId + ", orgStructureVersionIdHrms=" + orgStructureVersionIdHrms + ", lastUpdateDate=" + lastUpdateDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateLogin="
				+ lastUpdateLogin + ", createdBy=" + createdBy + ", creationDate=" + creationDate + ", creationRequestId=" + creationRequestId + "}";
	}
}
