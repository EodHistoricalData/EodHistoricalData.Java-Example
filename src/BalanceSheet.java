
package be.neesconsulting.coco.source.eod.json;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BalanceSheet {

    public BalanceSheet(BalanceRecordList quarterly, BalanceRecordList yearly) {
		this.quarterly = quarterly;
		this.yearly = yearly;
	}

	public BalanceSheet() {
		// TODO Auto-generated constructor stub
	}
 

    @SerializedName("quarterly")
    @Expose private BalanceRecordList quarterly;

    @SerializedName("yearly")
    @Expose private BalanceRecordList yearly;

    public BalanceRecordList getQuarterly() {
        return quarterly;
    }

    public void setQuarterly(BalanceRecordList quarterly) {
        this.quarterly = quarterly;
    }

    public BalanceRecordList getYearly() {
        return yearly;
    }

    public void setYearly(BalanceRecordList yearly) {
        this.yearly = yearly;
    }



 
}
