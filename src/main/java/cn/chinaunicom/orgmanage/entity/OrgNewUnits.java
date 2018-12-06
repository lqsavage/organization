package cn.chinaunicom.orgmanage.entity;

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
 * 组织增加业务表
 * </p>
 *
 * @author zuohongwei
 * @since 2018-12-03
 */
@TableName("ehrcuc_org_new_units")
@ApiModel("组织增加业务表")
public class OrgNewUnits extends Model<OrgNewUnits> {

    private static final long serialVersionUID = 1L;

    /**
     * 平台组织ID
     */
     @ApiModelProperty(value="平台组织ID")
    @TableId("T_ORG_ID")
    private Long tOrgId;
    /**
     * 变更业务关系ID
     */
     @ApiModelProperty(value="变更业务关系ID")
    @TableField("R_CHANGE_ID")
    private Long rChangeId;
    /**
     * 批文ID
     */
     @ApiModelProperty(value="批文ID")
    @TableField("DOC_HEADER_ID")
    private Long docHeaderId;
    /**
     * 平台组织ID对应的父ID
     */
     @ApiModelProperty(value="平台组织ID对应的父ID")
    @TableField("PARENT_ORG_ID")
    private Long parentOrgId;
    /**
     * 新增明细类型: 新增-A 合并新增-H 更名-U
     */
     @ApiModelProperty(value="新增明细类型: 新增-A 合并新增-H 更名-U")
    @TableField("NEW_TYPE_CODE")
    private String newTypeCode;
    /**
     * 组织名称
     */
     @ApiModelProperty(value="组织名称")
    @TableField("ORG_NAME")
    private String orgName;
    /**
     * 组织类型
     */
     @ApiModelProperty(value="组织类型")
    @TableField("ORG_TYPE")
    private String orgType;
    /**
     * 起始日期
     */
     @ApiModelProperty(value="起始日期")
    @TableField("DATE_FROM")
    private Date dateFrom;
    /**
     * 终止日期
     */
     @ApiModelProperty(value="终止日期")
    @TableField("DATE_TO")
    private Date dateTo;
    /**
     * 内外外部
     */
     @ApiModelProperty(value="内外外部")
    @TableField("INTERNAL_EXTERNAL_FLAG")
    private String internalExternalFlag;
    /**
     * HR组织
     */
     @ApiModelProperty(value="HR组织")
    @TableField("HR_ORG")
    private String hrOrg;
    /**
     * GRE法律实体
     */
     @ApiModelProperty(value="GRE法律实体")
    @TableField("GRE_ORG")
    private String greOrg;
    /**
     * 公司信息对应的公司名称
     */
     @ApiModelProperty(value="公司信息对应的公司名称")
    @TableField("GRE_COMPANY_NAME")
    private String greCompanyName;
    /**
     * 公司信息对应的企业组织代码
     */
     @ApiModelProperty(value="公司信息对应的企业组织代码")
    @TableField("GRE_ORG_NUMBER")
    private String greOrgNumber;
    /**
     * 雇主信息对应的公司组织
     */
     @ApiModelProperty(value="雇主信息对应的公司组织")
    @TableField("EMPLOYER_COMPANY_ORG")
    private String employerCompanyOrg;
    /**
     * 雇主信息对应的延迟扣除额
     */
     @ApiModelProperty(value="雇主信息对应的延迟扣除额")
    @TableField("EMPLOYER_DEDUCTION_Y")
    private String employerDeductionY;
    /**
     * 雇主信息对应的试用期满时扣除
     */
     @ApiModelProperty(value="雇主信息对应的试用期满时扣除")
    @TableField("EMPLOYER_DEDUCTION_S")
    private String employerDeductionS;
    /**
     * 组织地点ID
     */
     @ApiModelProperty(value="组织地点ID")
    @TableField("LOCATION_ID")
    private Long locationId;
    /**
     * 南方/北方/子公司
     */
     @ApiModelProperty(value="南方/北方/子公司")
    @TableField("SUBSIDIARY")
    private String subsidiary;
    /**
     * 是否属于上市/非上市/存续/实业组织
     */
     @ApiModelProperty(value="是否属于上市/非上市/存续/实业组织")
    @TableField("APPEAR_MARKET")
    private String appearMarket;
    /**
     * 组织层级
     */
     @ApiModelProperty(value="组织层级")
    @TableField("ORG_HIERARCHY")
    private String orgHierarchy;
    /**
     * 虚拟组织
     */
     @ApiModelProperty(value="虚拟组织")
    @TableField("VIRTUAL_ORG")
    private String virtualOrg;
    /**
     * 所属省份
     */
     @ApiModelProperty(value="所属省份")
    @TableField("SUBORDINATE_PROVINCES")
    private String subordinateProvinces;
    /**
     * 组织排序号
     */
     @ApiModelProperty(value="组织排序号")
    @TableField("ORG_ORDER_NUMBER")
    private String orgOrderNumber;
    /**
     * 存续/实业组织对应省公司名称
     */
     @ApiModelProperty(value="存续/实业组织对应省公司名称")
    @TableField("ORG_COMPANY_NAME")
    private String orgCompanyName;
    /**
     * 组织撤销发文时间
     */
     @ApiModelProperty(value="组织撤销发文时间")
    @TableField("ORG_REPEAL_DATE")
    private String orgRepealDate;
    /**
     * 组织全称
     */
     @ApiModelProperty(value="组织全称")
    @TableField("ORG_FULL_NAME")
    private String orgFullName;
    /**
     * 组织编码
     */
     @ApiModelProperty(value="组织编码")
    @TableField("ORG_FULL_NUMBER")
    private String orgFullNumber;
    /**
     * 是否隶属于省本部
     */
     @ApiModelProperty(value="是否隶属于省本部")
    @TableField("SUBORDINATE_PROVINCE")
    private String subordinateProvince;
    /**
     * 是否地市本部职能部门
     */
     @ApiModelProperty(value="是否地市本部职能部门")
    @TableField("FUNCTION_PROVINCE")
    private String functionProvince;
    /**
     * 上级组织
     */
     @ApiModelProperty(value="上级组织")
    @TableField("SUPERIORS_ORG")
    private String superiorsOrg;
    /**
     * 备注1
     */
     @ApiModelProperty(value="备注1")
    @TableField("REMARK1")
    private String remark1;
    /**
     * 备注2
     */
     @ApiModelProperty(value="备注2")
    @TableField("REMARK2")
    private String remark2;
    /**
     * 备注3
     */
     @ApiModelProperty(value="备注3")
    @TableField("REMARK3")
    private String remark3;
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
    /**
     * 同步是否成功(Y,N)
     */
     @ApiModelProperty(value="同步是否成功(Y,N)")
    @TableField("SYNCHRO")
    private String synchro;
    /**
     * 同步明细
     */
     @ApiModelProperty(value="同步明细")
    @TableField("ERROR_MESSAGE")
    private String errorMessage;
    /**
     * 同步后组织ID
     */
     @ApiModelProperty(value="同步后组织ID")
    @TableField("NEW_ORG_ID")
    private Long newOrgId;
    /**
     * 同步后父组织ID
     */
     @ApiModelProperty(value="同步后父组织ID")
    @TableField("NEW_PARENT_ORG_ID")
    private Long newParentOrgId;
    /**
     * 标准组织
     */
     @ApiModelProperty(value="标准组织")
    @TableField("STANDARDORG")
    private String standardorg;
    /**
     * 最小基层单元
     */
     @ApiModelProperty(value="最小基层单元")
    @TableField("MIN_UNIT")
    private String minUnit;
    /**
     * 组织更名(先撤销后新增)时新组织记录原组织ID
     */
     @ApiModelProperty(value="组织更名(先撤销后新增)时新组织记录原组织ID")
    @TableField("CUC_ORI_ORG_ID")
    private String cucOriOrgId;
    /**
     * 业务组ID
     */
     @ApiModelProperty(value="业务组ID")
    @TableField("BUSINESS_GROUP_ID")
    private Long businessGroupId;
    /**
     * 国际公司业务线（国际公司专用）
     */
     @ApiModelProperty(value="国际公司业务线（国际公司专用）")
    @TableField("CUG_ORG_LOB")
    private String cugOrgLob;


