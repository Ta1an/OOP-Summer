import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {
        // Task 1: Perform set operations on hash sets
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        LinkedHashSet<String> unionSet = new LinkedHashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);

        LinkedHashSet<String> differenceSet = new LinkedHashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + differenceSet);

        LinkedHashSet<String> intersectionSet = new LinkedHashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection: " + intersectionSet);
    }
}