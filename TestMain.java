
public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.getArea());

        Square square = new Square(4.0);
        System.out.println("Square Area: " + square.getArea());

        Rectangle rectangle = new Rectangle(3.0, 5.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Cylinder cylinder = new Cylinder(7.0, 3.0);
        System.out.println("Cylinder Volume: " + cylinder.getValue());
        System.out.println("Cylinder Surface Area: " + cylinder.getArea());

        Sphere sphere = new Sphere( 6.0);
        System.out.println("Sphere Volume: " + sphere.getValue());
        System.out.println("Sphere Surface Area: " + sphere.getArea());

        Pyramid pyramid = new Pyramid(4, 8, 6);
        System.out.println("Pyramid Volume: " + pyramid.getValue());
        System.out.println("Pyramid Surface Area: " + pyramid.getArea());

        Cone cone = new Cone(10.0, 4.0);
        System.out.println("Cone Volume: " + cone.getValue());
        System.out.println("Cone Surface Area: " + cone.getArea());
    }
}