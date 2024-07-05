import javax.sound.midi.SysexMessage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) throws IOException {
        File file = new File("src/Salary.txt");

        try (PrintWriter writer = new PrintWriter(file)) {

            if(!file.exists()){
                file.createNewFile();
            }
            else{
                System.out.println("File already exists");
            }
            Random random = new Random();

            for (int i = 1; i <= 1000; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                String rank = getRandomRank(random);
                double salary = getRandomSalary(rank, random);
                writer.printf("%s %s %s %.2f%n", firstName, lastName, rank, salary);
            }

            System.out.println("Data file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getRandomRank(Random random) {
        String[] ranks = {"assistant", "associate", "full"};
        return ranks[random.nextInt(ranks.length)];
    }

    private static double getRandomSalary(String rank, Random random) {
        double salary = 0;
        switch (rank) {
            case "assistant":
                salary = 50000 + (30000 * random.nextDouble());
                break;
            case "associate":
                salary = 60000 + (50000 * random.nextDouble());
                break;
            case "full":
                salary = 75000 + (55000 * random.nextDouble());
                break;
        }
        return salary;
    }
}
