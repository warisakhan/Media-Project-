/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */
import java.util.ArrayList;
import java.util.List;
public class Movie extends Media{
	private String title;
	private String director;
	private int year;
	private List<String> cast = new ArrayList<>();

/**
 * this is a constructor 
 * @param format gives format of movie
 * @param isbn gives isbn of movie 
 * @param genre gives genre of movie
 * @param title gives title of movie 
 * @param director gives director of movie 
 * @param year gives year movie was made
 * @param cast gives the cast of the movie 
 */
	public Movie(Format format, String isbn, String genre, String title, String director,int year, List<String>cast){
		super(format,isbn,genre);
		this.title = title;
		this.director = director;
		this.year = year;
		cast.addAll(cast);
		this.cast = cast;
	}

	/**
	 * getter
	 * @return the title of the movie 
	 */

	public final String getTitle(){
		return title;
	}

	/**
	 * getter
	 * @return the director of the movie 
	 */

	public final String getDirector(){
		return director;
	}

	/**
	 * getter
	 * @return returns the year the movie was made
	 */

	public final int getYear(){
		return year;
	}

	/**
	 * getter
	 * @return the cast of the movie 
	 */

	public final List<String> getCast(){
		return cast;
	}

	/**
	 * gives the type of the media which is Movie 
	 */

	@Override
	public String getType(){
		return("Movie");
	}

	/**
	 * @return String gives the details of the movie 
	 */

	@Override
	public String toString(){
		return("Title: " + title + ", Year: " + year + ", " + super.toString());
	}

/**
 * @param media is the object being used to compare the original media 
 * @return int which returns the relative ordering of the media library 
 */
	@Override
	public int compareTo(Media media){
		int value = 0;
		if (media instanceof Movie){
		Movie movie = (Movie)media;
		value = this.getTitle().compareTo(movie.getTitle());
		if (value == 0){
			value = ((Integer)this.getYear()).compareTo((Integer)movie.getYear());

		}
		return value;
	}

		return -1;



	}


	
}