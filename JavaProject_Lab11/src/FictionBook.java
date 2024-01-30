import java.time.*;

public class FictionBook implements Author,Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	//Constructors
	FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		this.author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		return this.author_name.indexOf(" ") > 0 ;
	}
	
	public String getLastName() {
		return this.author_name.substring(this.author_name.indexOf(" ")).trim().toUpperCase();
	}
	
	public String getFirstName() {
		return this.author_name.substring(0, this.author_name.indexOf(" ")).toUpperCase();
	}

	public boolean checkEmail() {
		return !(email.startsWith(" ")
				|| email.startsWith("@")
				|| (!(email.endsWith("@hotmail.com"))
				&& !(email.endsWith("@windowslive.com"))));
	}
	
	public String getTitle() {
		return title;
	}
	
	public int totalPublicYear() {
		return Year.now().getValue() - this.publicYear;
	}
	
	public String toString() {
		return this.title + " write by "
				+ getLastName().substring(0,1) + "."
				+ getFirstName() + " ("
				+ this.email + ")"
				+ "\nPublished for " + totalPublicYear() + " years.";
	}
	
	
}
