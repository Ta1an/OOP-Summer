import javafx.util.Pair;

import static java.lang.Math.pow;

public class Point {
    int xCoordinate;
    int yCoordinate;

    int xTopLeftCoordinate;
    int yTopLeftCoordinate;
    int xBottomRightCoordinate;
    int yBottomRightCoordinate;

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    public Point(
            int xTopLeftCoordinate,
            int yTopLeftCoordinate,
            int xBottomRightCoordinate,
            int yBottomRightCoordinate
    ){
        this.xTopLeftCoordinate = xTopLeftCoordinate;
        this.yTopLeftCoordinate = yTopLeftCoordinate;
        this.xBottomRightCoordinate = xBottomRightCoordinate;
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }
    public int getYCoordinate() {
        return yCoordinate;
    }
    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }
    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Pair<Integer, Integer> getTopLeftCoordinate() {
        return new Pair<>(xTopLeftCoordinate, yTopLeftCoordinate);
    }
    public Pair<Integer, Integer> getBottomRightCoordinate() {
        return new Pair<>(xBottomRightCoordinate, yBottomRightCoordinate);
    }
    public void setTopLeftCoordinate(int xTopLeftCoordinate, int yTopLeftCoordinate) {
        this.xTopLeftCoordinate = xTopLeftCoordinate;
        this.yTopLeftCoordinate = yTopLeftCoordinate;
    }
    public void setBottomRightCoordinate(int xBottomRightCoordinate, int yBottomRightCoordinate) {
        this.xBottomRightCoordinate = xBottomRightCoordinate;
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }

    Double getDistanceC(Point anotherPoint) {
        return Math.sqrt(pow((xCoordinate - anotherPoint.xCoordinate), 2) +
                pow((this.yCoordinate - anotherPoint.yCoordinate), 2));
    }

    int getCenterX(){
        return (xTopLeftCoordinate + xBottomRightCoordinate) / 2;
    }
    int getCenterY(){
        return (yTopLeftCoordinate + yBottomRightCoordinate) / 2;
    }
    Double getDistanceR(Point anotherPoint) {
        return Math.sqrt(pow(getCenterX()-anotherPoint.getCenterX(), 2) +
                pow(getCenterY()-anotherPoint.getCenterY(), 2));
    }
}

