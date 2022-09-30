/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */

 /**
  * interface which returns true if the info matches the media item 
  */

public interface MediaFilter {
    public boolean matches(Label<String, Media> match);
}