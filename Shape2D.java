
abstract class Shape2D {
    final double PI = 3.14159;
    double height;
    double radius;
    double width;

    Shape2D(double height, double width) {
        this.height = height;
        this.width = width;
    }

    Shape2D(double radius) {
        this.radius = radius;
    }

    abstract double getArea();

    @Override
    public String toString() {
        return "Shape2D";
    }
}

