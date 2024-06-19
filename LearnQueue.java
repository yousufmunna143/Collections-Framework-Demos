import java.util.*;
/*
    -> add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
    -> offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.

    -> element() - Returns the head of the queue. Throws an exception if the queue is empty.
    -> peek() - Returns the head of the queue. Returns null if the queue is empty.

    -> remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
    -> poll() - Returns and removes the head of the queue. Returns null if the queue is empty
 */
public class LearnQueue 
{
    public static void main(String[] args)
    {
        Queue<Integer> queue= new LinkedList<>();

        queue.offer(3);
        queue.offer(6);
        queue.offer(9);
        queue.offer(12);

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println(queue.poll());

    }
    
}
