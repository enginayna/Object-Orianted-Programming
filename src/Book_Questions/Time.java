package Book_Questions;

import java.sql.Date;

public class Time {
	
		
	private long hour;
	private long minute;
	private long second;
	
	public Time(){
		this(System.currentTimeMillis());
	}
	
	

	public Time(long elapsedTime) {
		setTime(elapsedTime);
	}
	public void setTime(long elapsedTime) {
		long millis = elapsedTime/1000;
		second = millis%60;
		minute = (millis/60)%60;
		hour = (millis/3600)%24;
		
	}
	
	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public String toString() {
		return String.format("%2d : %2d : %2d" , hour , minute , second);
	}
	
	public long getHour() {
		return hour;
	}

	public void setHour(long hour) {
		this.hour = hour;
	}

	public long getMinute() {
		return minute;
	}

	public void setMinute(long minute) {
		this.minute = minute;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}
	
}
