import java.util.*;

public class LearnPriorityQueue 
{
    public static void main(String[] args)
    {
        // Priority queue implements min heap i.e., the least element will have highest priority and will be removed first 

        // Queue<Integer> pq = new PriorityQueue<>();

        // pq.offer(34);
        // pq.offer(55);
        // pq.offer(1);
        // pq.offer(100);

        // System.out.println(pq);

        // pq.poll();

        // System.out.println(pq.peek());

         // Priority queue with "Comparator.reverseOrder()" as arguments implements max heap i.e., the highest element will have highest priority and will be removed first 

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(34);
        pq.offer(55);
        pq.offer(1);
        pq.offer(100);

        // System.out.println(pq.poll());

        // pq.poll();

        System.out.println(pq.peek());
        
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(-2);
        st.push(67);
        st.push(34);

        Queue<Integer> pq1 = new PriorityQueue<>(st);
        System.out.println(pq1.peek()); 
    }
    
}
