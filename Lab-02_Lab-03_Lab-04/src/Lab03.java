import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int xCoordinate = input.nextInt();
        int yCoordinate = input.nextInt();
        int sideLength = input.nextInt();

        Square square = new Square(xCoordinate, yCoordinate, sideLength);
        System.out.println(square);
        System.out.println("Area of square is: " + square.getArea());
        System.out.println("Perimeter of square is: " + square.getPerimeter());
        System.out.println("Color of square is: " + square.getColor());
        System.out.println("Is square filled: " + square.isFilled());

        String newColor = input.next();
        square.setColor(newColor);

        System.out.println("New color of square is: " + square.getColor());
    }
}
