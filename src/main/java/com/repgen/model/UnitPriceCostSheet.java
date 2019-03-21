package com.repgen.model;

import java.math.BigDecimal;
import java.util.Date;

public class UnitPriceCostSheet {
    private String fundCode;
    private String portfolioCode;
    private Date pricingPointDate;
    private String pricingPointeTime;
    private String reportSet;
    private Integer cellrow;
    private String cellColumn;
    private BigDecimal value;
    private Date extractedDateTime;


    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getPortfolioCode() {
        return portfolioCode;
    }

    public void setPortfolioCode(String portfolioCode) {
        this.portfolioCode = portfolioCode;
    }

    public Date getPricingPointDate() {
        return pricingPointDate;
    }

    public void setPricingPointDate(Date pricingPointDate) {
        this.pricingPointDate = pricingPointDate;
    }

    public String getPricingPointeTime() {
        return pricingPointeTime;
    }

    public void setPricingPointeTime(String pricingPointeTime) {
        this.pricingPointeTime = pricingPointeTime;
    }

    public String getReportSet() {
        return reportSet;
    }

    public void setReportSet(String reportSet) {
        this.reportSet = reportSet;
    }

    public Integer getCellrow() {
        return cellrow;
    }

    public void setCellrow(Integer cellrow) {
        this.cellrow = cellrow;
    }

    public String getCellColumn() {
        return cellColumn;
    }

    public void setCellColumn(String cellColumn) {
        this.cellColumn = cellColumn;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Date getExtractedDateTime() {
        return extractedDateTime;
    }

    public void setExtractedDateTime(Date extractedDateTime) {
        this.extractedDateTime = extractedDateTime;
    }
}
