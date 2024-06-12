import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float sum = 0;
        for(int i = 0; i <= n; i++) {
            if(i%2 == 0 && i != 0){
                sum+= (float) -1/n-i;
            }
            else {
                sum+= (float) 1/n-i;
            }
        }
        System.out.println(sum);
    }
}