    public Long gettOrgId() {
        return tOrgId;
    }

    public void settOrgId(Long tOrgId) {
        this.tOrgId = tOrgId;
    }

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

    public Long getParentOrgId() {
        return parentOrgId;
    }

    public void setParentOrgId(Long parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    public String getNewTypeCode() {
        return newTypeCode;
    }

    public void setNewTypeCode(String newTypeCode) {
        this.newTypeCode = newTypeCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
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

    public String getInternalExternalFlag() {
        return internalExternalFlag;
    }

    public void setInternalExternalFlag(String internalExternalFlag) {
        this.internalExternalFlag = internalExternalFlag;
    }

    public String getHrOrg() {
        return hrOrg;
    }

    public void setHrOrg(String hrOrg) {
        this.hrOrg = hrOrg;
    }

    public String getGreOrg() {
        return greOrg;
    }

    public void setGreOrg(String greOrg) {
        this.greOrg = greOrg;
    }

    public String getGreCompanyName() {
        return greCompanyName;
    }

    public void setGreCompanyName(String greCompanyName) {
        this.greCompanyName = greCompanyName;
    }

    public String getGreOrgNumber() {
        return greOrgNumber;
    }

    public void setGreOrgNumber(String greOrgNumber) {
        this.greOrgNumber = greOrgNumber;
    }

    public String getEmployerCompanyOrg() {
        return employerCompanyOrg;
    }

    public void setEmployerCompanyOrg(String employerCompanyOrg) {
        this.employerCompanyOrg = employerCompanyOrg;
    }

    public String getEmployerDeductionY() {
        return employerDeductionY;
    }

    public void setEmployerDeductionY(String employerDeductionY) {
        this.employerDeductionY = employerDeductionY;
    }

    public String getEmployerDeductionS() {
        return employerDeductionS;
    }

    public void setEmployerDeductionS(String employerDeductionS) {
        this.employerDeductionS = employerDeductionS;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getSubsidiary() {
        return subsidiary;
    }

    public void setSubsidiary(String subsidiary) {
        this.subsidiary = subsidiary;
    }

    public String getAppearMarket() {
        return appearMarket;
    }

    public void setAppearMarket(String appearMarket) {
        this.appearMarket = appearMarket;
    }

    public String getOrgHierarchy() {
        return orgHierarchy;
    }

    public void setOrgHierarchy(String orgHierarchy) {
        this.orgHierarchy = orgHierarchy;
    }

    public String getVirtualOrg() {
        return virtualOrg;
    }

    public void setVirtualOrg(String virtualOrg) {
        this.virtualOrg = virtualOrg;
    }

    public String getSubordinateProvinces() {
        return subordinateProvinces;
    }

    public void setSubordinateProvinces(String subordinateProvinces) {
        this.subordinateProvinces = subordinateProvinces;
    }

    public String getOrgOrderNumber() {
        return orgOrderNumber;
    }

    public void setOrgOrderNumber(String orgOrderNumber) {
        this.orgOrderNumber = orgOrderNumber;
    }

    public String getOrgCompanyName() {
        return orgCompanyName;
    }

    public void setOrgCompanyName(String orgCompanyName) {
        this.orgCompanyName = orgCompanyName;
    }

    public String getOrgRepealDate() {
        return orgRepealDate;
    }

    public void setOrgRepealDate(String orgRepealDate) {
        this.orgRepealDate = orgRepealDate;
    }

    public String getOrgFullName() {
        return orgFullName;
    }

    public void setOrgFullName(String orgFullName) {
        this.orgFullName = orgFullName;
    }

    public String getOrgFullNumber() {
        return orgFullNumber;
    }

    public void setOrgFullNumber(String orgFullNumber) {
        this.orgFullNumber = orgFullNumber;
    }

    public String getSubordinateProvince() {
        return subordinateProvince;
    }

    public void setSubordinateProvince(String subordinateProvince) {
        this.subordinateProvince = subordinateProvince;
    }

    public String getFunctionProvince() {
        return functionProvince;
    }

    public void setFunctionProvince(String functionProvince) {
        this.functionProvince = functionProvince;
    }

    public String getSuperiorsOrg() {
        return superiorsOrg;
    }

    public void setSuperiorsOrg(String superiorsOrg) {
        this.superiorsOrg = superiorsOrg;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
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

    public String getSynchro() {
        return synchro;
    }

    public void setSynchro(String synchro) {
        this.synchro = synchro;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Long getNewOrgId() {
        return newOrgId;
    }

    public void setNewOrgId(Long newOrgId) {
        this.newOrgId = newOrgId;
    }

    public Long getNewParentOrgId() {
        return newParentOrgId;
    }

    public void setNewParentOrgId(Long newParentOrgId) {
        this.newParentOrgId = newParentOrgId;
    }

    public String getStandardorg() {
        return standardorg;
    }

    public void setStandardorg(String standardorg) {
        this.standardorg = standardorg;
    }

    public String getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(String minUnit) {
        this.minUnit = minUnit;
    }

    public String getCucOriOrgId() {
        return cucOriOrgId;
    }

    public void setCucOriOrgId(String cucOriOrgId) {
        this.cucOriOrgId = cucOriOrgId;
    }

    public Long getBusinessGroupId() {
        return businessGroupId;
    }

    public void setBusinessGroupId(Long businessGroupId) {
        this.businessGroupId = businessGroupId;
    }

    public String getCugOrgLob() {
        return cugOrgLob;
    }

    public void setCugOrgLob(String cugOrgLob) {
        this.cugOrgLob = cugOrgLob;
    }

    @Override
    protected Serializable pkVal() {
        return this.tOrgId;
    }

    @Override
    public String toString() {
        return "OrgNewUnits{" +
        ", tOrgId=" + tOrgId +
        ", rChangeId=" + rChangeId +
        ", docHeaderId=" + docHeaderId +
        ", parentOrgId=" + parentOrgId +
        ", newTypeCode=" + newTypeCode +
        ", orgName=" + orgName +
        ", orgType=" + orgType +
        ", dateFrom=" + dateFrom +
        ", dateTo=" + dateTo +
        ", internalExternalFlag=" + internalExternalFlag +
        ", hrOrg=" + hrOrg +
        ", greOrg=" + greOrg +
        ", greCompanyName=" + greCompanyName +
        ", greOrgNumber=" + greOrgNumber +
        ", employerCompanyOrg=" + employerCompanyOrg +
        ", employerDeductionY=" + employerDeductionY +
        ", employerDeductionS=" + employerDeductionS +
        ", locationId=" + locationId +
        ", subsidiary=" + subsidiary +
        ", appearMarket=" + appearMarket +
        ", orgHierarchy=" + orgHierarchy +
        ", virtualOrg=" + virtualOrg +
        ", subordinateProvinces=" + subordinateProvinces +
        ", orgOrderNumber=" + orgOrderNumber +
        ", orgCompanyName=" + orgCompanyName +
        ", orgRepealDate=" + orgRepealDate +
        ", orgFullName=" + orgFullName +
        ", orgFullNumber=" + orgFullNumber +
        ", subordinateProvince=" + subordinateProvince +
        ", functionProvince=" + functionProvince +
        ", superiorsOrg=" + superiorsOrg +
        ", remark1=" + remark1 +
        ", remark2=" + remark2 +
        ", remark3=" + remark3 +
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
        ", synchro=" + synchro +
        ", errorMessage=" + errorMessage +
        ", newOrgId=" + newOrgId +
        ", newParentOrgId=" + newParentOrgId +
        ", standardorg=" + standardorg +
        ", minUnit=" + minUnit +
        ", cucOriOrgId=" + cucOriOrgId +
        ", businessGroupId=" + businessGroupId +
        ", cugOrgLob=" + cugOrgLob +
        "}";
    }
}
