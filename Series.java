/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */
import java.util.ArrayList;
import java.util.List;
public class Series extends Media{
	private String title;
	private List<String> cast = new ArrayList<>();
	private List<String> episodes = new ArrayList<>();

	/**
	 * this is a constructor 
	 * @param format gives format of series
	 * @param isbn gives isbn of series
	 * @param genre gives genre of the series
	 * @param title gives the title of the series 
	 * @param cast gives the cast of the series 
	 * @param epsiodes gives the episodes of the series 
	 */

	public Series(Format format, String isbn, String genre, String title, List<String>cast, List<String>epsiodes){
		super(format,isbn,genre);
		this.title = title;
		cast.addAll(cast);
		epsiodes.addAll(episodes);
	}

/**
 * getter
 * @return String gives the title of the series
 */
	public final String getTitle(){
		return title;
	}

	/**
	 * getter
	 * @return gives the cast of the series
	 */

	public final List<String> getCast(){
		return cast;
	}

	/**
	 * getter
	 * @return the episodes in the series 
	 */

	public final List<String> getEpisodes(){
		return episodes;
	}

	/**
	 * @return String gives the media type 
	 */

	@Override

	public String getType(){
		return ("Series");
	}

	/**
	 * @return String gives the detials of the series 
	 */

	@Override
	public String toString(){
		return ("Title: " + title + ", " + super.toString());

	}

	/**
	 * @param media is the object being used to compare
	 * @return int shows which order the library should be put in
	 */

	public int compareTo(Media media){
		int value = 0;
		if (media instanceof Series){
		Series series = (Series)media;
		value = this.getTitle().compareTo(series.getTitle());

		return value;
		}

		if (media instanceof Music){
			value = -1;
			return value;
		}

		
		return 1;

	}


}