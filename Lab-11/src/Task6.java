import java.util.*;

class Task6 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        // Insert 1 million integers into the linked list
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextInt());
        }

        // Test traversal time using iterator
        long startTime = System.currentTimeMillis();
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken using iterator: " + (endTime - startTime) + " ms");

        // Test traversal time using get(index)
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken using get(index): " + (endTime - startTime) + " ms");
    }
}