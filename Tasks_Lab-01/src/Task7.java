import java.util.Scanner;

import static java.lang.Math.pow;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double m = input.nextDouble();
        while(n <= m){
            double y = (double) -2.4*pow(n, 2)+5*n-3;
            System.out.print(n);
            System.out.println(" " + y);
            n+=0.5;
        }
    }
}