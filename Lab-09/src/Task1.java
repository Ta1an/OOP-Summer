import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File( "src/task1.txt");

        try(Scanner scanner = new Scanner(file)){
            int lineCount = 0;
            int characterCount = 0;
            int wordCount = 0;
            String line;

            while(scanner.hasNextLine()){
                line = scanner.nextLine();
                lineCount++;
                characterCount += line.length();
                String[] words = line.split(" ");
                wordCount += words.length;

            }
            System.out.println("Line count: " + lineCount);
            System.out.println("Character count: " + characterCount);
            System.out.println("Word count: " + wordCount);
        }
        catch(IOException e){
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}