import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // Test Task1: Generic Linear Search
        Integer[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8};

        int index = Task1.linearSearch(numbers, 5);
        System.out.println("Task1 - Index of 5: " + index); // Output: Task1 - Index of 5: 2

        // Test Task2: Maximum Element in an Array
        Integer maxNumber = Task2.max(numbers);
        System.out.println("Task2 - Max number: " + maxNumber); // Output: Task2 - Max number: 9

        // Test Task3: Largest Element in ArrayList
        ArrayList<Double> numberList = new ArrayList<>(Arrays.asList(1.2, 3.4, 5.6, 7.8, 2.3));
        Double maxDouble = Task3.max(numberList);
        System.out.println("Task3 - Max number: " + maxDouble); // Output: Task3 - Max number: 7.8

        // Test Task4: Distinct Elements in ArrayList
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1));
        ArrayList<Integer> uniqueList = Task4.removeDuplicates(intList);
        System.out.println("Task4 - Unique numbers: " + uniqueList); // Output: Task4 - Unique numbers: [1, 2, 3, 4]

        // Test Task5: Sort Points in a Plane
        System.out.println("Task5 - Sorting points:");
        Task5.main(args); // Output points sorted by x-coordinates and y-coordinates

        // Test Task6: Use Iterators on Linked Lists
        System.out.println("Task6 - Traversal times:");
        Task6.main(args); // Output traversal times using iterator and get(index)
    }
}