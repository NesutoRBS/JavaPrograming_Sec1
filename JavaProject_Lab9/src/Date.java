
public class Date {
	private int year,month,day;
	
	Date(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public String toString() {
		//built-in function String.format() to form a formatted string
		//Specifier "0" to print leading zeros "MM/DD/YYYY"
		return String.format("%02d/%02d/%4d", month,day,year);
	}
	
	public void setDate(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
}
