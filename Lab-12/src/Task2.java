import java.util.Stack;

public class Task2 {
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Stack<Integer> primeStack = new Stack<>();
        int count = 0;
        int number = 2;

        while (count < 50) {
            if (isPrime(number)) {
                primeStack.push(number);
                count++;
            }
            number++;
        }
        System.out.println("\nFirst 50 prime numbers in descending order:");
        while (!primeStack.isEmpty()) {
            System.out.println(primeStack.pop());
        }
    }
}