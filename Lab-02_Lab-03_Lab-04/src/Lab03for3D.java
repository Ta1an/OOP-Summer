import java.util.Scanner;

public class Lab03for3D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a coordinates of cube: ");
        int xCoordinate = input.nextInt();
        int yCoordinate = input.nextInt();
        int zCoordinate = input.nextInt();

        System.out.print("Enter a side length of cube: ");
        int sideLength = input.nextInt();

        Cube cube = new Cube(xCoordinate, yCoordinate, zCoordinate, sideLength);
        System.out.println(cube);
        System.out.println("Base Perimeter of square is: " + cube.getBasePerimeter());
        System.out.println("Lateral Surface Area of square is: " + cube.getLateralSurfaceArea());
        System.out.println("Base Area of square is: " + cube.getBaseArea());
        System.out.println("Full Surface Area of square is: " + cube.getFullSurfaceArea());
        System.out.println("Color of square is: " + cube.getColor());
        System.out.println("Is square filled: " + cube.isFilled());

        System.out.println("Enter new parameters for cube:");
        System.out.print("New color: ");
        String newColor = input.next();
        System.out.print("Is cube filled: ");
        boolean newFilling = input.nextBoolean();
        cube.setColor(newColor);
        cube.setFilled(newFilling);

        System.out.println("New color of square is: " + cube.getColor());
        System.out.println("Is cube filled: " + cube.isFilled());
    }
}
