public class Rectangle3D {
    Point3D TopLeftFrontCoordinate;
    Point3D BottomRightFrontCoordinate;
    Point3D TopLeftBackCoordinate;

    public Rectangle3D(Point3D TopLeftFrontCoordinate, Point3D BottomRightFrontCoordinate, Point3D TopLeftBackCoordinate) {
        this.TopLeftFrontCoordinate = TopLeftFrontCoordinate;
        this.BottomRightFrontCoordinate = BottomRightFrontCoordinate;
        this.TopLeftBackCoordinate = TopLeftBackCoordinate;
    }
    public Point3D getTopLeftFrontCoordinate() {
        return TopLeftFrontCoordinate;
    }
    public Point3D getBottomRightFrontCoordinate() {
        return BottomRightFrontCoordinate;
    }
    public Point3D getTopLeftBackCoordinate() {
        return TopLeftBackCoordinate;
    }

    public double getArea() {
        return (BottomRightFrontCoordinate.x- TopLeftFrontCoordinate.x) * (TopLeftFrontCoordinate.y - BottomRightFrontCoordinate.y);
    }
    public double getVolume(){
        return getArea()*(TopLeftFrontCoordinate.z - TopLeftBackCoordinate.z);
    }
}