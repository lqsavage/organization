package cn.chinaunicom.orgInfo.entity;

public class OrgDetailInfo {
    private String orgName;//组织名称
    private String orgType;//组织类型
    private String dateFrom;//开始日期
    private String dateTo;//日期至
    private String orgTypicalHR;//组织分类HR
    private String orgTypicalGRE;//组织分类GRE
    //location info
    private String location;//地点信息
    private String interOrter;//内外部
    private String country;
    private String national;//国家
    private String townOrCity;//
    private String privince;//省市
    private String locationDetailInfo;//地点地址
    private String postCode;//邮编
    //add Info
    private String addInfo;//存续实业对应省公司名称
    private String orgSortNumber;//组织排序号
    private String orgLevel;//组织层级
    private String area;//南方/北方/子公司
    private String vitualOrg;//虚拟组织
    private String owenPrivince;//所属省份
    private String orgProprerties;//组织属性
    private String orgcancleDate;//组织撤销时间
    //gre  law entity info

    private String orgnizationName;//公司名称
    private String orgCode;//组织代码
    private String orgnizationOrg;//公司组织
    //成本信息
    private String orgPeriodCode;//公司段编码
    private String orgPeriodSHow;//公司段说明
    private String costCenterCode;//成本中心编码
    private String costCenterShow;//成本中心说明
    private String majorCode;//专业段编码
    private String majorSHow;//专业段说明

    private String cucorgmin ; //最小基层单元  20150925 suunywang
    private String cugOrgLob ; //国际公司业务线（国际公司专用）  201607

    public String getCugOrgLob() {
        return cugOrgLob;
    }
    public void setCugOrgLob(String cugOrgLob) {
        this.cugOrgLob = cugOrgLob;
    }
    public String getCucorgmin() {
        return cucorgmin;
    }
    public void setCucorgmin(String cucorgmin) {
        this.cucorgmin = cucorgmin;
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
    public String getDateFrom() {
        return dateFrom;
    }
    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }
    public String getDateTo() {
        return dateTo;
    }
    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getOrgTypicalHR() {
        return orgTypicalHR;
    }
    public void setOrgTypicalHR(String orgTypicalHR) {
        this.orgTypicalHR = orgTypicalHR;
    }
    public String getOrgTypicalGRE() {
        return orgTypicalGRE;
    }
    public void setOrgTypicalGRE(String orgTypicalGRE) {
        this.orgTypicalGRE = orgTypicalGRE;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getInterOrter() {
        return interOrter;
    }
    public void setInterOrter(String interOrter) {
        this.interOrter = interOrter;
    }
    public String getNational() {
        return national;
    }
    public void setNational(String national) {
        this.national = national;
    }
    public String getPrivince() {
        return privince;
    }
    public void setPrivince(String privince) {
        this.privince = privince;
    }
    public String getLocationDetailInfo() {
        return locationDetailInfo;
    }
    public void setLocationDetailInfo(String locationDetailInfo) {
        this.locationDetailInfo = locationDetailInfo;
    }
    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    public String getAddInfo() {
        return addInfo;
    }
    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }
    public String getOrgSortNumber() {
        return orgSortNumber;
    }
    public void setOrgSortNumber(String orgSortNumber) {
        this.orgSortNumber = orgSortNumber;
    }
    public String getOrgLevel() {
        return orgLevel;
    }
    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getVitualOrg() {
        return vitualOrg;
    }
    public void setVitualOrg(String vitualOrg) {
        this.vitualOrg = vitualOrg;
    }
    public String getOwenPrivince() {
        return owenPrivince;
    }
    public void setOwenPrivince(String owenPrivince) {
        this.owenPrivince = owenPrivince;
    }
    public String getOrgProprerties() {
        return orgProprerties;
    }
    public void setOrgProprerties(String orgProprerties) {
        this.orgProprerties = orgProprerties;
    }
    public String getOrgcancleDate() {
        return orgcancleDate;
    }
    public void setOrgcancleDate(String orgcancleDate) {
        this.orgcancleDate = orgcancleDate;
    }
    public String getOrgnizationName() {
        return orgnizationName;
    }
    public void setOrgnizationName(String orgnizationName) {
        this.orgnizationName = orgnizationName;
    }
    public String getOrgCode() {
        return orgCode;
    }
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
    public String getOrgnizationOrg() {
        return orgnizationOrg;
    }
    public void setOrgnizationOrg(String orgnizationOrg) {
        this.orgnizationOrg = orgnizationOrg;
    }
    public String getOrgPeriodCode() {
        return orgPeriodCode;
    }
    public void setOrgPeriodCode(String orgPeriodCode) {
        this.orgPeriodCode = orgPeriodCode;
    }
    public String getOrgPeriodSHow() {
        return orgPeriodSHow;
    }
    public void setOrgPeriodSHow(String orgPeriodSHow) {
        this.orgPeriodSHow = orgPeriodSHow;
    }
    public String getCostCenterCode() {
        return costCenterCode;
    }
    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }
    public String getCostCenterShow() {
        return costCenterShow;
    }
    public void setCostCenterShow(String costCenterShow) {
        this.costCenterShow = costCenterShow;
    }
    public String getMajorCode() {
        return majorCode;
    }
    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode;
    }
    public String getMajorSHow() {
        return majorSHow;
    }
    public void setMajorSHow(String majorSHow) {
        this.majorSHow = majorSHow;
    }
    public String getTownOrCity() {
        return townOrCity;
    }
    public void setTownOrCity(String townOrCity) {
        this.townOrCity = townOrCity;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return "OrgnazationDetailInfo [orgName=" + orgName + ", orgType="
                + orgType + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo
                + ", orgTypicalHR=" + orgTypicalHR + ", orgTypicalGRE="
                + orgTypicalGRE + ", location=" + location + ", interOrter="
                + interOrter + ", country=" + country + ", national="
                + national + ", townOrCity=" + townOrCity + ", privince="
                + privince + ", locationDetailInfo=" + locationDetailInfo
                + ", postCode=" + postCode + ", addInfo=" + addInfo
                + ", orgSortNumber=" + orgSortNumber + ", orgLevel=" + orgLevel
                + ", area=" + area + ", vitualOrg=" + vitualOrg
                + ", owenPrivince=" + owenPrivince + ", orgProprerties="
                + orgProprerties + ", orgcancleDate=" + orgcancleDate
                + ", orgnizationName=" + orgnizationName + ", orgCode="
                + orgCode + ", orgnizationOrg=" + orgnizationOrg
                + ", orgPeriodCode=" + orgPeriodCode + ", orgPeriodSHow="
                + orgPeriodSHow + ", costCenterCode=" + costCenterCode
                + ", costCenterShow=" + costCenterShow + ", majorCode="
                + majorCode + ", majorSHow=" + majorSHow + ", cucorgmin="
                + cucorgmin + "]";
    }
}
