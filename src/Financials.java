
package be.neesconsulting.coco.source.eod.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Financials {

    @SerializedName("Balance_Sheet")
    @Expose
    private BalanceSheet balanceSheet;
    @SerializedName("Cash_Flow")
    @Expose
    private CashFlow cashFlow;
    @SerializedName("Income_Statement")
    @Expose
    private IncomeStatement incomeStatement;

    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    public void setBalanceSheet(BalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
    }

    public CashFlow getCashFlow() {
        return cashFlow;
    }

    public void setCashFlow(CashFlow cashFlow) {
        this.cashFlow = cashFlow;
    }

    public IncomeStatement getIncomeStatement() {
        return incomeStatement;
    }

    public void setIncomeStatement(IncomeStatement incomeStatement) {
        this.incomeStatement = incomeStatement;
    }

}
