import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.nextLine();

        int result = 0;

        for(int i = 0; i < inputStr.length(); i++) {
            int cur = Integer.parseInt(inputStr.substring(i, i+1));
            result += cur;
        }
        System.out.println(result);
    }
}