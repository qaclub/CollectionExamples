package set;

import java.util.TreeSet;

/**
 * Created by sdubovenko on 5/26/2016.
 */
public class TreeSetExample {
    public static void main(String args[]) {
        // Create a tree set
        TreeSet ts = new TreeSet();
        // Add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
    }

}
