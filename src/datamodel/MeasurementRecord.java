package datamodel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class MeasurementRecord {
	

	private LocalDate date;
	private LocalTime time;
	private double kitchen;
	private double washer;
	private double heat;



	public MeasurementRecord() {
		
	}
	

	public MeasurementRecord(LocalDate d, LocalTime t, double k, double w, double h) {
		date = d;
		time = t;
		kitchen = k;
		washer = w;
		heat = h;
	}

	
	public void setDate(LocalDate date) {
		this.date=date;
	}
	public LocalDate getDate() {
		return date;
	}
	
	public void setTime(LocalTime time) {
		this.time = time;
	}
		
	public LocalTime getTime() {
		return time;
	}

	public double getKitchen() {
		return kitchen;
	}

	public void setKitchen(double kitchen) {
		this.kitchen = kitchen;
	}

	public double getWasher() {
		return washer;
	}

	public void setWasher(double washer) {
		this.washer = washer;
	}

	public double getHeat() {
		return heat;
	}

	public void setHeat(double heat) {
		this.heat = heat;
	}
	

}
