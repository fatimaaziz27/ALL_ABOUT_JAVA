import java.util.*;
public class temporary_practice {

    public static void main(String[] args){

    Queue<Integer> numQueue = new LinkedList<>();
    System.out.println(numQueue); // Print the queue

    Collections.addAll(numQueue,10,20,30,40,50);
    numQueue.add(10); // Add element to the queue
    numQueue.add(20);
    numQueue.add(30);
    numQueue.add(40);
    numQueue.add(50);
    System.out.println(numQueue); // Print the queue
    System.out.println(numQueue); // Print the queue

    System.out.println(numQueue.remove()); // Remove element from the queue
    System.out.println(numQueue); // Print the queue

    System.out.println(numQueue.peek()); // Peek at the front element of the queue

    System.out.println(numQueue.isEmpty()); // Check if the queue is empty

    System.out.println(numQueue.size()); // Get the size of the queue

    System.out.println(numQueue.contains(30)); // Check if value is present in the queue

    numQueue.clear(); // Clear the queue
    System.out.println(numQueue); // Print the queue
    
    }
}
