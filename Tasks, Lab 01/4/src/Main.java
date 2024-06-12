import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x = input.nextFloat();
        float y = input.nextFloat();
        float y1 = (float) (5*pow(x,2)-7*x+2);
        if(y == y1){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}