public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 4);
        Rectangle rectangle2 = new Rectangle(4, 4);
        Triangle triangle1 = new Triangle(8, 8);
        Circle circle1 = new Circle(3.7);

        System.out.println(" Фигуры "+rectangle1+" "+rectangle2+" равны по площадям? "+rectangle1.compareAreas(rectangle2));
        System.out.println(" Фигуры "+rectangle2+" "+triangle1+" равны по площадям? "+rectangle2.compareAreas(triangle1));
        System.out.println(" Фигуры "+triangle1+" "+circle1+" равны по площадям? "+triangle1.compareAreas(circle1));
        System.out.println(" Фигуры "+circle1+" "+rectangle1+" равны по площадям? "+circle1.compareAreas(rectangle1));
    }
}