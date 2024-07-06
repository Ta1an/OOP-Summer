public class Task2 {
    public static <E extends Comparable<E>> E max(E[] list){
        if (list == null || list.length == 0) {
            return null; // Return null if array is empty
        }
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i]; // Update max if current element is greater
            }
        }
        return max;
    }
}
