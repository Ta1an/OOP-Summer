import java.util.Comparator;
import java.util.PriorityQueue;

public class Task4 {
    static class MyPriorityQueue<E> extends PriorityQueue<E> {
        public MyPriorityQueue(Comparator<? super E> comparator) {
            super(comparator);
        }
    }
    public static void main(String[] args) {
        Comparator<Integer> descComparator = Comparator.reverseOrder();
        MyPriorityQueue<Integer> priorityQueue = new MyPriorityQueue<>(descComparator);
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(4);
        priorityQueue.offer(2);

        System.out.println("\nMy Priority Queue elements in descending order:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
