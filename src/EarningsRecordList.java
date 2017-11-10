package be.neesconsulting.coco.source.eod.json;

import com.google.gson.annotations.Expose;

public class EarningsRecordList {


	@Expose public  EarningsRecord earningsRecord[];

	public EarningsRecordList() {
		// TODO Auto-generated constructor stub
	}

	public EarningsRecordList(EarningsRecord[] earningsRecord){
		this.earningsRecord = earningsRecord;

	}
}