/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */

public class SearchFilter implements MediaFilter {
	private String searchTerm;

/**
 * this is a constructor 
 * @param searchTerm is the string to search for each media item 
 */
	public SearchFilter(String searchTerm) {
		this.searchTerm = searchTerm;
	}
/**
 * @param match which is the object used to compare the media Libraray 
 * @return boolean returns true if label contains searchTerm, else returns false 
 */
	public boolean matches(Label<String, Media> match){
		boolean check = false;
		if (match.getKey().contains(searchTerm) || match.getValue().toString().contains(searchTerm)){
			check = true;

		}

		return check;
		//returns true if label contains search term 
		//else returns false 
	}
}