public class Circle extends Figure{
    private double r;  //радиус

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }

}
