import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Task2 {
    public static void main(String[] args) {
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

        List<Integer>numbers = new ArrayList<>();

        try {
            Scanner reader = new Scanner(file);
            String line = reader.nextLine();
            while(reader.hasNextLine()) {
                String[] number = line.split(" ");
                for (String s : number) {
                    if (!s.isEmpty()) {
                        numbers.add(Integer.parseInt(s));
                    }
                }
            }
            reader.close();
        }
        catch(IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        Collections.sort(numbers);

        System.out.println("Sorted numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}