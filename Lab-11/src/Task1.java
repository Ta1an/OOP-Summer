public class Task1 {
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }
}