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
        return "Square {" +
                "XCoordinate = " + xTopLeftCoordinate +
                ", YCoordinate = " + yTopLeftCoordinate +
                ", Side Length = " + getSideLength() + "} which is subclass of " + super.toString();
    }
}