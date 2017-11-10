package be.neesconsulting.coco.source.eod.json;

import com.google.gson.annotations.Expose;

public class BalanceRecordList {

	@Expose public  BalanceRecord balanceRecord[];

    public BalanceRecordList() {
		// TODO Auto-generated constructor stub
	}
    
    public BalanceRecordList(BalanceRecord[] balanceRecord){
        this.balanceRecord = balanceRecord;

    }
}