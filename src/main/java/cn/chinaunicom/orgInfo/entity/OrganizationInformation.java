package cn.chinaunicom.orgInfo.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangrunpu
 * @since 2018-10-17
 */
@TableName("hr_organization_information")
@ApiModel("")
public class OrganizationInformation extends Model<OrganizationInformation> {

    private static final long serialVersionUID = 1L;

    @TableField("ORG_INFORMATION_ID")
    private BigDecimal orgInformationId;
    @TableField("ORG_INFORMATION_CONTEXT")
    private String orgInformationContext;
    @TableField("ORGANIZATION_ID")
    private BigDecimal organizationId;
    @TableField("ORG_INFORMATION1")
    private String orgInformation1;
    @TableField("ORG_INFORMATION10")
    private String orgInformation10;
    @TableField("ORG_INFORMATION11")
    private String orgInformation11;
    @TableField("ORG_INFORMATION12")
    private String orgInformation12;
    @TableField("ORG_INFORMATION13")
    private String orgInformation13;
    @TableField("ORG_INFORMATION14")
    private String orgInformation14;
    @TableField("ORG_INFORMATION15")
    private String orgInformation15;
    @TableField("ORG_INFORMATION16")
    private String orgInformation16;
    @TableField("ORG_INFORMATION17")
    private String orgInformation17;
    @TableField("ORG_INFORMATION18")
    private String orgInformation18;
    @TableField("ORG_INFORMATION19")
    private String orgInformation19;
    @TableField("ORG_INFORMATION2")
    private String orgInformation2;
    @TableField("ORG_INFORMATION20")
    private String orgInformation20;
    @TableField("ORG_INFORMATION3")
    private String orgInformation3;
    @TableField("ORG_INFORMATION4")
    private String orgInformation4;
    @TableField("ORG_INFORMATION5")
    private String orgInformation5;
    @TableField("ORG_INFORMATION6")
    private String orgInformation6;
    @TableField("ORG_INFORMATION7")
    private String orgInformation7;
    @TableField("ORG_INFORMATION8")
    private String orgInformation8;
    @TableField("ORG_INFORMATION9")
    private String orgInformation9;
    @TableField("REQUEST_ID")
    private BigDecimal requestId;
    @TableField("PROGRAM_APPLICATION_ID")
    private BigDecimal programApplicationId;
    @TableField("PROGRAM_ID")
    private BigDecimal programId;
    @TableField("PROGRAM_UPDATE_DATE")
    private Date programUpdateDate;
    @TableField("ATTRIBUTE_CATEGORY")
    private String attributeCategory;
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
    @TableField("ATTRIBUTE11")
    private String attribute11;
    @TableField("ATTRIBUTE12")
    private String attribute12;
    @TableField("ATTRIBUTE13")
    private String attribute13;
    @TableField("ATTRIBUTE14")
    private String attribute14;
    @TableField("ATTRIBUTE15")
    private String attribute15;
    @TableField("ATTRIBUTE16")
    private String attribute16;
    @TableField("ATTRIBUTE17")
    private String attribute17;
    @TableField("ATTRIBUTE18")
    private String attribute18;
    @TableField("ATTRIBUTE19")
    private String attribute19;
    @TableField("ATTRIBUTE20")
    private String attribute20;
    @TableField("LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @TableField("LAST_UPDATED_BY")
    private BigDecimal lastUpdatedBy;
    @TableField("LAST_UPDATE_LOGIN")
    private BigDecimal lastUpdateLogin;
    @TableField("CREATED_BY")
    private BigDecimal createdBy;
    @TableField("CREATION_DATE")
    private Date creationDate;
    @TableField("OBJECT_VERSION_NUMBER")
    private BigDecimal objectVersionNumber;
    @TableField("PARTY_ID")
    private BigDecimal partyId;


    public BigDecimal getOrgInformationId() {
        return orgInformationId;
    }

    public void setOrgInformationId(BigDecimal orgInformationId) {
        this.orgInformationId = orgInformationId;
    }

    public String getOrgInformationContext() {
        return orgInformationContext;
    }

    public void setOrgInformationContext(String orgInformationContext) {
        this.orgInformationContext = orgInformationContext;
    }

    public BigDecimal getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(BigDecimal organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrgInformation1() {
        return orgInformation1;
    }

    public void setOrgInformation1(String orgInformation1) {
        this.orgInformation1 = orgInformation1;
    }

    public String getOrgInformation10() {
        return orgInformation10;
    }

    public void setOrgInformation10(String orgInformation10) {
        this.orgInformation10 = orgInformation10;
    }

    public String getOrgInformation11() {
        return orgInformation11;
    }

    public void setOrgInformation11(String orgInformation11) {
        this.orgInformation11 = orgInformation11;
    }

    public String getOrgInformation12() {
        return orgInformation12;
    }

    public void setOrgInformation12(String orgInformation12) {
        this.orgInformation12 = orgInformation12;
    }

    public String getOrgInformation13() {
        return orgInformation13;
    }

    public void setOrgInformation13(String orgInformation13) {
        this.orgInformation13 = orgInformation13;
    }

    public String getOrgInformation14() {
        return orgInformation14;
    }

    public void setOrgInformation14(String orgInformation14) {
        this.orgInformation14 = orgInformation14;
    }

    public String getOrgInformation15() {
        return orgInformation15;
    }

    public void setOrgInformation15(String orgInformation15) {
        this.orgInformation15 = orgInformation15;
    }

    public String getOrgInformation16() {
        return orgInformation16;
    }

    public void setOrgInformation16(String orgInformation16) {
        this.orgInformation16 = orgInformation16;
    }

    public String getOrgInformation17() {
        return orgInformation17;
    }

    public void setOrgInformation17(String orgInformation17) {
        this.orgInformation17 = orgInformation17;
    }

    public String getOrgInformation18() {
        return orgInformation18;
    }

    public void setOrgInformation18(String orgInformation18) {
        this.orgInformation18 = orgInformation18;
    }

    public String getOrgInformation19() {
        return orgInformation19;
    }

    public void setOrgInformation19(String orgInformation19) {
        this.orgInformation19 = orgInformation19;
    }

    public String getOrgInformation2() {
        return orgInformation2;
    }

    public void setOrgInformation2(String orgInformation2) {
        this.orgInformation2 = orgInformation2;
    }

    public String getOrgInformation20() {
        return orgInformation20;
    }

    public void setOrgInformation20(String orgInformation20) {
        this.orgInformation20 = orgInformation20;
    }

    public String getOrgInformation3() {
        return orgInformation3;
    }

    public void setOrgInformation3(String orgInformation3) {
        this.orgInformation3 = orgInformation3;
    }

    public String getOrgInformation4() {
        return orgInformation4;
    }

    public void setOrgInformation4(String orgInformation4) {
        this.orgInformation4 = orgInformation4;
    }

    public String getOrgInformation5() {
        return orgInformation5;
    }

    public void setOrgInformation5(String orgInformation5) {
        this.orgInformation5 = orgInformation5;
    }

    public String getOrgInformation6() {
        return orgInformation6;
    }

    public void setOrgInformation6(String orgInformation6) {
        this.orgInformation6 = orgInformation6;
    }

    public String getOrgInformation7() {
        return orgInformation7;
    }

    public void setOrgInformation7(String orgInformation7) {
        this.orgInformation7 = orgInformation7;
    }

    public String getOrgInformation8() {
        return orgInformation8;
    }

    public void setOrgInformation8(String orgInformation8) {
        this.orgInformation8 = orgInformation8;
    }

    public String getOrgInformation9() {
        return orgInformation9;
    }

    public void setOrgInformation9(String orgInformation9) {
        this.orgInformation9 = orgInformation9;
    }

    public BigDecimal getRequestId() {
        return requestId;
    }

    public void setRequestId(BigDecimal requestId) {
        this.requestId = requestId;
    }

    public BigDecimal getProgramApplicationId() {
        return programApplicationId;
    }

    public void setProgramApplicationId(BigDecimal programApplicationId) {
        this.programApplicationId = programApplicationId;
    }

    public BigDecimal getProgramId() {
        return programId;
    }

    public void setProgramId(BigDecimal programId) {
        this.programId = programId;
    }

    public Date getProgramUpdateDate() {
        return programUpdateDate;
    }

    public void setProgramUpdateDate(Date programUpdateDate) {
        this.programUpdateDate = programUpdateDate;
    }

    public String getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory;
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

    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }

    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }

    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }

    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
    }

    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15;
    }

    public String getAttribute16() {
        return attribute16;
    }

    public void setAttribute16(String attribute16) {
        this.attribute16 = attribute16;
    }

    public String getAttribute17() {
        return attribute17;
    }

    public void setAttribute17(String attribute17) {
        this.attribute17 = attribute17;
    }

    public String getAttribute18() {
        return attribute18;
    }

    public void setAttribute18(String attribute18) {
        this.attribute18 = attribute18;
    }

    public String getAttribute19() {
        return attribute19;
    }

    public void setAttribute19(String attribute19) {
        this.attribute19 = attribute19;
    }

    public String getAttribute20() {
        return attribute20;
    }

    public void setAttribute20(String attribute20) {
        this.attribute20 = attribute20;
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

    public BigDecimal getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(BigDecimal objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    public BigDecimal getPartyId() {
        return partyId;
    }

    public void setPartyId(BigDecimal partyId) {
        this.partyId = partyId;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "OrganizationInformation{" +
        ", orgInformationId=" + orgInformationId +
        ", orgInformationContext=" + orgInformationContext +
        ", organizationId=" + organizationId +
        ", orgInformation1=" + orgInformation1 +
        ", orgInformation10=" + orgInformation10 +
        ", orgInformation11=" + orgInformation11 +
        ", orgInformation12=" + orgInformation12 +
        ", orgInformation13=" + orgInformation13 +
        ", orgInformation14=" + orgInformation14 +
        ", orgInformation15=" + orgInformation15 +
        ", orgInformation16=" + orgInformation16 +
        ", orgInformation17=" + orgInformation17 +
        ", orgInformation18=" + orgInformation18 +
        ", orgInformation19=" + orgInformation19 +
        ", orgInformation2=" + orgInformation2 +
        ", orgInformation20=" + orgInformation20 +
        ", orgInformation3=" + orgInformation3 +
        ", orgInformation4=" + orgInformation4 +
        ", orgInformation5=" + orgInformation5 +
        ", orgInformation6=" + orgInformation6 +
        ", orgInformation7=" + orgInformation7 +
        ", orgInformation8=" + orgInformation8 +
        ", orgInformation9=" + orgInformation9 +
        ", requestId=" + requestId +
        ", programApplicationId=" + programApplicationId +
        ", programId=" + programId +
        ", programUpdateDate=" + programUpdateDate +
        ", attributeCategory=" + attributeCategory +
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
        ", attribute11=" + attribute11 +
        ", attribute12=" + attribute12 +
        ", attribute13=" + attribute13 +
        ", attribute14=" + attribute14 +
        ", attribute15=" + attribute15 +
        ", attribute16=" + attribute16 +
        ", attribute17=" + attribute17 +
        ", attribute18=" + attribute18 +
        ", attribute19=" + attribute19 +
        ", attribute20=" + attribute20 +
        ", lastUpdateDate=" + lastUpdateDate +
        ", lastUpdatedBy=" + lastUpdatedBy +
        ", lastUpdateLogin=" + lastUpdateLogin +
        ", createdBy=" + createdBy +
        ", creationDate=" + creationDate +
        ", objectVersionNumber=" + objectVersionNumber +
        ", partyId=" + partyId +
        "}";
    }
}
