import javafx.util.Pair;

import static java.lang.Math.abs;

public class Rectangle extends MyShape {
    int xTopLeftCoordinate;
    int yTopLeftCoordinate;
    int xBottomRightCoordinate;
    int yBottomRightCoordinate;

    public Rectangle(
            int xTopLeftCoordinate,
            int yTopLeftCoordinate,
            int xBottomRightCoordinate,
            int yBottomRightCoordinate
    ) {
        this.xTopLeftCoordinate = xTopLeftCoordinate;
        this.yTopLeftCoordinate = yTopLeftCoordinate;
        this.xBottomRightCoordinate = xBottomRightCoordinate;
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }
    public Rectangle(){
        this.xTopLeftCoordinate = 0;
        this.yTopLeftCoordinate = 0;
        this.xBottomRightCoordinate = 1;
        this.yBottomRightCoordinate = -1;

    }
    public Rectangle(
            int xTopLeftCoordinate,
            int yTopLeftCoordinate,
            int xBottomRightCoordinate,
            int yBottomRightCoordinate,
            String color,
            boolean filled
    ) {
      this.xTopLeftCoordinate = xTopLeftCoordinate;
      this.yTopLeftCoordinate = yTopLeftCoordinate;
      this.xBottomRightCoordinate = xBottomRightCoordinate;
      this.yBottomRightCoordinate = yBottomRightCoordinate;
      this.color = color;
      this.filled = filled;
    }

    public Pair<Integer, Integer> getTopLeftCoordinate() {
        return new Pair<Integer, Integer>(xTopLeftCoordinate, yTopLeftCoordinate);
    }
    public Pair<Integer, Integer> getBottomRightCoordinate() {
        return new Pair<Integer, Integer>(xBottomRightCoordinate, yBottomRightCoordinate);
    }
    public void setTopLeftCoordinate(
            int xTopLeftCoordinate,
            int yTopLeftCoordinate
    ) {
        this.xTopLeftCoordinate = xTopLeftCoordinate;
        this.yTopLeftCoordinate = yTopLeftCoordinate;
    }
    public void setBottomRightCoordinate(
            int xBottomRightCoordinate,
            int yBottomRightCoordinate
    ) {
        this.xBottomRightCoordinate = xBottomRightCoordinate;
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "TopLeftCoordinate = (" + xTopLeftCoordinate + ", " + yTopLeftCoordinate + ')' +
                ", BottomRightCoordinate = (" + xBottomRightCoordinate + ", " + yBottomRightCoordinate + ')' +
                "} which is subclass of" + super.toString();
    }

    int getArea(){
        return (xTopLeftCoordinate-xBottomRightCoordinate)*
                (yTopLeftCoordinate-yBottomRightCoordinate);
    }
    int getPerimeter(){
        return 2*((xTopLeftCoordinate-xBottomRightCoordinate)+
                (yTopLeftCoordinate-yBottomRightCoordinate));
    }
    int getCenterX(){
        return (xBottomRightCoordinate+xTopLeftCoordinate)/2;
    }
    int getCenterY(){
        return (yBottomRightCoordinate+yTopLeftCoordinate)/2;
    }
    int getLength(){
        return (xTopLeftCoordinate-xBottomRightCoordinate);
    }
    int getWidth(){
        return (yTopLeftCoordinate-yBottomRightCoordinate);
    }

    Double getDistanceToTheCenterOf(Rectangle anotherRectangle){
        return Math.sqrt(Math.pow((getCenterX() - anotherRectangle.getCenterX()), 2) +
                Math.pow((getCenterY() - anotherRectangle.getCenterY()), 2));
    }
}
