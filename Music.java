/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */

public abstract class Music extends Media{

	/**
	 * Attributes 
	 */
	private String artist;
	private String title;
	private int year;

/**
 * this is a constructor
 * @param format gives the format of the music
 * @param isbn gives the isbn of the music
 * @param genre gives the genre of the music
 * @param artist gives the artist of the music 
 * @param title gives the title of the music
 * @param year gives the year the music was created 
 */
	public Music(Format format, String isbn, String genre, String artist, String title, int year){
		super(format,isbn,genre);
		this.artist = artist;
		this.title = title;
		this.year = year;
		
	}

	/**
	 * getter
	 * @return String gives artist of the music 
	 */

	public final String getArtist(){
		return this.artist;
	}

	/**
	 * getter
	 * @return String gives title of music 
	 */

	public final String getTitle(){
		return this.title;
	}

	/**
	 * getter
	 * @return year gives the year music was created 
	 */

	public final int getYear(){
		return this.year;
	}
/**
 * @return String gives the details of the music 
 */
	@Override
	public String toString(){
		return("Artist: " + artist + ", Year: " + year + ", Title: " + title + ", " + super.toString());
		//inheritance can enable code reuse 
	}

	/**
	 * @param media is the object being used to compare the media 
	 * @return int which indicates which media type should come first 
	 */

	public int compareTo(Media media){
		int value = 0;
		if (media instanceof Music){
			Music music = (Music)media;
			value = this.getArtist().compareTo(music.getArtist());
			if (value == 0){
				value = ((Integer)(this.getYear())).compareTo((Integer)(music.getYear()));
				if (value == 0){
					value = this.getTitle().compareTo(music.getTitle());
				}
			}
			
			return value;
		}

		return 1;
	

	}

}