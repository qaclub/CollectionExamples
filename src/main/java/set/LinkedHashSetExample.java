package set;

import java.util.LinkedHashSet;

/**
 * Created by sdubovenko on 5/26/2016.
 */
public class LinkedHashSetExample {
    public static void main(String args[]) {
        // create a hash set
        LinkedHashSet hs = new LinkedHashSet();
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
