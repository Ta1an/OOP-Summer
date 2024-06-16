import java.util.HashMap;
import java.util.Scanner;

public class Lab04For3D {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        HashMap<MyShape, String>myHashMap = new HashMap<>();
        Sphere mySphere = new Sphere(0, 0,0, 1);
        Cuboid myCuboid = new Cuboid(0, 1, 1,
                1, 0, 1,
                0, 1, 0);
        Cube myCube = new Cube(0, 1, 1, 1);

        myHashMap.put(mySphere, "SPHERES");
        myHashMap.put(myCuboid, "CUBOIDS");
        myHashMap.put(myCube, "CUBES");

        System.out.println("INITIAL - " + myHashMap.size() + " " +  myHashMap.get(mySphere));

        Sphere sphereWithTheSameAttributes = new Sphere(0, 0, 0, 1);
        myHashMap.put(sphereWithTheSameAttributes, "SAME SPHERES");

        System.out.println("ADDED CIRCLE WITH THE SAME ATTRIBUTES - " + myHashMap.size() + " " +  myHashMap.get(mySphere));
    }
}
