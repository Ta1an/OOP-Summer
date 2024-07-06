import java.util.ArrayList;

public class Task3 {
    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        if (list == null || list.isEmpty()) {
            return null; // Return null if list is empty
        }
        E max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i); // Update max if current element is greater
            }
        }
        return max;
    }
}
