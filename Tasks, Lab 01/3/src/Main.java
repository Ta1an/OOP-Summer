import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int b = 20;
        int c = a - b;
        int v1 = b/t1;
        int v2 = c/t2;
        if(v1 > v2){
            System.out.println("Before");
        }
        else {
            System.out.println("After");
        }
    }
}