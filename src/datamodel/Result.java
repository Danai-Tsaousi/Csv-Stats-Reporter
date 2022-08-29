package datamodel;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

import mainengine.*;
import timeaggregation.*;
public class Result implements IResult {
	
	public Result() {
		
	}

	public Result(String t,String a,String d) {
		timeUnit=t;
		aggFunction=a;
		description=d;
	}

	//SEASONS
    ArrayList<MeasurementRecord> WINTER = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> SUMMER = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> SPRING = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> AUTUMN = new ArrayList<MeasurementRecord>() ;
    
    //MONTHS
    ArrayList<MeasurementRecord> JAN = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> FEB = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> MAR = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> APR = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> MAY = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> JUN = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> JUL = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> AUG = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> SEP = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> OCT = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> NOV = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> DEC = new ArrayList<MeasurementRecord>() ;
    
    //DAYS
    ArrayList<MeasurementRecord> MON = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> TUE = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> WED = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> THU = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> FRI = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> SAT = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> SUN = new ArrayList<MeasurementRecord>() ;
    
    //DURATION
    ArrayList<MeasurementRecord> NIGHT = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> EARLY_MORNING = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> MORNING = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> AFTERNOON = new ArrayList<MeasurementRecord>() ;
    ArrayList<MeasurementRecord> EVENING = new ArrayList<MeasurementRecord>() ;
    
    //ARRAYLISTS GIA KITCHEN
    
    //double kitchen months 12
    ArrayList<Double> kjan = new ArrayList<Double>() ;
    ArrayList<Double> kfeb= new ArrayList<Double>() ;
    ArrayList<Double> kmar= new ArrayList<Double>() ;
    ArrayList<Double> kapr= new ArrayList<Double>() ;
    ArrayList<Double> kmay= new ArrayList<Double>() ;
    ArrayList<Double> kjun= new ArrayList<Double>() ;
    ArrayList<Double> kjul= new ArrayList<Double>() ;
    ArrayList<Double> kaug= new ArrayList<Double>() ;
    ArrayList<Double> ksep= new ArrayList<Double>() ;
    ArrayList<Double> koct= new ArrayList<Double>() ;
    ArrayList<Double> knov= new ArrayList<Double>() ;
    ArrayList<Double> kdec= new ArrayList<Double>() ;

    // 7 meres
    ArrayList<Double> kmon = new ArrayList<Double>() ;
    ArrayList<Double> ktue = new ArrayList<Double>() ;
    ArrayList<Double> kwed = new ArrayList<Double>() ;
    ArrayList<Double> kthu = new ArrayList<Double>() ;
    ArrayList<Double> kfri = new ArrayList<Double>() ;
    ArrayList<Double> ksat = new ArrayList<Double>() ;
    ArrayList<Double> ksun = new ArrayList<Double>() ;
    
    
    //4 epoxes
    ArrayList<Double> kwin = new ArrayList<Double>() ;
    ArrayList<Double> ksum = new ArrayList<Double>() ;
    ArrayList<Double> kspr = new ArrayList<Double>() ;
    ArrayList<Double> kaut = new ArrayList<Double>() ;
    
    //4 xronika diastimata
    ArrayList<Double> kmor = new ArrayList<Double>() ;
    ArrayList<Double> kemo = new ArrayList<Double>() ;
    ArrayList<Double> kaft = new ArrayList<Double>() ;
    ArrayList<Double> keve = new ArrayList<Double>() ;
    ArrayList<Double> knig = new ArrayList<Double>() ;
    
    //LAUNDRY ARRAYLISTS
    
    //double LAUNDRY months 12
    ArrayList<Double> ljan = new ArrayList<Double>() ;
    ArrayList<Double> lfeb= new ArrayList<Double>() ;
    ArrayList<Double> lmar= new ArrayList<Double>() ;
    ArrayList<Double> lapr= new ArrayList<Double>() ;
    ArrayList<Double> lmay= new ArrayList<Double>() ;
    ArrayList<Double> ljun= new ArrayList<Double>() ;
    ArrayList<Double> ljul= new ArrayList<Double>() ;
    ArrayList<Double> laug= new ArrayList<Double>() ;
    ArrayList<Double> lsep= new ArrayList<Double>() ;
    ArrayList<Double> loct= new ArrayList<Double>() ;
    ArrayList<Double> lnov= new ArrayList<Double>() ;
    ArrayList<Double> ldec= new ArrayList<Double>() ;
    
    //double LAUNDRY 7 days
    ArrayList<Double> lmon = new ArrayList<Double>() ;
    ArrayList<Double> ltue = new ArrayList<Double>() ;
    ArrayList<Double> lwed = new ArrayList<Double>() ;
    ArrayList<Double> lthu = new ArrayList<Double>() ;
    ArrayList<Double> lfri = new ArrayList<Double>() ;
    ArrayList<Double> lsat = new ArrayList<Double>() ;
    ArrayList<Double> lsun = new ArrayList<Double>() ;
    
