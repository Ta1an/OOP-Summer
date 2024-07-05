import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java RemoveStringFromFile <filename> <string_to_remove>");
            return;
        }

        String filename = args[0];
        String stringToRemove = args[1];

        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        try {
            // Read the contents of the file
            StringBuilder content = new StringBuilder();
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    content.append(scanner.nextLine()).append(System.lineSeparator());
                }
            }

            // Remove all occurrences of the specified string
            String updatedContent = content.toString().replace(stringToRemove, "");

            // Write the updated content back to the file
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.write(updatedContent);
            }

            System.out.println("All occurrences of the string \"" + stringToRemove + "\" have been removed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
