public class Cube extends Cuboid {
    public int getSideLength(){
        return super.getLength();
    }
    public Cube(int xTopLeftFrontCoordinate,
                int yTopLeftFrontCoordinate,
                int zTopLeftFrontCoordinate,
                int SideLength
    ) {
        super(xTopLeftFrontCoordinate,
                yTopLeftFrontCoordinate,
                zTopLeftFrontCoordinate,

                xTopLeftFrontCoordinate + SideLength,
                yTopLeftFrontCoordinate - SideLength,
                zTopLeftFrontCoordinate,

                xTopLeftFrontCoordinate,
                yTopLeftFrontCoordinate,
                zTopLeftFrontCoordinate - SideLength);
    }
    public Cube(){
        super();
    }
    @Override
    public String toString() {
        return "Cube {Coordinates = " + TopLeftFrontCoordinate.toString() + ", Side Length = " + getSideLength() + "} " +
                "which is subclass of " + super.toString();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Cube cube = (Cube) obj;
        return super.equals(cube);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
