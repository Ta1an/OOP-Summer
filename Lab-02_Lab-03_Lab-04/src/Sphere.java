public class Sphere extends MyShape{
    Point3D center;
    int radius;

    public Sphere(
            int xCoordinate,
            int yCoordinate,
            int zCoordinate,
            int radius
    ){
      this.center = new Point3D(xCoordinate, yCoordinate, zCoordinate);
      this.radius = radius;
    }
    public Sphere(){
        this.center = new Point3D(0, 0, 0);
        this.radius = 1;
    }
    public int getXCoordinate(){
        return this.center.x;
    }
    public int getYCoordinate(){
        return this.center.y;
    }
    public int getZCoordinate(){
        return this.center.z;
    }
    public int getRadius(){
        return this.radius;
    }
    public void setXCoordinate(int xCoordinate){
        this.center.x = xCoordinate;
    }
    public void setYCoordinate(int yCoordinate){
        this.center.y = yCoordinate;
    }
    public void setZCoordinate(int zCoordinate){
        this.center.z = zCoordinate;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "Sphere {Center = " + center + ", Radius = " + radius + "}";
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Sphere sphere = (Sphere) obj;
        if(this.center.x != sphere.center.x){
            return false;
        }
        if(this.center.y != sphere.center.y){
            return false;
        }
        return radius == sphere.radius;
    }
    @Override
    public int hashCode(){
        int result = 17;
        if(this.center.x != 0){
            result = 31 * result + this.center.x;
        }
        if(this.center.y != 0){
            result = 31 * result + this.center.y;
        }
        if(this.center.z != 0){
            result = 31 * result + this.center.z;
        }
        if(this.radius != 0){
            result = 31 * result + this.radius;
        }
        return result;
    }
    public int getDiameter(){
        return radius * 2;
    }
    public Double getSurfaceArea(){
        return 4* Math.PI * Math.pow(radius, 2);
    }
    public Double getVolume(){
        return 4/3 * Math.PI * Math.pow(radius, 3);
    }
    public Double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public Double getDistanceTo(Sphere anotherSphere){
        return center.getDistance(anotherSphere.center);
    }
}
