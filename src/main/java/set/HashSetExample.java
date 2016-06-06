package set;

import java.util.HashSet;

/**
 * Created by sdubovenko on 5/26/2016.
 */
public class HashSetExample {
    public static void main(String args[]) {
        // create a hash set
        HashSet hs = new HashSet();
        // add elements to the hash set
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println(hs);
    }
}
