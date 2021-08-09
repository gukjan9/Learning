import java.util.*;

public class p_612 {
    public static void main(String[] args){
        Queue pq = new PriorityQueue();
        pq.offer(3);
        pq.offer(1);
        pq.offer(5);

        System.out.println(pq);
        Object obj = null;

        while((obj = pq.poll()) != null){
            System.out.println(obj);
        }
    }
}
