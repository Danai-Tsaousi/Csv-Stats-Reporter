package timeaggregation;

import java.util.ArrayList;
import java.util.Arrays;

import datamodel.IResult;
import datamodel.MeasurementRecord;
import datamodel.Result;

public class Aggregator implements IAggregator{

	
	private String timeUnit;
	
	public Aggregator(String timeUnit) {
		
		this.timeUnit= timeUnit;
	}

	@Override
	public IResult aggregateByTimeUnit(ArrayList<MeasurementRecord> inputMeasurements, String aggFunction,
			String description) {
		Result res = new Result(timeUnit,aggFunction,description);
		
		for(MeasurementRecord r: inputMeasurements){
			res.add(timeUnit, r);
			if(res.add(timeUnit, r)== -1) {
				return null;
			}
			
		}
		return res;
	}

	@Override
	public String getTimeUnitType() {
		return timeUnit;
	}

}
