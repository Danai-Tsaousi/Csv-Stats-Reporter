package reporting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import datamodel.IResult;

public class ResultReporterForHtml implements IResultReporter {

	public void rasterToHTML(String fileName, String title, String[][] raster, int numRows, int numCols) {
		String header = new String("");
		header.concat("<!doctype html>");
		header.concat("\n");
		header.concat("<html>");
		header.concat("\n");
		header.concat("<head>");
		header.concat("\n");
		header.concat("<meta http-equiv=\"Content-Type\" content\"text/html; charset=windows-1253\">");
		header.concat("\n");
		header.concat(title);
		header.concat("\n");
		header.concat("</head>");
		header.concat("\n");
		header.concat("<body>");
		header.concat("\n");
		// Opening file to write, checking exception
		try {
			PrintWriter outputStream = new PrintWriter(new FileOutputStream(fileName)); // APPEND would be .... (new FileOutputStream(outputFileName, true));
			outputStream.println(header);

			outputStream.println("<table>");

			for(int i =0; i < numRows; i++){
				outputStream.println("<tr>");
				outputStream.print("<td>"+raster[i]+"</td>");
				
				outputStream.println("\n</tr>");
			}
			outputStream.println("</table>");
			outputStream.println("</body>\n</html>");
			outputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files.");
			System.exit(0);
		}

	}
	

	@Override
	public int reportResultInFile(IResult result, String filename) {

		DecimalFormat df = new DecimalFormat("###.##");
		//df.setDecimalSeparatorAlwaysShown(true);
		DecimalFormatSymbols dfs=new DecimalFormatSymbols();			
		dfs.setDecimalSeparator('.');	//otherwise, the String.format conversion makes "," in GR environments; I want "." for decimals
		df.setDecimalFormatSymbols(dfs);		
	
		
		int numRows = (result.getAggregateMeterKitchen().size())*3 + 12;
				
		String []raster = new String[numRows];
		raster[0] = "Kitchen";;
	
		//rasterToHTML("./output/Emps.html", "Weekly Stats Emps", raster, numRows);
		return 0;
	}
}
