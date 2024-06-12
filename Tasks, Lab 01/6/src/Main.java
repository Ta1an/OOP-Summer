import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float sum = 0;
        while(n > 0){
            sum += (float) 1 /n;
            n--;
        }
        System.out.println(sum);
    }
}