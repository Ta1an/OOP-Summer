public class Point3D {
    int x;
    int y;
    int z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setZ(int z) {
        this.z = z;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
    Double getDistance(Point3D anotherPoint){
        return Math.sqrt(Math.pow((this.x - anotherPoint.x), 2) +
                Math.pow((this.x - anotherPoint.x) ,2) +
                Math.pow((this.z - anotherPoint.z), 2));
    }
}
