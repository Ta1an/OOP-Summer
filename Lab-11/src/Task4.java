import java.util.HashSet;
import java.util.ArrayList;

public class Task4 {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        // Use a HashSet to store unique elements
        HashSet<E> set = new HashSet<>(list);
        // Create a new ArrayList from the HashSet (which contains only unique elements)
        return new ArrayList<>(set);
    }
}