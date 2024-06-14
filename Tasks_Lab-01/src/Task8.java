import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double sum = 0;
        int denominator = 1;
        boolean flag = true;
        for(int i = 0; i < n; i++) {
            if(flag){
                sum += (double) 1 /denominator;
            }
            else{
                sum -= (double) 1 /denominator;
            }
            flag = !flag;
            denominator += 2;
        }
        System.out.println(sum);
    }
}
