package cn.chinaunicom.organizationInfo.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-05
 */
@TableName("ehrcuc_org_structure_versions")
@ApiModel("")
public class OrgStructureVersions extends Model<OrgStructureVersions> {

    private static final long serialVersionUID = 1L;

    @TableId("ORG_STRUCTURE_VERSION_ID_EHR")
    private Integer orgStructureVersionIdEhr;
    @TableField("BUSINESS_GROUP_ID")
    private Integer businessGroupId;
    @TableField("ORGANIZATION_ID_TOP")
    private Integer organizationIdTop;
    @TableField("DATE_FROM")
    private Date dateFrom;
    @TableField("DATE_TO")
    private Date dateTo;
    @TableField("VERSION_NUMBER")
    private Integer versionNumber;
    @TableField("NEW_VERSION_FLAG")
    private String newVersionFlag;
    /**
     * N已修改.P同步中.O同步完成.
     */
     @ApiModelProperty(value="N已修改.P同步中.O同步完成.")
    @TableField("STATUS")
    private String status;
    @TableField("LAST_UPDATE_REQUEST_ID")
    private Integer lastUpdateRequestId;
    @TableField("ORG_STRUCTURE_VERSION_ID_HRMS")
    private Integer orgStructureVersionIdHrms;
    @TableField("LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @TableField("LAST_UPDATED_BY")
    private Integer lastUpdatedBy;
    @TableField("LAST_UPDATE_LOGIN")
    private Integer lastUpdateLogin;
    @TableField("CREATED_BY")
    private Integer createdBy;
    @TableField("CREATION_DATE")
    private Date creationDate;
    @TableField("CREATION_REQUEST_ID")
    private Integer creationRequestId;


    public Integer getOrgStructureVersionIdEhr() {
        return orgStructureVersionIdEhr;
    }

    public void setOrgStructureVersionIdEhr(Integer orgStructureVersionIdEhr) {
        this.orgStructureVersionIdEhr = orgStructureVersionIdEhr;
    }

    public Integer getBusinessGroupId() {
        return businessGroupId;
    }

    public void setBusinessGroupId(Integer businessGroupId) {
        this.businessGroupId = businessGroupId;
    }

    public Integer getOrganizationIdTop() {
        return organizationIdTop;
    }

    public void setOrganizationIdTop(Integer organizationIdTop) {
        this.organizationIdTop = organizationIdTop;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Integer getVersionNumber() {
        return versionNumber;
    }

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

    public Integer getLastUpdateRequestId() {
        return lastUpdateRequestId;
    }

    public void setLastUpdateRequestId(Integer lastUpdateRequestId) {
        this.lastUpdateRequestId = lastUpdateRequestId;
    }

    public Integer getOrgStructureVersionIdHrms() {
        return orgStructureVersionIdHrms;
    }

    public void setOrgStructureVersionIdHrms(Integer orgStructureVersionIdHrms) {
        this.orgStructureVersionIdHrms = orgStructureVersionIdHrms;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Integer lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Integer getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateLogin(Integer lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getCreationRequestId() {
        return creationRequestId;
    }

    public void setCreationRequestId(Integer creationRequestId) {
        this.creationRequestId = creationRequestId;
    }

    @Override
    protected Serializable pkVal() {
        return this.orgStructureVersionIdEhr;
    }

    @Override
    public String toString() {
        return "OrgStructureVersions{" +
        ", orgStructureVersionIdEhr=" + orgStructureVersionIdEhr +
        ", businessGroupId=" + businessGroupId +
        ", organizationIdTop=" + organizationIdTop +
        ", dateFrom=" + dateFrom +
        ", dateTo=" + dateTo +
        ", versionNumber=" + versionNumber +
        ", newVersionFlag=" + newVersionFlag +
        ", status=" + status +
        ", lastUpdateRequestId=" + lastUpdateRequestId +
        ", orgStructureVersionIdHrms=" + orgStructureVersionIdHrms +
        ", lastUpdateDate=" + lastUpdateDate +
        ", lastUpdatedBy=" + lastUpdatedBy +
        ", lastUpdateLogin=" + lastUpdateLogin +
        ", createdBy=" + createdBy +
        ", creationDate=" + creationDate +
        ", creationRequestId=" + creationRequestId +
        "}";
    }
}
