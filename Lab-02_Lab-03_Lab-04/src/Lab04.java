import java.util.HashMap;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<MyShape, String>myHashMap = new HashMap<>();
        Circle myCircle = new Circle(0, 0, 1);
        Rectangle myRectangle = new Rectangle(0, 1, 3, 0);
        Square mySquare = new Square(0, 1, 1);

        myHashMap.put(myCircle, "CIRCLES");
        myHashMap.put(myRectangle, "RECTANGLES");
        myHashMap.put(mySquare, "SQUARES");

        System.out.println("INITIAL - " + myHashMap.size() + " " +  myHashMap.get(myCircle));

        Circle circleWithTheSameAttributes = new Circle(0, 0, 1);
        myHashMap.put(circleWithTheSameAttributes, "SAME CIRCLES");

        System.out.println("ADDED CIRCLE WITH THE SAME ATTRIBUTES - " + myHashMap.size() + " " +  myHashMap.get(myCircle));
    }
}