import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        if(a != b){
            if(a > b){
                System.out.println(a + " is greater than " + b);
            }
            else if(a < b){
                System.out.println(a + " is less than " + b);
            }
        }
        else {
            System.out.println("Both are equal");
        }
    }
}