import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Circle

        int xCoordinate = input.nextInt();
        int yCoordinate = input.nextInt();
        int radius = input.nextInt();

        Circle myCircle = new Circle(xCoordinate, yCoordinate, radius);
        System.out.println(myCircle);
        System.out.println("Area: " + myCircle.getArea());
        System.out.println("Circumference: " + myCircle.getCircumference());

        int xCoordinate2 = input.nextInt();
        int yCoordinate2 = input.nextInt();
        int radius2 = input.nextInt();

        Circle secondCircle = new Circle(xCoordinate2, yCoordinate2, radius2);
        System.out.println(secondCircle);
        System.out.println("Area: " + secondCircle.getArea());
        System.out.println("Circumference: " + secondCircle.getCircumference());

        System.out.println("Distance: " + myCircle.getDistanceTo(secondCircle));

        // Rectangle
        
        int xTopLeftCoordinate = input.nextInt();
        int yTopLeftCoordinate = input.nextInt();
        int xBottomRightCoordinate = input.nextInt();
        int yBottomRightCoordinate = input.nextInt();

        Rectangle myRectangle = new Rectangle(xTopLeftCoordinate, yTopLeftCoordinate, xBottomRightCoordinate, yBottomRightCoordinate);
        System.out.println(myRectangle);
        System.out.println("Area: " + myRectangle.getArea());
        System.out.println("Perimeter: " + myRectangle.getPerimeter());

        int xTopLeftCoordinate_2 = input.nextInt();
        int yTopLeftCoordinate_2 = input.nextInt();
        int xBottomRightCoordinate_2 = input.nextInt();
        int yBottomRightCoordinate_2 = input.nextInt();

        Rectangle secondRectangle = new Rectangle(xTopLeftCoordinate_2, yTopLeftCoordinate_2, xBottomRightCoordinate_2, yBottomRightCoordinate_2);
        System.out.println(secondRectangle);
        System.out.println("Area: " + secondRectangle.getArea());
        System.out.println("Perimeter: " + secondRectangle.getPerimeter());

        System.out.println("Distance: " + myRectangle.getDistanceToTheCenterOf(secondRectangle));

    }
}
