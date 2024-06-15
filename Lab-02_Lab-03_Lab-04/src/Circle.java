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
        return center.x;
    }
    public int getYCoordinate() {
        return center.y;
    }
    public int getRadius() {
        return radius;
    }

    public void setXCoordinate(int xCoordinate) {
        this.center.x = xCoordinate;
    }
    public void setYCoordinate(int yCoordinate) {
        this.center.y = yCoordinate;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Circle {" + center.toString() + "Radius = " + radius + "}";
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
        if(center.x != other.center.x){
            return false;
        }
        if(center.y != other.center.y){
            return false;
        }
        return radius == other.radius;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.center.x;
        result = 31 * result + this.center.y;
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
        return center.getDistance(anotherCircle.center);
    }
}

