public class Cuboid extends MyShape{
    Point3D TopLeftFrontCoordinate;
    Point3D BottomRightFrontCoordinate;
    Point3D TopLeftBackCoordinate;

    public Cuboid(
            int xTopLeftFrontCoordinate,
            int yTopLeftFrontCoordinate,
            int zTopLeftFrontCoordinate,

            int xBottomRightFrontCoordinate,
            int yBottomRightFrontCoordinate,
            int zBottomRightFrontCoordinate,

            int xTopLeftBackCoordinate,
            int yTopLeftBackCoordinate,
            int zTopLeftBackCoordinate
    ) {
        this.TopLeftFrontCoordinate = new Point3D(xTopLeftFrontCoordinate, yTopLeftFrontCoordinate, zTopLeftFrontCoordinate);
        this.BottomRightFrontCoordinate = new Point3D(xBottomRightFrontCoordinate, yBottomRightFrontCoordinate, zBottomRightFrontCoordinate);
        this.TopLeftBackCoordinate = new Point3D(xTopLeftBackCoordinate, yTopLeftBackCoordinate, zTopLeftBackCoordinate);
    }
    public Cuboid(){
        this.TopLeftFrontCoordinate = new Point3D(0, 1, 1);
        this.BottomRightFrontCoordinate = new Point3D(1, 0, 1);
        this.TopLeftBackCoordinate = new Point3D(0, 1, 0);
    }
    public Cuboid(
            int xTopLeftFrontCoordinate,
            int yTopLeftFrontCoordinate,
            int zTopLeftFrontCoordinate,

            int xBottomRightFrontCoordinate,
            int yBottomRightFrontCoordinate,
            int zBottomRightFrontCoordinate,

            int xTopLeftBackCoordinate,
            int yTopLeftBackCoordinate,
            int zTopLeftBackCoordinate,

            String color,
            boolean filled
    ){
        this.TopLeftFrontCoordinate = new Point3D(xTopLeftFrontCoordinate, yTopLeftFrontCoordinate, zTopLeftFrontCoordinate);
        this.BottomRightFrontCoordinate = new Point3D(xBottomRightFrontCoordinate, yBottomRightFrontCoordinate, zBottomRightFrontCoordinate);
        this.TopLeftBackCoordinate = new Point3D(xTopLeftBackCoordinate, yTopLeftBackCoordinate, zTopLeftBackCoordinate);
        this.color = color;
        this.filled = filled;
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
    @Override
    public String toString() {
        return "Cuboid {TopLeftFrontCoordinate: " + TopLeftFrontCoordinate.toString() + ", BottomRightFrontCoordinate" +
                BottomRightFrontCoordinate.toString() + ", TopLeftBackCoordinate: " + TopLeftBackCoordinate.toString() + "} " +
                "which is subclass of " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Cuboid cuboid = (Cuboid) obj;
        if(this.TopLeftFrontCoordinate != cuboid.TopLeftFrontCoordinate){
            return false;
        }
        if(this.BottomRightFrontCoordinate != cuboid.BottomRightFrontCoordinate){
            return false;
        }
        return this.TopLeftBackCoordinate == cuboid.TopLeftBackCoordinate;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if(TopLeftFrontCoordinate.x != 0){
            result = 31 * result  * TopLeftFrontCoordinate.x;
        }
        if(TopLeftFrontCoordinate.y != 0){
            result = 31 * result * TopLeftFrontCoordinate.y;
        }
        if(TopLeftFrontCoordinate.z != 0){
            result = 31 * result * TopLeftFrontCoordinate.z;
        }
        if(BottomRightFrontCoordinate.x != 0){
            result = 31 * result * BottomRightFrontCoordinate.x;
        }
        if(BottomRightFrontCoordinate.y != 0){
            result = 31 * result * BottomRightFrontCoordinate.y;
        }
        if(BottomRightFrontCoordinate.z != 0){
            result = 31 * result * BottomRightFrontCoordinate.z;
        }
        if(TopLeftBackCoordinate.x != 0){
            result = 31 * result * TopLeftBackCoordinate.x;
        }
        if(TopLeftBackCoordinate.y != 0){
            result = 31 * result * TopLeftBackCoordinate.y;
        }
        if(TopLeftBackCoordinate.z != 0){
            result = 31 * result * TopLeftBackCoordinate.z;
        }
        return result;
    }

    public int getBasePerimeter(){
        return 2*((BottomRightFrontCoordinate.x - TopLeftFrontCoordinate.x) + (TopLeftFrontCoordinate.z - BottomRightFrontCoordinate.z));
    }
    public double getBaseArea() {
        return (BottomRightFrontCoordinate.x- TopLeftFrontCoordinate.x) * (TopLeftFrontCoordinate.z - TopLeftBackCoordinate.z);
    }
    public double getLateralSurfaceArea() {
        return getBasePerimeter()*(TopLeftFrontCoordinate.y - BottomRightFrontCoordinate.y);
    }
    public double getFullSurfaceArea() {
        return getLateralSurfaceArea() + 2 * getBaseArea();
    }
    public double getVolume(){
        return getBaseArea()*(TopLeftFrontCoordinate.y - BottomRightFrontCoordinate.y);
    }
    public int getLength(){
        return BottomRightFrontCoordinate.x - TopLeftFrontCoordinate.x;
    }
    public int getWidth(){
        return TopLeftFrontCoordinate.z - TopLeftBackCoordinate.z;
    }
    public int getHeight(){
        return TopLeftFrontCoordinate.y - BottomRightFrontCoordinate.y;
    }
    public int getCenterX(){
        return (TopLeftFrontCoordinate.x + BottomRightFrontCoordinate.x) / 2;
    }
    public int getCenterY(){
        return (TopLeftFrontCoordinate.y + BottomRightFrontCoordinate.y) / 2;
    }
    public int getCenterZ(){
        return (TopLeftFrontCoordinate.z + TopLeftBackCoordinate.z) / 2;
    }
    public Point3D getCenter(){
        return new Point3D(getCenterX(), getCenterY(), getCenterZ());
    }
    public double getDistanceToTheCenterOf(Cuboid anotherCuboid) {
        return getCenter().getDistance(anotherCuboid.getCenter());
    }
}