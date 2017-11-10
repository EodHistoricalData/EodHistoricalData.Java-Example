package be.neesconsulting.coco.source.eod.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BalanceRecord {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("investments")
    @Expose
    private String investments;
    @SerializedName("changeToLiabilities")
    @Expose
    private String changeToLiabilities;
    @SerializedName("totalCashflowsFromInvestingActivities")
    @Expose
    private String totalCashflowsFromInvestingActivities;
    @SerializedName("netBorrowings")
    @Expose
    private String netBorrowings;
    @SerializedName("totalCashFromFinancingActivities")
    @Expose
    private String totalCashFromFinancingActivities;
    @SerializedName("changeToOperatingActivities")
    @Expose
    private String changeToOperatingActivities;
    @SerializedName("netIncome")
    @Expose
    private String netIncome;
    @SerializedName("changeInCash")
    @Expose
    private String changeInCash;
    @SerializedName("totalCashFromOperatingActivities")
    @Expose
    private String totalCashFromOperatingActivities;
    @SerializedName("depreciation")
    @Expose
    private String depreciation;
    @SerializedName("otherCashflowsFromInvestingActivities")
    @Expose
    private String otherCashflowsFromInvestingActivities;
    @SerializedName("dividendsPaid")
    @Expose
    private String dividendsPaid;
    @SerializedName("changeToInventory")
    @Expose
    private String changeToInventory;
    @SerializedName("changeToAccountReceivables")
    @Expose
    private String changeToAccountReceivables;
    @SerializedName("salePurchaseOfStock")
    @Expose
    private String salePurchaseOfStock;
    @SerializedName("otherCashflowsFromFinancingActivities")
    @Expose
    private String otherCashflowsFromFinancingActivities;
    @SerializedName("changeToNetincome")
    @Expose
    private String changeToNetincome;
    @SerializedName("capitalExpenditures")
    @Expose
    private String capitalExpenditures;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInvestments() {
        return investments;
    }

    public void setInvestments(String investments) {
        this.investments = investments;
    }

    public String getChangeToLiabilities() {
        return changeToLiabilities;
    }

    public void setChangeToLiabilities(String changeToLiabilities) {
        this.changeToLiabilities = changeToLiabilities;
    }

    public String getTotalCashflowsFromInvestingActivities() {
        return totalCashflowsFromInvestingActivities;
    }

    public void setTotalCashflowsFromInvestingActivities(String totalCashflowsFromInvestingActivities) {
        this.totalCashflowsFromInvestingActivities = totalCashflowsFromInvestingActivities;
    }

    public String getNetBorrowings() {
        return netBorrowings;
    }

    public void setNetBorrowings(String netBorrowings) {
        this.netBorrowings = netBorrowings;
    }

    public String getTotalCashFromFinancingActivities() {
        return totalCashFromFinancingActivities;
    }

    public void setTotalCashFromFinancingActivities(String totalCashFromFinancingActivities) {
        this.totalCashFromFinancingActivities = totalCashFromFinancingActivities;
    }

    public String getChangeToOperatingActivities() {
        return changeToOperatingActivities;
    }

    public void setChangeToOperatingActivities(String changeToOperatingActivities) {
        this.changeToOperatingActivities = changeToOperatingActivities;
    }

    public String getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(String netIncome) {
        this.netIncome = netIncome;
    }

    public String getChangeInCash() {
        return changeInCash;
    }

    public void setChangeInCash(String changeInCash) {
        this.changeInCash = changeInCash;
    }

    public String getTotalCashFromOperatingActivities() {
        return totalCashFromOperatingActivities;
    }

    public void setTotalCashFromOperatingActivities(String totalCashFromOperatingActivities) {
        this.totalCashFromOperatingActivities = totalCashFromOperatingActivities;
    }

    public String getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(String depreciation) {
        this.depreciation = depreciation;
    }

    public String getOtherCashflowsFromInvestingActivities() {
        return otherCashflowsFromInvestingActivities;
    }

    public void setOtherCashflowsFromInvestingActivities(String otherCashflowsFromInvestingActivities) {
        this.otherCashflowsFromInvestingActivities = otherCashflowsFromInvestingActivities;
    }

    public String getDividendsPaid() {
        return dividendsPaid;
    }

    public void setDividendsPaid(String dividendsPaid) {
        this.dividendsPaid = dividendsPaid;
    }

    public String getChangeToInventory() {
        return changeToInventory;
    }

    public void setChangeToInventory(String changeToInventory) {
        this.changeToInventory = changeToInventory;
    }

    public String getChangeToAccountReceivables() {
        return changeToAccountReceivables;
    }

    public void setChangeToAccountReceivables(String changeToAccountReceivables) {
        this.changeToAccountReceivables = changeToAccountReceivables;
    }

    public String getSalePurchaseOfStock() {
        return salePurchaseOfStock;
    }

    public void setSalePurchaseOfStock(String salePurchaseOfStock) {
        this.salePurchaseOfStock = salePurchaseOfStock;
    }

    public String getOtherCashflowsFromFinancingActivities() {
        return otherCashflowsFromFinancingActivities;
    }

    public void setOtherCashflowsFromFinancingActivities(String otherCashflowsFromFinancingActivities) {
        this.otherCashflowsFromFinancingActivities = otherCashflowsFromFinancingActivities;
    }

    public String getChangeToNetincome() {
        return changeToNetincome;
    }

    public void setChangeToNetincome(String changeToNetincome) {
        this.changeToNetincome = changeToNetincome;
    }

    public String getCapitalExpenditures() {
        return capitalExpenditures;
    }

    public void setCapitalExpenditures(String capitalExpenditures) {
        this.capitalExpenditures = capitalExpenditures;
    }

}