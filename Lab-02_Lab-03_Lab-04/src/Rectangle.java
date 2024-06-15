import javafx.util.Pair;

import static java.lang.Math.abs;

public class Rectangle extends MyShape {
    Point TopLeftCoordinate;
    Point BottomRightCoordinate;

    public Rectangle(
            int xTopLeftCoordinate,
            int yTopLeftCoordinate,
            int xBottomRightCoordinate,
            int yBottomRightCoordinate
    ) {
        this.TopLeftCoordinate = new Point(xTopLeftCoordinate, yTopLeftCoordinate);
        this.BottomRightCoordinate = new Point(xBottomRightCoordinate, yBottomRightCoordinate);
    }
    public Rectangle(){
        this.TopLeftCoordinate = new Point(0, 0);
        this.BottomRightCoordinate = new Point(1, -1);

    }
    public Rectangle(
            int xTopLeftCoordinate,
            int yTopLeftCoordinate,
            int xBottomRightCoordinate,
            int yBottomRightCoordinate,
            String color,
            boolean filled
    ) {
        this.TopLeftCoordinate = new Point(xTopLeftCoordinate, yTopLeftCoordinate);
        this.BottomRightCoordinate = new Point(xBottomRightCoordinate, yBottomRightCoordinate);
        this.color = color;
        this.filled = filled;
    }

    public Point getTopLeftCoordinate() {
        return TopLeftCoordinate;
    }
    public Point getBottomRightCoordinate() {
        return BottomRightCoordinate;
    }
    public void setTopLeftCoordinate(
            int xTopLeftCoordinate,
            int yTopLeftCoordinate
    ) {
        this.TopLeftCoordinate = new Point(xTopLeftCoordinate, yTopLeftCoordinate);
    }
    public void setBottomRightCoordinate(
            int xBottomRightCoordinate,
            int yBottomRightCoordinate
    ) {
        this.BottomRightCoordinate = new Point(xBottomRightCoordinate, yBottomRightCoordinate);
    }
    @Override
    public String toString() {
        return "Rectangle {TopLeftCoordinate = (" + TopLeftCoordinate.toString() +
                "), BottomRightCoordinate = (" + BottomRightCoordinate.toString() + ")} which is subclass of " + super.toString();
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
        if(TopLeftCoordinate != rectangle.TopLeftCoordinate){
            return false;
        }
        return BottomRightCoordinate == rectangle.BottomRightCoordinate;
    }
    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + TopLeftCoordinate.hashCode();
        result = 31 * result + BottomRightCoordinate.hashCode();
        return result;
    }

    int getArea(){
        return (BottomRightCoordinate.x- TopLeftCoordinate.x)*
                (TopLeftCoordinate.y - BottomRightCoordinate.y);
    }
    int getPerimeter(){
        return 2*((BottomRightCoordinate.x - TopLeftCoordinate.x)+
                (TopLeftCoordinate.y - BottomRightCoordinate.y));
    }

    int getLength(){
        return (BottomRightCoordinate.x - TopLeftCoordinate.x);
    }
    int getWidth(){
        return (TopLeftCoordinate.y - BottomRightCoordinate.y);
    }
    int getCenterX(){
        return (TopLeftCoordinate.x + BottomRightCoordinate.x)/2;
    }
    int getCenterY(){
        return (TopLeftCoordinate.y + BottomRightCoordinate.y)/2;
    }

    Double getDistanceToTheCenterOf(Rectangle anotherRectangle){
        return Math.sqrt(Math.pow((getCenterX() - anotherRectangle.getCenterX()), 2) +
                Math.pow((getCenterY() - anotherRectangle.getCenterY()), 2));
    }
}
