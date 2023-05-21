import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedLIstqueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);  // it add element in queue
        queue.offer(24);
        queue.offer(35);
        System.out.println(queue);

        System.out.println(queue.poll());                       // it remove the element or return the element
        System.out.println(queue );

        System.out.println(queue.peek());
    }

}
