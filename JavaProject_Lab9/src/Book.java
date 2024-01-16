import java.time.Year;

public class Book {
	private String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void setPublishYear(int year) {
		this.publishyear = year;
	}
	
	public int getPublishYear() {
		return this.publishyear;
	}
	
	public int getTotalYear() {
		return Year.now().getValue()-getPublishYear();
	}
	
	public String toString() {
		return "Title: " 
				+ getTitle() 
				+ " published for " + getTotalYear() 
				+ " year (" + getPrice()
				+ " baht).";
	}
}
