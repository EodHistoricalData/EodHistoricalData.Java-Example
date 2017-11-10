package be.neesconsulting.coco.source.eod.json;

import com.google.gson.annotations.Expose;

public class IncomeRecordList {


	@Expose public  IncomeRecord incomeRecord[];

	public IncomeRecordList() {
		// TODO Auto-generated constructor stub
	}

	public IncomeRecordList(IncomeRecord[] incomeRecord){
		this.incomeRecord = incomeRecord;

	}
}