package be.neesconsulting.coco.source.eod.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IncomeRecord {

	    @SerializedName("date")
	    @Expose
	    private String date;
	    @SerializedName("researchDevelopment")
	    @Expose
	    private String researchDevelopment;
	    @SerializedName("effectOfAccountingCharges")
	    @Expose
	    private Object effectOfAccountingCharges;
	    @SerializedName("incomeBeforeTax")
	    @Expose
	    private String incomeBeforeTax;
	    @SerializedName("minorityInterest")
	    @Expose
	    private Object minorityInterest;
	    @SerializedName("netIncome")
	    @Expose
	    private String netIncome;
	    @SerializedName("sellingGeneralAdministrative")
	    @Expose
	    private String sellingGeneralAdministrative;
	    @SerializedName("grossProfit")
	    @Expose
	    private String grossProfit;
	    @SerializedName("ebit")
	    @Expose
	    private String ebit;
	    @SerializedName("operatingIncome")
	    @Expose
	    private String operatingIncome;
	    @SerializedName("otherOperatingExpenses")
	    @Expose
	    private Object otherOperatingExpenses;
	    @SerializedName("interestExpense")
	    @Expose
	    private Object interestExpense;
	    @SerializedName("extraordinaryItems")
	    @Expose
	    private Object extraordinaryItems;
	    @SerializedName("nonRecurring")
	    @Expose
	    private Object nonRecurring;
	    @SerializedName("otherItems")
	    @Expose
	    private Object otherItems;
	    @SerializedName("incomeTaxExpense")
	    @Expose
	    private String incomeTaxExpense;
	    @SerializedName("totalRevenue")
	    @Expose
	    private String totalRevenue;
	    @SerializedName("totalOperatingExpenses")
	    @Expose
	    private String totalOperatingExpenses;
	    @SerializedName("costOfRevenue")
	    @Expose
	    private String costOfRevenue;
	    @SerializedName("totalOtherIncomeExpenseNet")
	    @Expose
	    private String totalOtherIncomeExpenseNet;
	    @SerializedName("discontinuedOperations")
	    @Expose
	    private Object discontinuedOperations;
	    @SerializedName("netIncomeFromContinuingOps")
	    @Expose
	    private String netIncomeFromContinuingOps;
	    @SerializedName("netIncomeApplicableToCommonShares")
	    @Expose
	    private String netIncomeApplicableToCommonShares;

	    public String getDate() {
	        return date;
	    }

	    public void setDate(String date) {
	        this.date = date;
	    }

	    public String getResearchDevelopment() {
	        return researchDevelopment;
	    }

	    public void setResearchDevelopment(String researchDevelopment) {
	        this.researchDevelopment = researchDevelopment;
	    }

	    public Object getEffectOfAccountingCharges() {
	        return effectOfAccountingCharges;
	    }

	    public void setEffectOfAccountingCharges(Object effectOfAccountingCharges) {
	        this.effectOfAccountingCharges = effectOfAccountingCharges;
	    }

	    public String getIncomeBeforeTax() {
	        return incomeBeforeTax;
	    }

	    public void setIncomeBeforeTax(String incomeBeforeTax) {
	        this.incomeBeforeTax = incomeBeforeTax;
	    }

	    public Object getMinorityInterest() {
	        return minorityInterest;
	    }

	    public void setMinorityInterest(Object minorityInterest) {
	        this.minorityInterest = minorityInterest;
	    }

	    public String getNetIncome() {
	        return netIncome;
	    }

	    public void setNetIncome(String netIncome) {
	        this.netIncome = netIncome;
	    }

	    public String getSellingGeneralAdministrative() {
	        return sellingGeneralAdministrative;
	    }

	    public void setSellingGeneralAdministrative(String sellingGeneralAdministrative) {
	        this.sellingGeneralAdministrative = sellingGeneralAdministrative;
	    }

	    public String getGrossProfit() {
	        return grossProfit;
	    }

	    public void setGrossProfit(String grossProfit) {
	        this.grossProfit = grossProfit;
	    }

	    public String getEbit() {
	        return ebit;
	    }

	    public void setEbit(String ebit) {
	        this.ebit = ebit;
	    }

	    public String getOperatingIncome() {
	        return operatingIncome;
	    }

	    public void setOperatingIncome(String operatingIncome) {
	        this.operatingIncome = operatingIncome;
	    }

	    public Object getOtherOperatingExpenses() {
	        return otherOperatingExpenses;
	    }

	    public void setOtherOperatingExpenses(Object otherOperatingExpenses) {
	        this.otherOperatingExpenses = otherOperatingExpenses;
	    }

	    public Object getInterestExpense() {
	        return interestExpense;
	    }

	    public void setInterestExpense(Object interestExpense) {
	        this.interestExpense = interestExpense;
	    }

	    public Object getExtraordinaryItems() {
	        return extraordinaryItems;
	    }

	    public void setExtraordinaryItems(Object extraordinaryItems) {
	        this.extraordinaryItems = extraordinaryItems;
	    }

	    public Object getNonRecurring() {
	        return nonRecurring;
	    }

	    public void setNonRecurring(Object nonRecurring) {
	        this.nonRecurring = nonRecurring;
	    }

	    public Object getOtherItems() {
	        return otherItems;
	    }

	    public void setOtherItems(Object otherItems) {
	        this.otherItems = otherItems;
	    }

	    public String getIncomeTaxExpense() {
	        return incomeTaxExpense;
	    }

	    public void setIncomeTaxExpense(String incomeTaxExpense) {
	        this.incomeTaxExpense = incomeTaxExpense;
	    }

	    public String getTotalRevenue() {
	        return totalRevenue;
	    }

	    public void setTotalRevenue(String totalRevenue) {
	        this.totalRevenue = totalRevenue;
	    }

	    public String getTotalOperatingExpenses() {
	        return totalOperatingExpenses;
	    }

	    public void setTotalOperatingExpenses(String totalOperatingExpenses) {
	        this.totalOperatingExpenses = totalOperatingExpenses;
	    }

	    public String getCostOfRevenue() {
	        return costOfRevenue;
	    }

	    public void setCostOfRevenue(String costOfRevenue) {
	        this.costOfRevenue = costOfRevenue;
	    }

	    public String getTotalOtherIncomeExpenseNet() {
	        return totalOtherIncomeExpenseNet;
	    }

	    public void setTotalOtherIncomeExpenseNet(String totalOtherIncomeExpenseNet) {
	        this.totalOtherIncomeExpenseNet = totalOtherIncomeExpenseNet;
	    }

	    public Object getDiscontinuedOperations() {
	        return discontinuedOperations;
	    }

	    public void setDiscontinuedOperations(Object discontinuedOperations) {
	        this.discontinuedOperations = discontinuedOperations;
	    }

	    public String getNetIncomeFromContinuingOps() {
	        return netIncomeFromContinuingOps;
	    }

	    public void setNetIncomeFromContinuingOps(String netIncomeFromContinuingOps) {
	        this.netIncomeFromContinuingOps = netIncomeFromContinuingOps;
	    }

	    public String getNetIncomeApplicableToCommonShares() {
	        return netIncomeApplicableToCommonShares;
	    }

	    public void setNetIncomeApplicableToCommonShares(String netIncomeApplicableToCommonShares) {
	        this.netIncomeApplicableToCommonShares = netIncomeApplicableToCommonShares;
	    }

	}