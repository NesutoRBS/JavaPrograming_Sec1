
public class Book {
	private String title;
	private Author author;
	private int page;
	
	public Book(String title, Author author,int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	public Book(String title, Author author) {
		this.title = title;
		this.author = author;
	}
	
	public Book() {
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPage() {
		return page;
	}
	
	public String toString() {
		return title + " has " + page + " pages write by " + author; 
	}

}
