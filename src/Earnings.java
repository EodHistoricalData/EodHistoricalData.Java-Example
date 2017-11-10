
package be.neesconsulting.coco.source.eod.json;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Earnings {
	
	@SerializedName("History")
	@Expose
	private EarningsRecordList history = null;
	
	@SerializedName("Trend")
	@Expose
	private EarningsRecordList trend = null;

	public EarningsRecordList getHistory() {
	return history;
	}

	public void setHistory(EarningsRecordList history) {
	this.history = history;
	}

	public EarningsRecordList getTrend() {
	return trend;
	}

	public void setTrend(EarningsRecordList trend) {
	this.trend = trend;
	}
	/*
    @SerializedName("History")
    @Expose
    private History history;
    
	@Expose public  EarningsRecord earningsRecord[];

    @SerializedName("Trend")
    @Expose
    private Trend trend;

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    public Trend getTrend() {
        return trend;
    }

    public void setTrend(Trend trend) {
        this.trend = trend;
    }
*/
}
