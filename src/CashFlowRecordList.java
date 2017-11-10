package be.neesconsulting.coco.source.eod.json;

import com.google.gson.annotations.Expose;

public class CashFlowRecordList {

    	@Expose public  CashFlowRecord cashFlowRecord[];

        public CashFlowRecordList() {
    		// TODO Auto-generated constructor stub
    	}
        
        public CashFlowRecordList(CashFlowRecord[] cashFlowRecord){
            this.cashFlowRecord = cashFlowRecord;

        }
    }