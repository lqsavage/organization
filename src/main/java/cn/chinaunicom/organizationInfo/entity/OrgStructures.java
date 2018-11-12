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
@TableName("ehrcuc_org_structures")
@ApiModel("")
public class OrgStructures extends Model<OrgStructures> {

    private static final long serialVersionUID = 1L;

    @TableField("BUSINESS_GROUP_ID")
    private Integer businessGroupId;
    @TableField("STRUCTURE_NAME")
    private String structureName;
    @TableId("ORGANIZATION_ID_TOP")
    private Integer organizationIdTop;
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
    @TableField("ORGANIZATION_STRUCTURE_ID_HRMS")
    private Integer organizationStructureIdHrms;


    public Integer getBusinessGroupId() {
        return businessGroupId;
    }

    public void setBusinessGroupId(Integer businessGroupId) {
        this.businessGroupId = businessGroupId;
    }

    public String getStructureName() {
        return structureName;
    }

    public void setStructureName(String structureName) {
        this.structureName = structureName;
    }

    public Integer getOrganizationIdTop() {
        return organizationIdTop;
    }

    public void setOrganizationIdTop(Integer organizationIdTop) {
        this.organizationIdTop = organizationIdTop;
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

    public Integer getOrganizationStructureIdHrms() {
        return organizationStructureIdHrms;
    }

    public void setOrganizationStructureIdHrms(Integer organizationStructureIdHrms) {
        this.organizationStructureIdHrms = organizationStructureIdHrms;
    }

    @Override
    protected Serializable pkVal() {
        return this.organizationIdTop;
    }

    @Override
    public String toString() {
        return "OrgStructures{" +
        ", businessGroupId=" + businessGroupId +
        ", structureName=" + structureName +
        ", organizationIdTop=" + organizationIdTop +
        ", lastUpdateDate=" + lastUpdateDate +
        ", lastUpdatedBy=" + lastUpdatedBy +
        ", lastUpdateLogin=" + lastUpdateLogin +
        ", createdBy=" + createdBy +
        ", creationDate=" + creationDate +
        ", organizationStructureIdHrms=" + organizationStructureIdHrms +
        "}";
    }
}
