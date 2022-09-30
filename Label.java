/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */

public class Label<k, v extends Comparable<V>> implements Comparable<Label<K, V>> {
    /**
     * Attributes
     */
    private k key;
    private v value;
    // fix this 

/**
 * this is a constructor 
 * @param key gives the reference of the first generic type
 * @param value a reference to the second generic type
 */
    public Label(k key,v value){
        this.key = key;
        this.value = value;
    }

    /**
     * this is a getter
     * @return key returns the first generic type reference
     */

    final k getKey(){
        return key;
    }

    /**
     * getter
     * @return gives the second generic type reference
     */

    final v getValue(){
        return value;
    }

    /**
     * @param obj is the object being used to compare the equals method
     * @return boolean returns true if the objects similar, else false
     */

    @Override
    public boolean equals(Object obj){
        boolean check = false;
        if (obj instanceof Label){
            if (((Label)(obj)).getValue() == this.value){
                check = true;

            }
        }

        return check; 


    }

    /**
     * @param o is an object that is being used to compare the values
     * @return int returns result of comparing data memebers
     */

    public int compareTo(Label<k, v> o){
        int find = 0;
        find = this.getValue().compareTo(o.getValue());
        if (find != 0){
            return find;
        }

        return 0;


    }
    
}
