import java.util.LinkedList;

public class Task3 {
    static class GenericQueue<E> extends LinkedList<E> {
        // No additional implementation required for this example
    }
    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>();
        for (int i = 1; i <= 10; i++) {
            queue.offer(i);
        }

        System.out.println("\nGenericQueue elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
