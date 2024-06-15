public class Circle extends MyShape {
    Point center;
    int radius;

    public Circle(
            int xCoordinate,
            int yCoordinate,
            int radius
    ) {
        this.center = new Point(xCoordinate, yCoordinate);
        this.radius = radius;
    }
    public Circle(){
        this.center = new Point(0, 0);
        this.radius = 1;
    }
    public Circle(
            int xCoordinate,
            int yCoordinate,
            int radius,
            String color,
            boolean filled
    ) {
        this.center = new Point(xCoordinate, yCoordinate);
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public int getXCoordinate() {
        return center.xCoordinate;
    }
    public int getYCoordinate() {
        return center.yCoordinate;
    }
    public int getRadius() {
        return radius;
    }
   public void setCenter(Point center) {
        this.center = center;
   }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "Circle {Center = (" + center.xCoordinate + ", " + center.yCoordinate + "), Radius = " + radius + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Circle other = (Circle) obj;

        if(this.radius != other.radius){
            return false;
        }
        if(this.center.xCoordinate != other.center.xCoordinate){
            return false;
        }
        return this.center.yCoordinate == other.center.yCoordinate;
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.center.xCoordinate;
        result = 31 * result + this.center.yCoordinate;
        result = 31 * result + this.radius;
        return result;
    }

    Double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    Double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    Double getDistanceTo(Circle anotherCircle){
        return center.getDistanceC(anotherCircle.center);
    }
}

