
package be.neesconsulting.coco.source.eod.json;


import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IncomeStatement {

    public IncomeStatement(IncomeRecordList quarterly, IncomeRecordList yearly) {
		this.quarterly = quarterly;
		this.yearly = yearly;
	}

	public IncomeStatement() {
		// TODO Auto-generated constructor stub
	}
    
    @SerializedName("quarterly")
    @Expose
    private IncomeRecordList quarterly;
    @SerializedName("yearly")
    @Expose
    private IncomeRecordList yearly;

    public IncomeRecordList getQuarterly() {
        return quarterly;
    }

    public void setQuarterly(IncomeRecordList quarterly) {
        this.quarterly = quarterly;
    }

    public IncomeRecordList getYearly() {
        return yearly;
    }

    public void setYearly(IncomeRecordList yearly) {
        this.yearly = yearly;
    }

    


 
    }

