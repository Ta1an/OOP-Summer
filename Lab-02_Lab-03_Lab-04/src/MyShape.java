public class MyShape {
    String color;
    boolean filled;

    public MyShape(){
        this.color = "black";
        this.filled = false;
    }
    public MyShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "MyShape (Color=" + color + ", IsFilled=" + filled + ")";
    }
}
