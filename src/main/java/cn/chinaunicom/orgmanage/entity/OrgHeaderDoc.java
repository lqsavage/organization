package cn.chinaunicom.orgmanage.entity;

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
 * 批文信息表
 * </p>
 *
 * @author zuohongwei
 * @since 2018-11-22
 */
@TableName("ehrcuc_org_header_doc")
@ApiModel("批文信息表")
public class OrgHeaderDoc extends Model<OrgHeaderDoc> {

    private static final long serialVersionUID = 1L;

    /**
     * 组织批文主键
     */
     @ApiModelProperty(value="组织批文主键")
    @TableId("DOC_HEADER_ID")
    private Long docHeaderId;
    /**
     * 流程实例ID
     */
     @ApiModelProperty(value="流程实例ID")
    @TableField("WORKFLOW_INSTANCE_ID")
    private String workflowInstanceId;
    /**
     * 批文编号
     */
     @ApiModelProperty(value="批文编号")
    @TableField("DOC_CODE")
    private String docCode;
    /**
     * 批文校验人
     */
     @ApiModelProperty(value="批文校验人")
    @TableField("DOC_VERIFIER")
    private String docVerifier;
    /**
     * 批文日期
     */
     @ApiModelProperty(value="批文日期")
    @TableField("DOC_DATE")
    private Date docDate;
    /**
     * 状态:E1-组织审批,E2-成本中心,E3-人事业务,E4-组织撤销,T1-等待同步,T2-同步中,T3-同步新增成功,T4-同步新增错误,T5-新建人工处理,T6-撤销人工处理,T7-撤销同步成功,S-暂存,结束-O
     */
     @ApiModelProperty(value="状态:E1-组织审批,E2-成本中心,E3-人事业务,E4-组织撤销,T1-等待同步,T2-同步中,T3-同步新增成功,T4-同步新增错误,T5-新建人工处理,T6-撤销人工处理,T7-撤销同步成功,S-暂存,结束-O")
    @TableField("DOC_STATUS")
    private String docStatus;
    /**
     * 主题
     */
     @ApiModelProperty(value="主题")
    @TableField("DOC_SUBJECT")
    private String docSubject;
    /**
     * 备注
     */
     @ApiModelProperty(value="备注")
    @TableField("DOC_DESCRIPTION")
    private String docDescription;
    @TableField("CREATE_BY")
    private Long createBy;
    @TableField("CREATE_DATE")
    private Date createDate;
    @TableField("UPDATE_BY")
    private Long updateBy;
    @TableField("UPDATE_DATE")
    private Date updateDate;
    @TableField("ATTRIBUTE1")
    private String attribute1;
    @TableField("ATTRIBUTE3")
    private String attribute3;
    @TableField("ATTRIBUTE2")
    private String attribute2;
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
    /**
     * 审批人
     */
     @ApiModelProperty(value="审批人")
    @TableField("ATTRIBUTE10")
    private String attribute10;
    /**
     * 流程发起人的根节点组织id
     */
     @ApiModelProperty(value="流程发起人的根节点组织id")
    @TableField("ROOTID")
    private Long rootid;
    /**
     * 是否有批文(有:Y,无:N)
     */
     @ApiModelProperty(value="是否有批文(有:Y,无:N)")
    @TableField("ISAPPROVE")
    private String isapprove;
    /**
     * 是否跳过人事节点：（1：跳过0：不跳过）
     */
     @ApiModelProperty(value="是否跳过人事节点：（1：跳过0：不跳过）")
    @TableField("SKIPFLAG")
    private String skipflag;
    /**
     * 业务组ID
     */
     @ApiModelProperty(value="业务组ID")
    @TableField("BUSINESS_GROUP_ID")
    private Long businessGroupId;
    @TableField("BATCH_ID")
    private String batchId;
    @TableField("NOTICE_ID")
    private String noticeId;


    public Long getDocHeaderId() {
        return docHeaderId;
    }

    public void setDocHeaderId(Long docHeaderId) {
        this.docHeaderId = docHeaderId;
    }

    public String getWorkflowInstanceId() {
        return workflowInstanceId;
    }

    public void setWorkflowInstanceId(String workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getDocVerifier() {
        return docVerifier;
    }

    public void setDocVerifier(String docVerifier) {
        this.docVerifier = docVerifier;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
    }

    public String getDocSubject() {
        return docSubject;
    }

    public void setDocSubject(String docSubject) {
        this.docSubject = docSubject;
    }

    public String getDocDescription() {
        return docDescription;
    }

    public void setDocDescription(String docDescription) {
        this.docDescription = docDescription;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
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

    public Long getRootid() {
        return rootid;
    }

    public void setRootid(Long rootid) {
        this.rootid = rootid;
    }

    public String getIsapprove() {
        return isapprove;
    }

    public void setIsapprove(String isapprove) {
        this.isapprove = isapprove;
    }

    public String getSkipflag() {
        return skipflag;
    }

    public void setSkipflag(String skipflag) {
        this.skipflag = skipflag;
    }

    public Long getBusinessGroupId() {
        return businessGroupId;
    }

    public void setBusinessGroupId(Long businessGroupId) {
        this.businessGroupId = businessGroupId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    @Override
    protected Serializable pkVal() {
        return this.docHeaderId;
    }

    @Override
    public String toString() {
        return "OrgHeaderDoc{" +
        ", docHeaderId=" + docHeaderId +
        ", workflowInstanceId=" + workflowInstanceId +
        ", docCode=" + docCode +
        ", docVerifier=" + docVerifier +
        ", docDate=" + docDate +
        ", docStatus=" + docStatus +
        ", docSubject=" + docSubject +
        ", docDescription=" + docDescription +
        ", createBy=" + createBy +
        ", createDate=" + createDate +
        ", updateBy=" + updateBy +
        ", updateDate=" + updateDate +
        ", attribute1=" + attribute1 +
        ", attribute3=" + attribute3 +
        ", attribute2=" + attribute2 +
        ", attribute4=" + attribute4 +
        ", attribute5=" + attribute5 +
        ", attribute6=" + attribute6 +
        ", attribute7=" + attribute7 +
        ", attribute8=" + attribute8 +
        ", attribute9=" + attribute9 +
        ", attribute10=" + attribute10 +
        ", rootid=" + rootid +
        ", isapprove=" + isapprove +
        ", skipflag=" + skipflag +
        ", businessGroupId=" + businessGroupId +
        ", batchId=" + batchId +
        ", noticeId=" + noticeId +
        "}";
    }
}
