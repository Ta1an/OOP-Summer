import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point other) {
        if (this.x == other.x) {
            return Integer.compare(this.y, other.y);
        }
        return Integer.compare(this.x, other.x);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.getY() == p2.getY()) {
            return Integer.compare(p1.getX(), p2.getX());
        }
        return Integer.compare(p1.getY(), p2.getY());
    }
}
class Task5 {
    public static void main(String[] args) {
        Point[] points = generatePoints();

        // Sort points by x-coordinates
        Arrays.sort(points);
        System.out.println("Points sorted by x-coordinates:");
        printPoints(points);

        // Sort points by y-coordinates
        Arrays.sort(points, new CompareY());
        System.out.println("\nPoints sorted by y-coordinates:");
        printPoints(points);
    }

    private static Point[] generatePoints() {
        Random random = new Random();
        Point[] points = new Point[100];
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            points[i] = new Point(x, y);
        }
        return points;
    }

    private static void printPoints(Point[] points) {
        for (Point point : points) {
            System.out.print(point + " ");
        }
        System.out.println();
    }
}