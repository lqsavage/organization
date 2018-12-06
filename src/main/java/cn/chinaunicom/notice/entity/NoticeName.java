package cn.chinaunicom.notice.entity;

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
 * @author zuohongwei
 * @since 2018-11-29
 */
@TableName("ehrbase_notice_name")
@ApiModel("")
public class NoticeName extends Model<NoticeName> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
     @ApiModelProperty(value="主键")
    @TableId("NOTICE_NAME_ID")
    private Long noticeNameId;
    /**
     * 办理人员id
     */
     @ApiModelProperty(value="办理人员id")
    @TableField("NOTICE_NAME")
    private String noticeName;
    /**
     * 业务类型
     */
     @ApiModelProperty(value="业务类型")
    @TableField("BUSINESS_TYPE")
    private String businessType;
    @TableField("ATTRIBUTE1")
    private String attribute1;
    @TableField("ATTRIBUTE2")
    private String attribute2;
    @TableField("ATTRIBUTE3")
    private String attribute3;
    @TableField("ATTRIBUTE4")
    private String attribute4;
    @TableField("ATTRIBUTE5")
    private String attribute5;
    @TableField("ATTRIBUTE6")
    private String attribute6;
    @TableField("ATTRIBUTE7")
    private String attribute7;
    @TableField("ATTRIBUTE8")
    private String attribute8;
    @TableField("ATTRIBUTE9")
    private String attribute9;
    @TableField("ATTRIBUTE10")
    private String attribute10;
    /**
     * 修改时间
     */
     @ApiModelProperty(value="修改时间")
    @TableField("LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    /**
     * 修改人
     */
     @ApiModelProperty(value="修改人")
    @TableField("LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    /**
     * 创建人
     */
     @ApiModelProperty(value="创建人")
    @TableField("CREATED_BY")
    private Long createdBy;
    /**
     * 创建时间
     */
     @ApiModelProperty(value="创建时间")
    @TableField("CREATION_DATE")
    private Date creationDate;
    /**
     * 组织id
     */
     @ApiModelProperty(value="组织id")
    @TableField("CTRL_ORG_ID")
    private Long ctrlOrgId;
    /**
     * 职责id
     */
     @ApiModelProperty(value="职责id")
    @TableField("RESP_ID")
    private Long respId;
    /**
     * 删除（1删除）
     */
     @ApiModelProperty(value="删除（1删除）")
    @TableField("DELETE_FLAG")
    private String deleteFlag;


    public Long getNoticeNameId() {
        return noticeNameId;
    }

    public void setNoticeNameId(Long noticeNameId) {
        this.noticeNameId = noticeNameId;
    }

    public String getNoticeName() {
        return noticeName;
    }

    public void setNoticeName(String noticeName) {
        this.noticeName = noticeName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getCtrlOrgId() {
        return ctrlOrgId;
    }

    public void setCtrlOrgId(Long ctrlOrgId) {
        this.ctrlOrgId = ctrlOrgId;
    }

    public Long getRespId() {
        return respId;
    }

    public void setRespId(Long respId) {
        this.respId = respId;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    protected Serializable pkVal() {
        return this.noticeNameId;
    }

    @Override
    public String toString() {
        return "NoticeName{" +
        ", noticeNameId=" + noticeNameId +
        ", noticeName=" + noticeName +
        ", businessType=" + businessType +
        ", attribute1=" + attribute1 +
        ", attribute2=" + attribute2 +
        ", attribute3=" + attribute3 +
        ", attribute4=" + attribute4 +
        ", attribute5=" + attribute5 +
        ", attribute6=" + attribute6 +
        ", attribute7=" + attribute7 +
        ", attribute8=" + attribute8 +
        ", attribute9=" + attribute9 +
        ", attribute10=" + attribute10 +
        ", lastUpdateDate=" + lastUpdateDate +
        ", lastUpdatedBy=" + lastUpdatedBy +
        ", createdBy=" + createdBy +
        ", creationDate=" + creationDate +
        ", ctrlOrgId=" + ctrlOrgId +
        ", respId=" + respId +
        ", deleteFlag=" + deleteFlag +
        "}";
    }
}
