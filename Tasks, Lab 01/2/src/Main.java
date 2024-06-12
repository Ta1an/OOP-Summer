import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0, sum1 = 0;
        for(int i = 0; i <= 5; i++){
            int b, c;
            if(i < 3){
                b = a%10;
                sum += b;
            }
            else {
                c = a%10;
                sum1 += c;

            }
            a/=10;
        }
        if (sum == sum1){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}