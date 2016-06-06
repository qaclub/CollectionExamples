package queue;

import java.util.PriorityQueue;

/**
 * Created by sdubovenko on 5/26/2016.
 */
public class PriorityQueueExample {
    public static void main(String args[]) {
        // create priority queue
        PriorityQueue< Integer > prq = new PriorityQueue < Integer > ();

        // insert values in the queue
        for ( int i = 3; i  <  10; i++ ){
            prq.add (new Integer (i)) ;
        }

        System.out.println ( "Initial priority queue values are: "+ prq);

        // get the head from the queue
        Integer head = prq.poll();

        System.out.println ( "Head of the queue is: "+ head);

        System.out.println ( "Priority queue values after poll: "+ prq);
    }
}
