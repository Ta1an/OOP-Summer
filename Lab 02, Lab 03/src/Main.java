import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int xCoordinate = input.nextInt();
//        int yCoordinate = input.nextInt();
//        int radius = input.nextInt();
//
//        Circle myCircle = new Circle(xCoordinate, yCoordinate, radius);
//        System.out.println(myCircle);
//        System.out.println("Area: " + myCircle.getArea());
//        System.out.println("Circumference: " + myCircle.getCircumference());
//
//        int xCoordinate2 = input.nextInt();
//        int yCoordinate2 = input.nextInt();
//        int radius2 = input.nextInt();
//
//        Circle secondCircle = new Circle(xCoordinate2, yCoordinate2, radius2);
//        System.out.println(secondCircle);
//        System.out.println("Area: " + secondCircle.getArea());
//        System.out.println("Circumference: " + secondCircle.getCircumference());
//
//        System.out.println("Distance: " + myCircle.getDistanceTo(secondCircle));
//
//        int xTopLeftCoordinate = input.nextInt();
//        int yTopLeftCoordinate = input.nextInt();
//        int xBottomRightCoordinate = input.nextInt();
//        int yBottomRightCoordinate = input.nextInt();
//
//        Rectangle myRectangle = new Rectangle(xTopLeftCoordinate, yTopLeftCoordinate, xBottomRightCoordinate, yBottomRightCoordinate);
//        System.out.println(myRectangle);
//        System.out.println("Area: " + myRectangle.getArea());
//        System.out.println("Perimeter: " + myRectangle.getPerimeter());
//
//        int xTopLeftCoordinate_2 = input.nextInt();
//        int yTopLeftCoordinate_2 = input.nextInt();
//        int xBottomRightCoordinate_2 = input.nextInt();
//        int yBottomRightCoordinate_2 = input.nextInt();
//
//        Rectangle secondRectangle = new Rectangle(xTopLeftCoordinate_2, yTopLeftCoordinate_2, xBottomRightCoordinate_2, yBottomRightCoordinate_2);
//        System.out.println(secondRectangle);
//        System.out.println("Area: " + secondRectangle.getArea());
//        System.out.println("Perimeter: " + secondRectangle.getPerimeter());
//
//        System.out.println("Distance: " + myRectangle.getDistanceToTheCenterOf(secondRectangle));

        int xCoordinate = input.nextInt();
        int yCoordinate = input.nextInt();
        int sideLength = input.nextInt();

        Square square = new Square(xCoordinate, yCoordinate, sideLength);
        System.out.println("Area of square is: " + square.getArea());
        System.out.println("Perimeter of square is: " + square.getPerimeter());
        System.out.println("Color of square is: " + square.getColor());
        System.out.println("Is square filled: " + square.isFilled());

        String newColor = input.next();
        square.setColor(newColor);

        System.out.println("New color of square is: " + square.getColor());
    }
}