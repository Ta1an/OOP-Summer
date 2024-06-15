import javafx.util.Pair;

import static java.lang.Math.abs;

public class Rectangle extends MyShape {
    Point points;

    public Rectangle(
            int xTopLeftCoordinate,
            int yTopLeftCoordinate,
            int xBottomRightCoordinate,
            int yBottomRightCoordinate
    ) {
        this.points = new Point(xTopLeftCoordinate, yTopLeftCoordinate, xBottomRightCoordinate, yBottomRightCoordinate);
    }
    public Rectangle(){
        this.points = new Point(0, 0, 1, -1);

    }
    public Rectangle(
            int xTopLeftCoordinate,
            int yTopLeftCoordinate,
            int xBottomRightCoordinate,
            int yBottomRightCoordinate,
            String color,
            boolean filled
    ) {
        this.points = new Point(xTopLeftCoordinate, yTopLeftCoordinate, xBottomRightCoordinate, yBottomRightCoordinate);
        this.color = color;
        this.filled = filled;
    }

    public Pair<Integer, Integer> getTopLeftCoordinate() {
        return points.getTopLeftCoordinate();
    }
    public Pair<Integer, Integer> getBottomRightCoordinate() {
        return points.getBottomRightCoordinate();
    }
    public void setTopLeftCoordinate(
            int xTopLeftCoordinate,
            int yTopLeftCoordinate
    ) {
        this.points = new Point(xTopLeftCoordinate, yTopLeftCoordinate);
    }
    public void setBottomRightCoordinate(
            int xBottomRightCoordinate,
            int yBottomRightCoordinate
    ) {
        this.points = new Point(xBottomRightCoordinate, yBottomRightCoordinate);
    }
    @Override
    public String toString() {
        return "Rectangle {" +
                "TopLeftCoordinate = (" + points.xTopLeftCoordinate + ", " + points.yTopLeftCoordinate + ')' +
                ", BottomRightCoordinate = (" + points.xBottomRightCoordinate + ", " + points.yBottomRightCoordinate + ')' +
                "} which is subclass of " + super.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        if(this.points.xTopLeftCoordinate != rectangle.points.xTopLeftCoordinate){
            return false;
        }
        if(this.points.xBottomRightCoordinate != rectangle.points.xBottomRightCoordinate){
            return false;
        }
        if(this.points.yTopLeftCoordinate != rectangle.points.yTopLeftCoordinate){
            return false;
        }
        return this.points.yBottomRightCoordinate == rectangle.points.yBottomRightCoordinate;
    }
    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + points.xTopLeftCoordinate;
        result = 31 * result + points.yTopLeftCoordinate;
        result = 31 * result + points.xBottomRightCoordinate;
        result = 31 * result + points.yBottomRightCoordinate;
        return result;
    }

    int getArea(){
        return (points.xBottomRightCoordinate-points.xTopLeftCoordinate)*
                (points.yTopLeftCoordinate-points.yBottomRightCoordinate);
    }
    int getPerimeter(){
        return 2*((points.xBottomRightCoordinate-points.xTopLeftCoordinate)+
                (points.yTopLeftCoordinate-points.yBottomRightCoordinate));
    }

    int getLength(){
        return (points.xBottomRightCoordinate - points.xTopLeftCoordinate);
    }
    int getWidth(){
        return (points.yTopLeftCoordinate-points.yBottomRightCoordinate);
    }

    Double getDistanceToTheCenterOf(Rectangle anotherRectangle){
        return Math.sqrt(Math.pow((points.getCenterX() - anotherRectangle.points.getCenterX()), 2) +
                Math.pow((points.getCenterY() - anotherRectangle.points.getCenterY()), 2));
    }
}
