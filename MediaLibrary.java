/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MediaLibrary {
    private List<Label<String, Media>> library;

    /**
     * this is a constructor 
     * library is set as a new arrayList 
     */

    public MediaLibrary(){
        this.library = new ArrayList<Label<String, Media>>();
    }

    /**
     * this is a construtor 
     * @param library set as an Array list 
     */

    public MediaLibrary(List<Label<String, Media>> library){
        this.library = new ArrayList<Label<String, Media>>();
        library.addAll(library);
    }


/**
 * this method adds the media into the library that checks for exceptions 
 * @param name the name of the media 
 * @param media the info for the media 
 * @throws MediaAlreadyInLibrary exception if it is a duplicate 
 */
    public void add(String name, Media media) throws MediaAlreadyInLibrary{
        int count = library.size();
        Label<String,Media> match = new Label<String, Media>(name,media);
        for (int i = 0; i < count; i ++){
            if (match.getValue().equals(library.get(i).getValue()) == true){
                throw new MediaAlreadyInLibrary(name,media);
            }
        }

        library.add(match);

     
}

/**
 * returns a list of labeled media items 
 * @param mediaFilter calls the MediaFilter function
 * @return list with the media items 
 */
    

    public List<Label<String,Media>> filter(MediaFilter mediaFilter){
       int count = library.size();
        List<Label<String,Media>> find = new ArrayList<>();
        for (int i = 0; i < count; i ++){
            if (mediaFilter.matches(library.get(i)) == true){
                find.add(library.get(i));
            }
        }
        return find;

    }

    /**
     * sorts the data member library based on certain rules 
     */
    
    public void sort(){
        Collections.sort(library);

    }
}
