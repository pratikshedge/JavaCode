package ObjectArray;

public class Book {
	
	private String BookName;
	private int BookID;
	private String Author;
	private String Publisher;
	private int NoOfCopies;
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public int getNoOfCopies() {
		return NoOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		NoOfCopies = noOfCopies;
	}
	public Book(String bookName, int bookID, String author, String publisher, int noOfCopies) {
		super();
		BookName = bookName;
		BookID = bookID;
		Author = author;
		Publisher = publisher;
		NoOfCopies = noOfCopies;
	}
	@Override
	public String toString() {
		return "Book [BookName=" + BookName + ", BookID=" + BookID + ", Author=" + Author + ", Publisher=" + Publisher
				+ ", NoOfCopies=" + NoOfCopies + "]";
	}
	
	

}
