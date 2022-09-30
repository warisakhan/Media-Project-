/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */

public abstract class Media implements Comparable<Media> {
	private String isbn;
	private String genre;
	private Format format;

/**
 * this is a constructor 
 * @param format gives format of the type
 * @param isbn gives isbn of the type
 * @param genre gives genre of the type 
 */
	public Media(Format format, String isbn, String genre){
		this.isbn = isbn;
		this.genre = genre;
		this.format = format;
	}

	/**
	 * getter
	 * @return String gives the isbn 
	 */

	public final String getIsbn(){
		return isbn;
	}

	/**
	 * getter
	 * @return String gives the genre 
	 */

	public final String getGenre(){
		return genre;
	}

	/**
	 * getter
	 * @return Format gives the format 
	 */

	public final Format getFormat(){
		return format;
	}

	/**
	 * getType method 
	 * @return returns a string representing the type of media 
	 */

	public abstract String getType();

	/**
	 * @param obj is the object being used to compare the isbn
	 * @return boolean returns true if the isbns match, else returns false 
	 */
	@Override
	public boolean equals(Object obj){

		boolean finalAns = false;
		if (obj instanceof Media){
			if ((((Media) obj).getIsbn()) == this.isbn){
				finalAns = true;

			}

			else{
				finalAns = false;
			}


		}

		return finalAns;
	}

	/**
	 * @return String gives the basic details of the media type 
	 */

	public String toString(){
		return("Type: " + getType() + ", ISBN: " + isbn + ", Genre: " + genre + ", Format: " + format);
		//type is by the getType 
	}



	
}