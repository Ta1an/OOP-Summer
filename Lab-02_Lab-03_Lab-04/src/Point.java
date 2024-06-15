import javafx.util.Pair;

import static java.lang.Math.pow;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getXCoordinate() {
        return x;
    }
    public int getYCoordinate() {
        return y;
    }
    public void setXCoordinate(int x) {
        this.x = x;
    }
    public void setYCoordinate(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Coordinates = (" + x + ", " + y + ")";
    }
    Double getDistance(Point anotherPoint) {
        return Math.sqrt(pow((x - anotherPoint.x), 2) +
                pow((this.y - anotherPoint.y), 2));
    }

}

