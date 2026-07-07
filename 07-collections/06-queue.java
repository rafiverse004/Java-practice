import java.util.LinkedList;
import java.util.Queue;

class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue.peek());

        queue.poll();

        System.out.println(queue.peek());
    }
}