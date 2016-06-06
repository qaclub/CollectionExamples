package queue;

import java.util.ArrayDeque;

/**
 * Created by sdubovenko on 5/26/2016.
 */
public class ArrayDequeExample {
    public static void main(String[] args) {

        // Create ArrayDeque with three elements.
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.push(10);
        deque.push(500);
        deque.push(1000);


        // Peek to get the top item, but do not remove it.
        int peekResult = deque.peek();
        System.out.println(peekResult);

        // Call pop on the Deque.
        int popResult = deque.pop();
        System.out.println(popResult);

        // Pop again.
        popResult = deque.pop();
        System.out.println(popResult);

        popResult = deque.pop();
        System.out.println(popResult);
    }
}
