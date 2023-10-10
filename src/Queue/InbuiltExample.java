package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InbuiltExample {
    public static void main(String[] args) {
        //First in first out (FIFO)
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);
        System.out.println(queue.remove()+ " removed");
        System.out.println(queue.remove()+ " removed");
        System.out.println(queue.remove()+ " removed");
        System.out.println(queue.remove()+ " removed");
        System.out.println(queue);
    }
}
