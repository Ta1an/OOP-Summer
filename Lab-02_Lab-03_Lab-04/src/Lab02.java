import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {

        // Circle

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an center of the circle and radius of the circle: ");

        System.out.print("Center: ");
        int xCoordinate = input.nextInt();
        int yCoordinate = input.nextInt();

        System.out.print("Radius: ");
        int radius = input.nextInt();

        Circle myCircle = new Circle(xCoordinate, yCoordinate, radius);
        System.out.println(myCircle);
        System.out.println("Diameter: " + myCircle.getDiameter());
        System.out.println("Area: " + myCircle.getArea());
        System.out.println("Circumference: " + myCircle.getCircumference());

        System.out.println("Enter an center of the second circle and radius of the second circle: ");

        System.out.print("Center: ");
        int xCoordinate2 = input.nextInt();
        int yCoordinate2 = input.nextInt();

        System.out.print("Radius: ");
        int radius2 = input.nextInt();

        Circle secondCircle = new Circle(xCoordinate2, yCoordinate2, radius2);
        System.out.println(secondCircle);
        System.out.println("Diameter: " + secondCircle.getDiameter());
        System.out.println("Area: " + secondCircle.getArea());
        System.out.println("Circumference: " + secondCircle.getCircumference());

        System.out.println("Distance: " + myCircle.getDistanceTo(secondCircle));

        // Rectangle

        System.out.println("Enter the two points of the rectangle: ");

        System.out.print("TopLeft: ");
        int xTopLeftCoordinate = input.nextInt();
        int yTopLeftCoordinate = input.nextInt();

        System.out.print("BottomRight: ");
        int xBottomRightCoordinate = input.nextInt();
        int yBottomRightCoordinate = input.nextInt();

        Rectangle myRectangle = new Rectangle(xTopLeftCoordinate, yTopLeftCoordinate, xBottomRightCoordinate, yBottomRightCoordinate);
        System.out.println(myRectangle);
        System.out.println("Area: " + myRectangle.getArea());
        System.out.println("Perimeter: " + myRectangle.getPerimeter());
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Width: " + myRectangle.getWidth());

        System.out.println("Enter the two points of the second rectangle: ");

        System.out.print("TopLeft: ");
        int xTopLeftCoordinate_2 = input.nextInt();
        int yTopLeftCoordinate_2 = input.nextInt();

        System.out.print("BottomRight: ");
        int xBottomRightCoordinate_2 = input.nextInt();
        int yBottomRightCoordinate_2 = input.nextInt();

        Rectangle secondRectangle = new Rectangle(xTopLeftCoordinate_2, yTopLeftCoordinate_2, xBottomRightCoordinate_2, yBottomRightCoordinate_2);
        System.out.println(secondRectangle);
        System.out.println("Area: " + secondRectangle.getArea());
        System.out.println("Perimeter: " + secondRectangle.getPerimeter());
        System.out.println("Length: " + secondRectangle.getLength());
        System.out.println("Width: " + secondRectangle.getWidth());

        System.out.println("Distance: " + myRectangle.getDistanceToTheCenterOf(secondRectangle));
    }
}
