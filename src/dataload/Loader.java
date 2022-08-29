package dataload;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.StringTokenizer;

import datamodel.MeasurementRecord;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Loader implements ILoader<MeasurementRecord>{


	int x=0;

	public int load(String fileName, String delimeter, boolean hasHeaderLine, int numFields, ArrayList<MeasurementRecord> objCollection) {
		
		if (numFields < 1){
			System.out.println("Wrong number of fields, less than 1!");
			System.exit(0);		
		}
		//Opening files for read and write, checking exception
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new FileInputStream(fileName));

		} catch (FileNotFoundException e) {
			System.out.println("Problem opening file: " + fileName);
			System.exit(0);
		}

		int count = 0;

		//process the title of the csv
		if(hasHeaderLine){
			String titleLine = inputStream.nextLine(); //1st line with the headers
		}
		String line = "";
		//process the actual rows one by one
		while (inputStream.hasNextLine()) {
			line = inputStream.nextLine();
			
			if(isLineValid(line, numFields, delimeter)) {
				count++;
				StringTokenizer tokenizer = new StringTokenizer(line, delimeter);
				String[] tokens =  new String[numFields];
				for (int i=0; i< numFields;i++){
					tokens[i] = tokenizer.nextToken();
					
				}

				//ToDo: here add the method that takes the token and forms the object and puts it in the resultList			
				constructObjectFromRow(tokens, objCollection);
				//if (constructObjectFromRow(tokens,objCollection)!=0){
				//	System.out.println("ObjParsingError. I found a problem at line " + count + " of file " + fileName);
				//	System.exit(0);
								
				//}
			}
		}
			
		inputStream.close();
		System.out.println("Processed " + count + " rows and loaded " + objCollection.size() + " objects.");
		return count;
	}
	

	
	
	public int constructObjectFromRow(String[] tokens, ArrayList<MeasurementRecord> objCollection) {
		LocalDate date;
		LocalTime time;
		double kitchen;
		double washer;
		double heat;
		
		date = LocalDate.parse(tokens[0], DateTimeFormatter.ofPattern("d/M/yyyy"));
		time = LocalTime.parse(tokens[1], DateTimeFormatter.ofPattern("HH:mm:ss"));
		kitchen = Double.parseDouble(tokens[6]);
		washer = Double.parseDouble(tokens[7]);	
		heat = Double.parseDouble(tokens[8]);	
		
		MeasurementRecord m = new MeasurementRecord(date, time, kitchen, washer, heat);
		objCollection.add(m);	
		return 0;	
	}
	
	

	public boolean isThisDateValid(String date){
		
			if(date == null){
				return false;
			}
			DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			try {
				//if not valid, it will throw ParseException
				form.parse(date);
			} catch (Exception e) {	
				return false;
			}
			return true;
	}
	
	
	public boolean isThisTimeValid(String time){
		
		if(time == null){
			return false;
		}
		DateTimeFormatter form = DateTimeFormatter.ofPattern("HH:mm:ss");
		try {
			//if not valid, it will throw ParseException
			form.parse(time);
		} catch (Exception e) {	
			return false;
		}
		return true;
	}
	
	public boolean isLineValid(String line,int numFields,String delimeter){
		StringTokenizer tokenizer = new StringTokenizer(line, delimeter);

		if(tokenizer.countTokens() != numFields){
			return false;
		}

	
		return true;
	}
		
}
	
	