    //double LAUNDRY 4 seasons
    ArrayList<Double> lwin = new ArrayList<Double>() ;
    ArrayList<Double> lsum = new ArrayList<Double>() ;
    ArrayList<Double> lspr = new ArrayList<Double>() ;
    ArrayList<Double> laut = new ArrayList<Double>() ;
    
    //double LAUNDRY 5 time periods
    ArrayList<Double> lmor = new ArrayList<Double>() ;
    ArrayList<Double> lemo = new ArrayList<Double>() ;
    ArrayList<Double> laft = new ArrayList<Double>() ;
    ArrayList<Double> leve = new ArrayList<Double>() ;
    ArrayList<Double> lnig = new ArrayList<Double>() ;
    
    //double AC months 12
    ArrayList<Double> ajan = new ArrayList<Double>() ;
    ArrayList<Double> afeb= new ArrayList<Double>() ;
    ArrayList<Double> amar= new ArrayList<Double>() ;
    ArrayList<Double> aapr= new ArrayList<Double>() ;
    ArrayList<Double> amay= new ArrayList<Double>() ;
    ArrayList<Double> ajun= new ArrayList<Double>() ;
    ArrayList<Double> ajul= new ArrayList<Double>() ;
    ArrayList<Double> aaug= new ArrayList<Double>() ;
    ArrayList<Double> asep= new ArrayList<Double>() ;
    ArrayList<Double> aoct= new ArrayList<Double>() ;
    ArrayList<Double> anov= new ArrayList<Double>() ;
    ArrayList<Double> adec= new ArrayList<Double>() ;
    
    //double AC 7 days
    ArrayList<Double> amon = new ArrayList<Double>() ;
    ArrayList<Double> atue = new ArrayList<Double>() ;
    ArrayList<Double> awed = new ArrayList<Double>() ;
    ArrayList<Double> athu = new ArrayList<Double>() ;
    ArrayList<Double> afri = new ArrayList<Double>() ;
    ArrayList<Double> asat = new ArrayList<Double>() ;
    ArrayList<Double> asun = new ArrayList<Double>() ;
    
    //double AC 4 seasons
    ArrayList<Double> awin = new ArrayList<Double>() ;
    ArrayList<Double> asum = new ArrayList<Double>() ;
    ArrayList<Double> aspr = new ArrayList<Double>() ;
    ArrayList<Double> aaut = new ArrayList<Double>() ;
    
    //double AC 5 time periods
    ArrayList<Double> amor = new ArrayList<Double>() ;
    ArrayList<Double> aemo = new ArrayList<Double>() ;
    ArrayList<Double> aaft = new ArrayList<Double>() ;
    ArrayList<Double> aeve = new ArrayList<Double>() ;
    ArrayList<Double> anig = new ArrayList<Double>() ;
    
	HashMap<String, ArrayList<MeasurementRecord>> map_months = new HashMap<String, ArrayList<MeasurementRecord>>(); 
	HashMap<String, ArrayList<MeasurementRecord>> map_days = new HashMap<String, ArrayList<MeasurementRecord>>(); 
	HashMap<String, ArrayList<MeasurementRecord>> map_seasons = new HashMap<String, ArrayList<MeasurementRecord>>(); 
	HashMap<String, ArrayList<MeasurementRecord>> map_duration = new HashMap<String, ArrayList<MeasurementRecord>>(); 
	
	HashMap<String, Double> kit_months = new HashMap<String, Double>(); 
	HashMap<String, Double> kit_days = new HashMap<String, Double>(); 
	HashMap<String, Double> kit_seasons = new HashMap<String, Double>(); 
	HashMap<String, Double> kit_duration = new HashMap<String, Double>(); 

	HashMap<String, Double> was_months = new HashMap<String, Double>(); 
	HashMap<String, Double> was_days = new HashMap<String, Double>(); 
	HashMap<String, Double> was_seasons = new HashMap<String, Double>(); 
	HashMap<String, Double> was_duration = new HashMap<String, Double>(); 

	HashMap<String, Double> AC_months = new HashMap<String, Double>(); 
	HashMap<String, Double> AC_days = new HashMap<String, Double>(); 
	HashMap<String, Double> AC_seasons = new HashMap<String, Double>(); 
	HashMap<String, Double> AC_duration = new HashMap<String, Double>(); 
	

    //fields and arrays

	private String description;
	private String aggFunction;
	private String timeUnit;
	
