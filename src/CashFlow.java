
package be.neesconsulting.coco.source.eod.json;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CashFlow {

    public CashFlow(CashFlowRecordList quarterly, CashFlowRecordList yearly) {
		this.quarterly = quarterly;
		this.yearly = yearly;
	}

	public CashFlow() {
		// TODO Auto-generated constructor stub
	}
 
    @SerializedName("quarterly")
    
    // @Expose private CashFlowRecordList quarterly;
	@Expose public  CashFlowRecordList quarterly;
	
    @SerializedName("yearly")
    //@Expose private CashFlowRecordList yearly;
	@Expose public  CashFlowRecordList yearly;

    public CashFlowRecordList getQuarterly() {
        return quarterly;
    }

    public void setQuarterly(CashFlowRecordList quarterly) {
        this.quarterly = quarterly;
    }

    public CashFlowRecordList getYearly() {
        return yearly;
    }

    public void setYearly(CashFlowRecordList yearly) {
        this.yearly = yearly;
    }


 
}
