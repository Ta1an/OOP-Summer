import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int sum = 0;
        while(flag){
            int a = input.nextInt();
            if(a%2 == 1 || a%2 == -1){
                sum += a;
            }
            if(a == 0){
                flag = false;
            }
        }
        System.out.println(sum);
    }
}