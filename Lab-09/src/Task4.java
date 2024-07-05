import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        String filename = "SortedStrings.txt";
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        try (Scanner scanner = new Scanner(file)) {
            if (!scanner.hasNextLine()) {
                System.out.println("The file is empty.");
                return;
            }

            String previousString = scanner.nextLine();
            while (scanner.hasNextLine()) {
                String currentString = scanner.nextLine();
                if (previousString.compareTo(currentString) > 0) {
                    System.out.println("Strings are not in increasing order.");
                    System.out.println("Out of order strings: " + previousString + ", " + currentString);
                    return;
                }
                previousString = currentString;
            }
            System.out.println("Strings are in increasing order.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
