import java.util.Scanner;

public class Lab02for3D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Sphere
        System.out.println("Enter the center and the radius of the sphere: ");

        System.out.print("Center: ");
        int xCoordinate = input.nextInt();
        int yCoordinate = input.nextInt();
        int zCoordinate = input.nextInt();

        System.out.print("Radius: ");
        int radius = input.nextInt();

        Sphere mySphere = new Sphere(xCoordinate, yCoordinate, zCoordinate, radius);
        System.out.println(mySphere);
        System.out.println("Diameter: " + mySphere.getDiameter());
        System.out.println("Surface Area: " + mySphere.getSurfaceArea());
        System.out.println("Circumference: " + mySphere.getCircumference());
        System.out.println("Volume: " + mySphere.getVolume());

        System.out.println("Enter the center and the radius of the second sphere: ");
        System.out.println("Center: ");
        int xCoordinate_2 = input.nextInt();
        int yCoordinate_2 = input.nextInt();
        int zCoordinate_2 = input.nextInt();

        System.out.println("Radius: ");
        int radius_2 = input.nextInt();

        Sphere secondSphere = new Sphere(xCoordinate_2, yCoordinate_2, zCoordinate_2, radius_2);
        System.out.println(secondSphere);
        System.out.println("Diameter: " + secondSphere.getDiameter());
        System.out.println("Surface Area: " + secondSphere.getSurfaceArea());
        System.out.println("Circumference: " + secondSphere.getCircumference());
        System.out.println("Volume: " + secondSphere.getVolume());

        System.out.println("Distance: " + mySphere.getDistanceTo(secondSphere));

        // Cuboid
        System.out.println("Enter three points of the cuboid: ");

        System.out.print("TopLeftFront: ");
        int xTopLeftFrontCoordinate = input.nextInt();
        int yTopLeftFrontCoordinate = input.nextInt();
        int zTopLeftFrontCoordinate = input.nextInt();

        System.out.print("BottomRightFront: ");
        int xBottomRightFrontCoordinate = input.nextInt();
        int yBottomRightFrontCoordinate = input.nextInt();
        int zBottomRightFrontCoordinate = input.nextInt();

        System.out.print("TopLeftBack: ");
        int xTopLeftBackCoordinate = input.nextInt();
        int yTopLeftBackCoordinate = input.nextInt();
        int zTopLeftBackCoordinate = input.nextInt();

        Cuboid myCuboid = new Cuboid(xTopLeftFrontCoordinate, yTopLeftFrontCoordinate, zTopLeftFrontCoordinate,
                xBottomRightFrontCoordinate, yBottomRightFrontCoordinate, zBottomRightFrontCoordinate,
                xTopLeftBackCoordinate, yTopLeftBackCoordinate, zTopLeftBackCoordinate);

        System.out.println(myCuboid);
        System.out.println("BasePerimeter: " + myCuboid.getBasePerimeter());
        System.out.println("Base Area: " + myCuboid.getBaseArea());
        System.out.println("Lateral Surface Area: " + myCuboid.getLateralSurfaceArea());
        System.out.println("Full Surface Area: " + myCuboid.getFullSurfaceArea());
        System.out.println("Volume: " + myCuboid.getVolume());
        System.out.println("Length: " + myCuboid.getLength());
        System.out.println("Width: " + myCuboid.getWidth());
        System.out.println("Height: " + myCuboid.getHeight());

        System.out.println("Enter three points of the second cuboid: ");

        System.out.print("TopLeftFront: ");
        int xTopLeftFrontCoordinate_2 = input.nextInt();
        int yTopLeftFrontCoordinate_2 = input.nextInt();
        int zTopLeftFrontCoordinate_2 = input.nextInt();

        System.out.print("BottomRightFront: ");
        int xBottomRightFrontCoordinate_2 = input.nextInt();
        int yBottomRightFrontCoordinate_2 = input.nextInt();
        int zBottomRightFrontCoordinate_2 = input.nextInt();

        System.out.print("TopLeftBack: ");
        int xTopLeftBackCoordinate_2 = input.nextInt();
        int yTopLeftBackCoordinate_2 = input.nextInt();
        int zTopLeftBackCoordinate_2 = input.nextInt();

        Cuboid secondCuboid = new Cuboid(xTopLeftFrontCoordinate_2, yTopLeftFrontCoordinate_2, zTopLeftFrontCoordinate_2,
                xBottomRightFrontCoordinate_2, yBottomRightFrontCoordinate_2, zBottomRightFrontCoordinate_2,
                xTopLeftBackCoordinate_2, yTopLeftBackCoordinate_2, zTopLeftBackCoordinate_2);

        System.out.println(secondCuboid);
        System.out.println("BasePerimeter: " + secondCuboid.getBasePerimeter());
        System.out.println("Base Area: " + secondCuboid.getBaseArea());
        System.out.println("Lateral Surface Area: " + secondCuboid.getLateralSurfaceArea());
        System.out.println("Full Surface Area: " + secondCuboid.getFullSurfaceArea());
        System.out.println("Volume: " + secondCuboid.getVolume());
        System.out.println("Length: " + secondCuboid.getLength());
        System.out.println("Width: " + secondCuboid.getWidth());

        System.out.println("Distance: " + myCuboid.getDistanceToTheCenterOf(secondCuboid));
    }
}
