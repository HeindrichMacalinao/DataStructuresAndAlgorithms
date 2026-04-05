import java.util.LinkedList;
import java.util.Queue;
public class Sandbox
{

    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>(); 
      
        // Enqueue items
        queue.add(10);
        queue.offer(20);
        queue.offer(30);
      
        // Peek at the front item
        System.out.println("Front item: " + queue.peek()); // Output: 10
      
        // Dequeue items
        System.out.println("Dequeued item: " + queue.poll()); // Output: 10
        System.out.println("Dequeued item: " + queue.poll()); // Output: 20
      
        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false
      
        // Get the size of the queue
        System.out.println("Size of queue: " + queue.size()); // Output: 1
    }
}
