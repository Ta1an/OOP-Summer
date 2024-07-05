import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Lab09.txt");

        try {
            if(!file.exists()) {
                file.createNewFile();
            }
            else{
                System.out.println("File already exists");
            }
            PrintWriter writer = new PrintWriter(file);
            Random random = new Random();
            for(int i = 0; i < 100; i++) {
                writer.println(random.nextInt(1000));
            }
            writer.close();
        }
        catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        ArrayList<Integer> integers = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextInt()) {
                    integers.add(scanner.nextInt());
                }
        }
        catch(IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        Collections.sort(integers);

        System.out.println("Sorted numbers:");
        for (Integer number : integers) {
            System.out.println(number);
        }
    }
}