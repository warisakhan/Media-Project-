/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */
import java.util.ArrayList;
import java.util.List;


public class Album extends Music{
	//how to create the trackList 

	private List<String> trackList = new ArrayList<>();
	
/** this is a constructor
 * @param format gives the format of the album
 * @param isbn gives the isbn of the album
 * @param artist gives the artist who wrote the album
 * @param title gives the title of the album
 * @param year gives the year the album came out 
 * @param trackList gives the list of the album songs 
 */
	public Album(Format format,String isbn, String genre, String artist,String title,int year, List<String> trackList){
		//how to put tracklist as parameter
		super(format,isbn,genre,artist,title,year);
		trackList.addAll(trackList);
		this.trackList = trackList;
		// ask about for each loop 
		
	}
/**
 * this is a getter
 * @return string which gives the tracklist
 */
	public final List<String> getTrackList(){
		return trackList;
	}


	
/**
 * @return String which shows this is an album
 */
	@Override
	public String getType(){
		return("Album");
	}

/**
 * @return String gives the details of the album
 */
	@Override
	public String toString(){
		return (super.toString() + ", Tracks: " + trackList);
	}

}