    String W[] = { "JAN", "FEB", "NOV", "DEC"};	    
    String A[] = {  "SEP", "OCT"};	    
    String SM[] = {"MAY", "JUN", "JUL" ,"AUG"};
    String SP[] = {  "MAR", "APR"};


	
	@Override
	public int add(String timeUnit, MeasurementRecord record) {
		int s = 0;

	    if(timeUnit.equals("dayofweek")){
	    	if(record.getDate().getDayOfWeek().toString().contains("MON")) {
				MON.add(record);
				s = MON.size();
	    	}else if(record.getDate().getDayOfWeek().toString().contains("TUE")) {
				TUE.add(record);
				s = TUE.size();
	    	}else if(record.getDate().getDayOfWeek().toString().contains("WED")) {
				WED.add(record);
				s =WED.size();
	    	}else if(record.getDate().getDayOfWeek().toString().contains("THU")) {
				THU.add(record);
				s = THU.size();
	    	}else if(record.getDate().getDayOfWeek().toString().contains("FRI")) {
				FRI.add(record);
				s = FRI.size();
	    	}else if(record.getDate().getDayOfWeek().toString().contains("SAT")) {
				SAT.add(record);
				s = SAT.size();
	    	}else if(record.getDate().getDayOfWeek().toString().contains("SUN")) {
				SUN.add(record);
				s = SUN.size();
	    	}else {
	    		s=-1;
	    	}
	        
	    }else if(timeUnit.equals("month")) {
	    	if(record.getDate().getMonth().toString().contains("JAN")) {
	    		JAN.add(record);
	    		s = JAN.size();
	    	}else if(record.getDate().getMonth().toString().contains("FEB")) {
	    		FEB.add(record);
	    		s = FEB.size();
	    	}else if(record.getDate().getMonth().toString().contains("MAR")) {
	    		MAR.add(record);
	    		s = MAR.size();
	    	}else if(record.getDate().getMonth().toString().contains("APR")) {
	    		APR.add(record);
	    		s = APR.size();
	    	}else if(record.getDate().getMonth().toString().contains("MAY")) {
	    		MAY.add(record);
	    		s = MAY.size();
	    	}else if(record.getDate().getMonth().toString().contains("JUN")) {
	    		JUN.add(record);
	    		s = JUN.size();
	    	}else if(record.getDate().getMonth().toString().contains("JUL")) {
	    		JUL.add(record);
	    		s = JUL.size();
	    	}else if(record.getDate().getMonth().toString().contains("AUG")) {
	    		AUG.add(record);
	    		s = AUG.size();
	    	}else if(record.getDate().getMonth().toString().contains("SEP")) {
	    		SEP.add(record);
	    		s = SEP.size();
	    	}else if(record.getDate().getMonth().toString().contains("OCT")) {
		    	OCT.add(record);
		    	s = OCT.size();
	    	}else if(record.getDate().getMonth().toString().contains("NOV")) {
			    NOV.add(record);
			    s = NOV.size();
	    	}else if(record.getDate().getMonth().toString().contains("DEC")) {
	    		DEC.add(record);
	    		s = DEC.size();
	    	}
	    	
	    }else if(timeUnit.equals("season")) {
	    	if(timeUnit.equals("WINTER")){
	    		if(Arrays.asList(W).contains(record.getDate().getMonth().toString())){
	    			WINTER.add(record);
	    		}s =  WINTER.size();
	    	}else if(timeUnit.equals("SPRING")) {
	    		if(Arrays.asList(SP).contains(record.getDate().getMonth().toString())){
	    			SPRING.add(record);
	    		}s =  SPRING.size();
	    	}else if(timeUnit.equals("SUMMER")) {
	    		if(Arrays.asList(SM).contains(record.getDate().getMonth().toString())){
	    			SUMMER.add(record);
	    		}s = SUMMER.size();
	    	}else if(timeUnit.equals("AUTUMN")) {
	    		if(Arrays.asList(A).contains(record.getDate().getMonth().toString())){
	    			AUTUMN.add(record);
	    		} s = AUTUMN.size();
	    	}
	    	
	    }else if(timeUnit.equals("periodofday")) {
	    	if(timeUnit.equals("NIGHT")) {
	    		LocalTime start = LocalTime.parse("21:00:00",DateTimeFormatter.ofPattern("HH:mm:ss"));
	    		LocalTime stop = LocalTime.parse("05:00:00",DateTimeFormatter.ofPattern("HH:mm:ss"));
	    		if ( ( ! (record.getTime()).isBefore( start ) ) && (record.getTime()).isBefore( stop ) ) {
	    		    NIGHT.add(record);
	    		}s= NIGHT.size();
	    	}else if(timeUnit.equals("EARLY_MORNING")) {
	    		LocalTime start = LocalTime.parse("05:00:00",DateTimeFormatter.ofPattern("HH:mm:ss"));
	    		LocalTime stop = LocalTime.parse("09:00:00",DateTimeFormatter.ofPattern("HH:mm:ss"));
	    		if ( ( ! (record.getTime()).isBefore( start ) ) && (record.getTime()).isBefore( stop ) ) {
	    			EARLY_MORNING.add(record);
	    		}s= EARLY_MORNING.size();
	    	}else if(timeUnit.equals("MORNING")) {
	    		LocalTime start = LocalTime.parse("09:00:00",DateTimeFormatter.ofPattern("HH:mm:ss"));
	    		LocalTime stop = LocalTime.parse("13:00:00",DateTimeFormatter.ofPattern("HH:mm:ss"));
	    		if ( ( ! (record.getTime()).isBefore( start ) ) && (record.getTime()).isBefore( stop ) ) {
	    			MORNING.add(record);
	    		}s= MORNING.size();
	    	}else if(timeUnit.equals("AFTERNOON")) {
	    		LocalTime start = LocalTime.parse("13:00:00",DateTimeFormatter.ofPattern("HH:mm:ss"));
	    		LocalTime stop = LocalTime.parse("17:00:00",DateTimeFormatter.ofPattern("HH:mm:ss"));
	    		if ( ( ! (record.getTime()).isBefore( start ) ) && (record.getTime()).isBefore( stop ) ) {
	    			AFTERNOON.add(record);
	    		}s= AFTERNOON.size();
	    	}else if(timeUnit.equals("EVENING")) {
	    		LocalTime start = LocalTime.parse("17:00:00",DateTimeFormatter.ofPattern("HH:mm:ss"));
	    		LocalTime stop = LocalTime.parse("21:00:00",DateTimeFormatter.ofPattern("HH:mm:ss"));
	    		if ( ( ! (record.getTime()).isBefore( start ) ) && (record.getTime()).isBefore( stop ) ) {
	    			EVENING.add(record);
	    		}s= EVENING.size();
	    	}
	    }else{
	    	s = -1;
	    }
	    return s;

	}
	
