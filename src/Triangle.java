public class Triangle extends Figure{
    private double h;
    private double b;

    public Triangle(double h, double b) {
        this.h = h;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return (h * b) / 2;
    }
}
