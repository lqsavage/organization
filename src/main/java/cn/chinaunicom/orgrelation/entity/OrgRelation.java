package cn.chinaunicom.orgrelation.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 组织业务关系表
 * </p>
 *
 * @author zuohongwei
 * @since 2018-12-03
 */
@TableName("ehrcuc_org_relation")
@ApiModel("组织业务关系表")
public class OrgRelation extends Model<OrgRelation> {

    private static final long serialVersionUID = 1L;

    /**
     * 变更业务关系ID
     */
     @ApiModelProperty(value="变更业务关系ID")
    @TableId("R_CHANGE_ID")
    private Long rChangeId;
    /**
     * 批文ID
     */
     @ApiModelProperty(value="批文ID")
    @TableField("DOC_HEADER_ID")
    private Long docHeaderId;
    /**
     * 变更主业务类型：新增A，合并H，更名U，撤销D
     */
     @ApiModelProperty(value="变更主业务类型：新增A，合并H，更名U，撤销D")
    @TableField("M_TYPE_CODE")
    private String mTypeCode;
    /**
     * 变更明细业务类型:A新增 合并新增H-N 合并旧组织H-O 撤销D 更名U
     */
     @ApiModelProperty(value="变更明细业务类型:A新增 合并新增H-N 合并旧组织H-O 撤销D 更名U")
    @TableField("D_TYPE_CODE")
    private String dTypeCode;
    /**
     * 备注
     */
     @ApiModelProperty(value="备注")
    @TableField("RELA_DESCRIPTION")
    private String relaDescription;
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
    @TableField("ATTRIBUTE10")
    private String attribute10;


    public Long getrChangeId() {
        return rChangeId;
    }

    public void setrChangeId(Long rChangeId) {
        this.rChangeId = rChangeId;
    }

    public Long getDocHeaderId() {
        return docHeaderId;
    }

    public void setDocHeaderId(Long docHeaderId) {
        this.docHeaderId = docHeaderId;
    }

    public String getmTypeCode() {
        return mTypeCode;
    }

    public void setmTypeCode(String mTypeCode) {
        this.mTypeCode = mTypeCode;
    }

    public String getdTypeCode() {
        return dTypeCode;
    }

    public void setdTypeCode(String dTypeCode) {
        this.dTypeCode = dTypeCode;
    }

    public String getRelaDescription() {
        return relaDescription;
    }

    public void setRelaDescription(String relaDescription) {
        this.relaDescription = relaDescription;
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

    @Override
    protected Serializable pkVal() {
        return this.rChangeId;
    }

    @Override
    public String toString() {
        return "OrgRelation{" +
        ", rChangeId=" + rChangeId +
        ", docHeaderId=" + docHeaderId +
        ", mTypeCode=" + mTypeCode +
        ", dTypeCode=" + dTypeCode +
        ", relaDescription=" + relaDescription +
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
        "}";
    }
}
