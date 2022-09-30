/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */

public class Single extends Music{

	/**
	 * this is a constructor 
	 * @param format gives format of the single
	 * @param isbn gives the isbn of the single
	 * @param genre gives the genre of the singlr
	 * @param artist gives the artist of the singlr
	 * @param title gives the title of the single 
	 * @param year gives the year single was produced 
	 */

	public Single(Format format, String isbn, String genre, String artist, String title, int year){
		super(format,isbn,genre,artist,title,year);
	}
/**
 * @return String gives the media type 
 */
	@Override
	public String getType(){
		return("Single");
	}


	
}