	public void setDescription(String description) {
		this.description=description;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public HashMap<String, ArrayList<MeasurementRecord>> getDetailedResults() {
		return createHashmap(timeUnit);
	}
	

	public HashMap<String, ArrayList<MeasurementRecord>> createHashmap(String timeUnit) {
		
        // Creating an empty HashMap 
		HashMap<String, ArrayList<MeasurementRecord>> h = new HashMap<String, ArrayList<MeasurementRecord>>();

		if(timeUnit.equals("month")){
	    		map_months.put("JAN", JAN);
	    		map_months.put("FEB", FEB);
	    		map_months.put("MAR", MAR);
	    		map_months.put("APR", APR);    	
	    		map_months.put("MAY", MAY);
	    		map_months.put("JUN", JUN);	    
	    		map_months.put("JUL",JUL);	    
	    		map_months.put("AUG", AUG);  
	    		map_months.put("SEP", SEP);  
	    		map_months.put("OCT", OCT);  
	    		map_months.put("NOV", NOV);  
	    		map_months.put("DEC", DEC);
	    		h.putAll(map_months);
		}else if(timeUnit.equals("dayofweek")){
	    		map_days.put("MON", MON);
	    		map_days.put("TUE", TUE);
	    		map_days.put("WED", WED);
	    		map_days.put("THU", THU);
	    		map_days.put("FRI", FRI);
	    		map_days.put("SAT", SAT);
	    		map_days.put("SUN",SUN);
	    		h.putAll(map_days);
		}else if(timeUnit.equals("season")){
				map_seasons.put("WINTER", WINTER);
	    		map_seasons.put("SUMMER", SUMMER);
	    		map_seasons.put("AUTUMN", AUTUMN);
	    		map_seasons.put("SPRING",SPRING);
	    		h.putAll(map_seasons);
		}else if(timeUnit.equals("periodofday")){
	    		map_duration.put("NIGHT", NIGHT); 
	    		map_duration.put("EARLY_MORNING", EARLY_MORNING);
	    		map_duration.put("MORNING", MORNING);
	    		map_duration.put("AFTERNOON", AFTERNOON);
	    		map_duration.put("EVENING", EVENING);
	    		h.putAll(map_duration);
		}
		return h;
	}

	
	
	
	
	
	
	@Override
	public HashMap<String, Double> getAggregateMeterKitchen() {
		// TODO Auto-generated method stub
		return createKitchenMap(timeUnit,aggFunction);
	}
	
	public HashMap<String, Double> createKitchenMap(String timeUnit,String aggFunction) {
		
        // Creating an empty HashMap 
		HashMap<String, Double> k = new HashMap<String, Double>();

		if(timeUnit.equals("month")){
	    		for(MeasurementRecord r: JAN){
	    			kjan.add(r.getKitchen());
	    		}
	    		kit_months.put("JAN", AggFunction(aggFunction,kjan));
	    	
	    		for(MeasurementRecord r: FEB){
	    			kfeb.add(r.getKitchen());
	    		}
	    		kit_months.put("FEB", AggFunction(aggFunction,kfeb));
	    	
	    		for(MeasurementRecord r: MAR){
	    			kmar.add(r.getKitchen());
	    		}
	    		kit_months.put("MAR", AggFunction(aggFunction,kmar));
	   
	    		for(MeasurementRecord r: APR){
	    			kapr.add(r.getKitchen());
	    		}
	    		kit_months.put("APR", AggFunction(aggFunction,kapr));
	    	
	    		for(MeasurementRecord r: MAY){
	    			kmay.add(r.getKitchen());
	    		}
	    		kit_months.put("MAY", AggFunction(aggFunction,kmay));
	    
	    		for(MeasurementRecord r: JUN){
	    			kjun.add(r.getKitchen());
	    		}
	    		kit_months.put("JUN", AggFunction(aggFunction,kjun));
	    
	    		for(MeasurementRecord r: JUL){
	    			kjul.add(r.getKitchen());
	    		}
	    		kit_months.put("JUL", AggFunction(aggFunction,kjul));
	    	
	    		for(MeasurementRecord r: AUG){
	    			kaug.add(r.getKitchen());
	    		}
	    		kit_months.put("AUG", AggFunction(aggFunction,kaug));
	    	
	    		for(MeasurementRecord r: SEP){
	    			ksep.add(r.getKitchen());
	    		}
	    		kit_months.put("SEP", AggFunction(aggFunction,ksep));
	    	
	    		for(MeasurementRecord r: OCT){
	    			koct.add(r.getKitchen());
	    		}
	    		kit_months.put("OCT", AggFunction(aggFunction,koct));
	    
	    		for(MeasurementRecord r: NOV){
	    			knov.add(r.getKitchen());
	    		}
	    		kit_months.put("NOV", AggFunction(aggFunction,knov));
	    	
	    		for(MeasurementRecord r: DEC){
	    			kdec.add(r.getKitchen());
	    		}
	    		kit_months.put("DEC", AggFunction(aggFunction,kdec));
	    		k.putAll(kit_months);
		}else if(timeUnit.equals("dayofweek")){

	    		for(MeasurementRecord r: MON){
		    		kmon.add(r.getKitchen());
		    	}
	    		kit_days.put("MON", AggFunction(aggFunction,kmon));
	    		
	    		for(MeasurementRecord r: TUE){
		    		ktue.add(r.getKitchen());
		    	}
	    		kit_days.put("TUE", AggFunction(aggFunction,ktue));

	    		for(MeasurementRecord r: WED){
		    		kwed.add(r.getKitchen());
		    	}
	    		kit_days.put("WED", AggFunction(aggFunction,kwed));
	    	  
	    		for(MeasurementRecord r: THU){
		    		kthu.add(r.getKitchen());
		    	}
	    		kit_days.put("THU", AggFunction(aggFunction,kthu));
	    
	    		for(MeasurementRecord r: FRI){
		    		kmay.add(r.getKitchen());
		    	}
	    		kit_days.put("FRI", AggFunction(aggFunction,kfri));
	    	
	    		for(MeasurementRecord r: SAT){
		    		ksat.add(r.getKitchen());
		    	}
	    		kit_days.put("SAT", AggFunction(aggFunction,ksat));
	    	
	    		for(MeasurementRecord r: SUN){
		    		ksun.add(r.getKitchen());
		    	}
	    		kit_days.put("SUN", AggFunction(aggFunction,ksun));
	    		k.putAll(kit_days);
		}else if(timeUnit.equals("season")){
			
				for(MeasurementRecord r: WINTER){
					kwin.add(r.getKitchen());
	    		}
				kit_seasons.put(timeUnit, AggFunction(aggFunction,kwin));
	    	
				for(MeasurementRecord r: SUMMER){
					ksum.add(r.getKitchen());
	    		}
				kit_seasons.put(timeUnit, AggFunction(aggFunction,ksum));
	    	
				for(MeasurementRecord r: AUTUMN){
					kaut.add(r.getKitchen());
	    		}
				kit_seasons.put(timeUnit, AggFunction(aggFunction,kaut));
	    	
				for(MeasurementRecord r: SPRING){
					kspr.add(r.getKitchen());
	    		}
				kit_seasons.put(timeUnit, AggFunction(aggFunction,kspr));
				k.putAll(kit_seasons);
		    
		}else if(timeUnit.equals("periodofday")){
			
				for(MeasurementRecord r: NIGHT){
					knig.add(r.getKitchen());
	    		}
				kit_duration.put(timeUnit, AggFunction(aggFunction,knig));
	    	
				for(MeasurementRecord r: EARLY_MORNING){
					kemo.add(r.getKitchen());
	    		}
				kit_duration.put(timeUnit, AggFunction(aggFunction,kemo));
	    	
				for(MeasurementRecord r: MORNING){
					kmor.add(r.getKitchen());
	    		}
				kit_duration.put(timeUnit, AggFunction(aggFunction,kmor));
	    	
				for(MeasurementRecord r: AFTERNOON){
					kaft.add(r.getKitchen());
	    		}
				kit_duration.put(timeUnit, AggFunction(aggFunction,kaft));
	    
				for(MeasurementRecord r: EVENING){
					keve.add(r.getKitchen());
	    		}
				kit_duration.put(timeUnit, AggFunction(aggFunction,keve));
				k.putAll(kit_duration);
		}
		return k;
	}
	

	
	
	@Override
	public HashMap<String, Double> getAggregateMeterLaundry() {
		// TODO Auto-generated method stub
		return createLaundryMap(timeUnit);
	}
	
	public HashMap<String, Double> createLaundryMap(String timeUnit) {
		
        // Creating an empty HashMap 
		HashMap<String, Double> l = new HashMap<String, Double>();

		if(timeUnit.equals("month")){
		
			
			
	    		for(MeasurementRecord r: JAN){
	    			ljan.add(r.getWasher());
	    		}
	    		was_months.put("JAN", AggFunction(aggFunction,ljan));
	    
	    		for(MeasurementRecord r: FEB){
	    			lfeb.add(r.getWasher());
	    		}
	    		was_months.put("FEB", AggFunction(aggFunction,lfeb));
	    	
	    		for(MeasurementRecord r: MAR){
	    			lmar.add(r.getWasher());
	    		}
	    		was_months.put("MAR", AggFunction(aggFunction,lmar));
	    	
	    		for(MeasurementRecord r: APR){
	    			lapr.add(r.getWasher());
	    		}
	    		was_months.put("APR", AggFunction(aggFunction,lapr));
	    	
	    		for(MeasurementRecord r: MAY){
	    			lmay.add(r.getWasher());
	    		}
	    		was_months.put("MAY", AggFunction(aggFunction,lmay));
	    	
	    		for(MeasurementRecord r: JUN){
	    			ljun.add(r.getWasher());
	    		}
	    		was_months.put("JUN", AggFunction(aggFunction,ljun));
	    	
	    		for(MeasurementRecord r: JUL){
	    			ljul.add(r.getWasher());
	    		}
	    		was_months.put("JUL", AggFunction(aggFunction,ljul));
	    
	    		for(MeasurementRecord r: AUG){
	    			laug.add(r.getWasher());
	    		}
	    		was_months.put("AUG", AggFunction(aggFunction,laug));
	    	
	    		for(MeasurementRecord r: SEP){
	    			lsep.add(r.getWasher());
	    		}
	    		was_months.put("SEP", AggFunction(aggFunction,lsep));
	    
	    		for(MeasurementRecord r: OCT){
	    			loct.add(r.getWasher());
	    		}
	    		was_months.put("OCT", AggFunction(aggFunction,loct));
	    
	    		for(MeasurementRecord r: NOV){
	    			lnov.add(r.getWasher());
	    		}
	    		was_months.put("NOV", AggFunction(aggFunction,lnov));
	    	
	    		for(MeasurementRecord r: DEC){
	    			ldec.add(r.getWasher());
	    		}
	    		was_months.put("DEC", AggFunction(aggFunction,ldec));
	    	
	    	 l.putAll(was_months);
		    
		}else if(timeUnit.equals("dayofweek")){
			
	    		for(MeasurementRecord r: MON){
		    		lmon.add(r.getWasher());
		    	}
	    		was_days.put("MON", AggFunction(aggFunction,lmon));
	    
	    		for(MeasurementRecord r: TUE){
		    		ltue.add(r.getWasher());
		    	}
	    		was_days.put("TUE", AggFunction(aggFunction,ltue));
	
	    		for(MeasurementRecord r: WED){
		    		lwed.add(r.getWasher());
		    	}
	    		was_days.put("WED", AggFunction(aggFunction,lwed));
	 
	    		for(MeasurementRecord r: THU){
		    		lthu.add(r.getWasher());
		    	}
	    		was_days.put("THU", AggFunction(aggFunction,lthu));
	  
	    		for(MeasurementRecord r: FRI){
		    		lfri.add(r.getWasher());
		    	}
	    		was_days.put("FRI", AggFunction(aggFunction,lfri));
	    
	    		for(MeasurementRecord r: SAT){
		    		lsat.add(r.getWasher());
		    	}
	    		was_days.put("SAT", AggFunction(aggFunction,lsat));
	    	
	    		for(MeasurementRecord r: SUN){
		    		lsun.add(r.getWasher());
		    	}
	    		was_days.put("SUN", AggFunction(aggFunction,lsun));
	    	l.putAll(was_days);
		    
		}else if(timeUnit.equals("season")){
		
				for(MeasurementRecord r: WINTER){
					lwin.add(r.getWasher());
	    		}
				was_seasons.put("WINTER", AggFunction(aggFunction,lwin));
	    	
				for(MeasurementRecord r: SUMMER){
					lsum.add(r.getWasher());
	    		}
				was_seasons.put("SUMMER", AggFunction(aggFunction,lsum));
	
				for(MeasurementRecord r: AUTUMN){
					laut.add(r.getWasher());
	    		}
				was_seasons.put("AUTUMN", AggFunction(aggFunction,laut));
	 
				for(MeasurementRecord r: SPRING){
					lspr.add(r.getWasher());
	    		}
				was_seasons.put("SPRING", AggFunction(aggFunction,lspr));
	    	l.putAll(was_seasons);
		    
		}else if(timeUnit.equals("periodofday")){
			
				for(MeasurementRecord r: NIGHT){
					lnig.add(r.getWasher());
	    		}
				was_duration.put("NIGHT", AggFunction(aggFunction,lnig));
	   
				for(MeasurementRecord r: EARLY_MORNING){
					lemo.add(r.getWasher());
	    		}
				was_duration.put("EARLY_MORNING", AggFunction(aggFunction,lemo));
	    	
				for(MeasurementRecord r: MORNING){
					lmor.add(r.getWasher());
	    		}
				was_duration.put("MORNING", AggFunction(aggFunction,lmor));
	    
				for(MeasurementRecord r: AFTERNOON){
					laft.add(r.getWasher());
	    		}
				was_duration.put("AFTERNOON", AggFunction(aggFunction,laft));
	    
				for(MeasurementRecord r: EVENING){
					leve.add(r.getWasher());
	    		}
				was_duration.put("EVENING", AggFunction(aggFunction,leve));
	    	l.putAll(was_duration);
			
		}
		return l;
	}

	
	
	
	
	@Override
	public HashMap<String, Double> getAggregateMeterAC() {
		// TODO Auto-generated method stub
		return createACMap(timeUnit);
	}	
	
	
	public HashMap<String, Double> createACMap(String timeUnit) {
		
        // Creating an empty HashMap 
		HashMap<String, Double> a = new HashMap<String, Double>();

		if(timeUnit.equals("month")){
		
		
	    		for(MeasurementRecord r: JAN){
	    			ajan.add(r.getHeat());
	    		}
	    		AC_months.put("JAN", AggFunction(aggFunction,ajan));
	    
	    		for(MeasurementRecord r: FEB){
	    			afeb.add(r.getHeat());
	    		}
	    		AC_months.put("FEB", AggFunction(aggFunction,afeb));
	   
	    		for(MeasurementRecord r: MAR){
	    			amar.add(r.getHeat());
	    		}
	    		AC_months.put("MAR", AggFunction(aggFunction,amar));
	    
	    		for(MeasurementRecord r: APR){
	    			aapr.add(r.getHeat());
	    		}
	    		AC_months.put("APR", AggFunction(aggFunction,aapr));

	    		for(MeasurementRecord r: MAY){
	    			amay.add(r.getHeat());
	    		}
	    		AC_months.put("MAY", AggFunction(aggFunction,amay));
	 
	    		for(MeasurementRecord r: JUN){
	    			ajun.add(r.getHeat());
	    		}
	    		AC_months.put("JUN", AggFunction(aggFunction,ajun));
	    	
	    		for(MeasurementRecord r: JUL){
	    			ajul.add(r.getHeat());
	    		}
	    		AC_months.put("JUL", AggFunction(aggFunction,ajul));
	    	
	    		for(MeasurementRecord r: AUG){
	    			aaug.add(r.getHeat());
	    		}
	    		AC_months.put("AUG", AggFunction(aggFunction,aaug));
	    
	    		for(MeasurementRecord r: SEP){
	    			asep.add(r.getHeat());
	    		}
	    		AC_months.put("SEP", AggFunction(aggFunction,asep));
	    	
	    		for(MeasurementRecord r: OCT){
	    			aoct.add(r.getHeat());
	    		}
	    		AC_months.put("OCT", AggFunction(aggFunction,aoct));
	    	
	    		for(MeasurementRecord r: NOV){
	    			anov.add(r.getHeat());
	    		}
	    		AC_months.put("NOV", AggFunction(aggFunction,anov));
	    
	    		for(MeasurementRecord r: DEC){
	    			adec.add(r.getHeat());
	    		}
	    		AC_months.put("DEC", AggFunction(aggFunction,adec));
	    	
	    	 a.putAll(AC_months);
		    
		}else if(timeUnit.equals("dayofweek")){

		
	    		for(MeasurementRecord r: MON){
		    		amon.add(r.getHeat());
		    	}
	    		AC_days.put("MON", AggFunction(aggFunction,amon));
	    
	    	
	    		for(MeasurementRecord r: TUE){
		    		atue.add(r.getHeat());
		    	}
	    		AC_days.put("TUE", AggFunction(aggFunction,atue));
	    	
	    		for(MeasurementRecord r: WED){
		    		awed.add(r.getHeat());
		    	}
	    		AC_days.put("WED", AggFunction(aggFunction,awed));
	    
	    		for(MeasurementRecord r: THU){
		    		athu.add(r.getHeat());
		    	}
	    		AC_days.put("THU", AggFunction(aggFunction,athu));
	 
	    		for(MeasurementRecord r: FRI){
		    		afri.add(r.getHeat());
		    	}
	    		AC_days.put("FRI", AggFunction(aggFunction,afri));
	    
	    		for(MeasurementRecord r: SAT){
		    		asat.add(r.getHeat());
		    	}
	    		AC_days.put("SAT", AggFunction(aggFunction,asat));
	    	
	    		for(MeasurementRecord r: SUN){
		    		asun.add(r.getHeat());
		    	}
	    		AC_days.put("SUN", AggFunction(aggFunction,asun));
	    	a.putAll(AC_days);
		    
		}else if(timeUnit.equals("season")){
			
				for(MeasurementRecord r: WINTER){
					awin.add(r.getHeat());
	    		}
				AC_seasons.put("WINTER", AggFunction(aggFunction,awin));
	
				for(MeasurementRecord r: SUMMER){
					asum.add(r.getHeat());
	    		}
				AC_seasons.put("SUMMER", AggFunction(aggFunction,asum));
	    
				for(MeasurementRecord r: AUTUMN){
					aaut.add(r.getHeat());
	    		}
				AC_seasons.put("AUTUMN", AggFunction(aggFunction,aaut));
	    
				for(MeasurementRecord r: SPRING){
					aspr.add(r.getHeat());
	    		}
				AC_seasons.put("SPRING", AggFunction(aggFunction,aspr));
	    	a.putAll(AC_seasons);
		    
		    
		}else if(timeUnit.equals("periodofday")){
	
				for(MeasurementRecord r: NIGHT){
					anig.add(r.getHeat());
	    		}
				AC_duration.put("NIGHT", AggFunction(aggFunction,anig));
	
				for(MeasurementRecord r: EARLY_MORNING){
					aemo.add(r.getHeat());
	    		}
				AC_duration.put("EARLY_MORNING", AggFunction(aggFunction,aemo));
	
				for(MeasurementRecord r: MORNING){
					amor.add(r.getHeat());
	    		}
				AC_duration.put("MORNING", AggFunction(aggFunction,amor));
	    
				for(MeasurementRecord r: AFTERNOON){
					aaft.add(r.getHeat());
	    		}
				AC_duration.put("AFTERNOON", AggFunction(aggFunction,aaft));
	 
				for(MeasurementRecord r: EVENING){
					aeve.add(r.getHeat());
	    		}
				AC_duration.put("EVENING", AggFunction(aggFunction,aeve));
	    	a.putAll(AC_duration);
				
		}
		return a;
	}
	
	public double AggFunction(String aggFunction,ArrayList<Double> aggList) {
		double res = 0;
		double sum=0;
		if(aggFunction.equals("avg") ){
			for(int i=0;i<aggList.size();i++) {
				sum+=aggList.get(i);
				res=sum/aggList.size();
			}
		}else if(aggFunction.equals("sum")) {
			for(int i=0;i<aggList.size();i++) {
				sum+=aggList.get(i);
				res=sum;
			}	
		}
		return res;
		}

	public void setAggregateFunction(String aggFunction) {
		this.aggFunction=aggFunction;
	}

	@Override
	public String getAggregateFunction() {
		// TODO Auto-generated method stub
		return aggFunction;
	}
	
	
	public void setTimeUnit(String timeUnit) {
		this.timeUnit=timeUnit;
	}
	public String getTimeUnit() {
		return timeUnit;
	}
	



}
