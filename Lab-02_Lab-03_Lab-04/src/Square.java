public class Square extends Rectangle {
    public int getSideLength() {
        return super.getLength();
    }

    public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength) {
        super(
                xTopLeftCoordinate,
                yTopLeftCoordinate,
                xTopLeftCoordinate + sideLength,
                yTopLeftCoordinate - sideLength
        );
    }

    public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength, String color, boolean filled) {
        super(
                xTopLeftCoordinate,
                yTopLeftCoordinate,
                xTopLeftCoordinate + sideLength,
                yTopLeftCoordinate - sideLength,
                color,
                filled
        );
    }

    public Square() {
        super();
    }

    @Override
    public String toString() {
        return "Square {Coordinates = (" + TopLeftCoordinate.x + ", " +
                TopLeftCoordinate.y + "), Side Length = " + getSideLength() + "} which is subclass of "+ super.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Square square = (Square) obj;
        return super.equals(square);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}