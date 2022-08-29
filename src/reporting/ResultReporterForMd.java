package reporting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;

import datamodel.IResult;

public class ResultReporterForMd implements IResultReporter {

	private HashMap<String, Double> kmap_res;
	private HashMap<String, Double> lmap_res;
	private HashMap<String, Double> amap_res;

	@Override
	public int reportResultInFile(IResult result, String filename) {
		// TODO Auto-generated method stub
		PrintWriter outputStream = null;
	

		//Opening files for read and write, checking exception
		try {
			outputStream = new PrintWriter(new FileOutputStream(filename));
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening report.");
			System.exit(0);
		}
		kmap_res = result.getAggregateMeterKitchen();
		lmap_res = result.getAggregateMeterLaundry();
		amap_res = result.getAggregateMeterAC();
		
		outputStream.println(result.getDescription());
		outputStream.println("	     ");
		outputStream.println(result.getAggregateFunction()+"consumption (watt-hours) over (a) Kitchen, (b) Laundry, (c) A/C");
		outputStream.println("       ");
		outputStream.println("Kitchen");
		outputStream.println("        ");
		for(String s: kmap_res.keySet()){
			String value = kmap_res.get(s).toString();
			outputStream.println(s+ " "+ value);
		
		}
		outputStream.println("		");
		outputStream.println("Laundry");
		outputStream.println("		");
		for(String s: lmap_res.keySet()){
			String value = lmap_res.get(s).toString();
			outputStream.println(s+ " "+ value);
		}
		outputStream.println("		");
		outputStream.println("A/C");
		outputStream.println("		");
		for(String s: amap_res.keySet()){
			String value = amap_res.get(s).toString();
			outputStream.println(s+ " "+ value);
		}
		
		outputStream.close();
	
		return 0;
	}

}