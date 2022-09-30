/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */

public class MediaAlreadyInLibrary extends Exception {
	private String name;
	private Media media;
	//do this properly 

	/**
	 * constructor that calls the super class 
	 */

	public MediaAlreadyInLibrary(){
		super();
	}

	/**
	 * constructor 
	 * @param name gives the name of the duplicate media 
	 * @param media gives reference to duplicate media item 
	 */

	public MediaAlreadyInLibrary(String name, Media media){
		super("Media already in library");
		this.name = name;
		this.media = media;
	}

	/**
	 * getter
	 * @return String returns name 
	 */

	public final String getName(){
		return name;
	}

	/**
	 * getter
	 * @return media of the duplicate type 
	 */

	public final Media getMedia(){
		return media;
	}
	

	
}