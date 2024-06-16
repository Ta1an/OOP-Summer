import javafx.util.Pair;

import static java.lang.Math.pow;

public class Point {
    int x;
    int y;

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
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    Double getDistance(Point anotherPoint) {
        return Math.sqrt(pow((x - anotherPoint.x), 2) +
                pow((this.y - anotherPoint.y), 2));
    }

}

