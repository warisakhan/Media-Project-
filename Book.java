/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */

public class Book extends Media {
	/**
	 * Attributes 
	 */
	private String title;
	private String author;
	private String publisher;

	/**
	 * this is a constructor 
	 * @param format gives the format of the book
	 * @param isbn gives the isbn of the book
	 * @param genre gives the genre of the book
	 * @param author gives the author of the book
	 * @param title gives the title of the book 
	 * @param publisher gives the publisher of the book
	 */

	public Book(Format format, String isbn, String genre, String author, String title, String publisher){
		super(format,isbn,genre);
		this.author = author;
		this.title = title;
		this.publisher = publisher;
	}

	/**
	 * @return String which is a getter for the title
	 */

	public final String getTitle(){
		return title;
	}

	/**
	 * getter method
	 * @return String gives author
	 */

	public final String getAuthor(){
		return author;
	}

	/**
	 * getter
	 * @return String gives the publisher 
	 */

	public final String getPublisher(){
		return publisher;
	}

	/**
	 * @return String gives the details of the book 
	 */

	@Override
	public String toString(){
		return("Title: " + title + ", Author: " + author + ", " + super.toString());
	}

	/**
	 * @return String gives the type which is a book
	 */
	@Override
	public String getType(){
		return("Book");
	}

	/**
	 * @param media is the object that is being compared to in this class
	 * @return gives an int value which shows how the original object and the created object compare
	 */

	public int compareTo(Media media){
		int value = 0;
		if (media instanceof Book) {
			Book book = (Book)media;
			value = this.getAuthor().compareTo(book.getAuthor());
			if (value == 0){
				value = this.getTitle().compareTo(book.getTitle());
			
			}

			return value;


		}

		return -1;
	}
}