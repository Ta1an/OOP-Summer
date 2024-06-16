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
        return "Rectangle {TopLeftCoordinate = (" + TopLeftCoordinate.x + ", " + TopLeftCoordinate.y +
                "), BottomRightCoordinate = (" + BottomRightCoordinate.x + ", " + BottomRightCoordinate.y + ")} " +
                "which is subclass of "
                + super.toString();
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
        if(TopLeftCoordinate.x != 0){
            result = 31 * result * TopLeftCoordinate.x;
        }
        if(TopLeftCoordinate.y != 0){
            result = 31 * result * TopLeftCoordinate.y;
        }
        if(BottomRightCoordinate.x != 0){
            result = 31 * result + BottomRightCoordinate.x;
        }
        if(BottomRightCoordinate.y != 0){
            result = 31 * result + BottomRightCoordinate.y;
        }
        return result;
    }

    int getArea(){
        return (BottomRightCoordinate.x - TopLeftCoordinate.x) *
                (TopLeftCoordinate.y - BottomRightCoordinate.y);
    }
    int getPerimeter(){
        return 2*((BottomRightCoordinate.x - TopLeftCoordinate.x) +
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
    Point getCenter(){
        return new Point(getCenterX(), getCenterY());
    }

    Double getDistanceToTheCenterOf(Rectangle anotherRectangle){
        return getCenter().getDistance(anotherRectangle.getCenter());
    }
}
