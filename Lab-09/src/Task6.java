import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String filename = input.nextLine();
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        Map<Character, Integer> letterCount = new HashMap<>();

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().toLowerCase();
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Occurrences of each letter:");
        for (char c = 'a'; c <= 'z'; c++) {
            if (letterCount.containsKey(c)) {
                System.out.println(c + ": " + letterCount.get(c));
            } else {
                System.out.println(c + ": 0");
            }
        }
    }
}

