package mainengine;

import java.util.ArrayList;

import datamodel.IResult;
import datamodel.MeasurementRecord;
import dataload.Loader;
import timeaggregation.Aggregator;
import reporting.IResultReporter;
import reporting.ReporterFactory;
public class MainEngine implements IMainEngine{



	public MainEngine() {
		
	}

	@Override
	public int loadData(String fileName, String delimeter, Boolean hasHeaderLine, int numFields,
			ArrayList<MeasurementRecord> objCollection) {
		
		Loader loader = new Loader();
		return loader.load(fileName, delimeter, hasHeaderLine, numFields, objCollection) ;
	}

	@Override
	public IResult aggregateByTimeUnit(ArrayList<MeasurementRecord> inputMeasurements, String aggregatorType,
			String aggFunction, String description) {
		Aggregator aggregator = new Aggregator(aggregatorType);
		return aggregator.aggregateByTimeUnit(inputMeasurements, aggFunction, description);
	}

	@Override
	public int reportResultInFile(IResult result, String reportType, String filename) {
		int x = 0;
		ReporterFactory reporterFactory = new ReporterFactory();
		IResultReporter reporter = reporterFactory.createReporter(reportType);
		x=reporter.reportResultInFile(result, filename);
		if(x<0) {
			x=-2;
		}
		return x;
	}



}
