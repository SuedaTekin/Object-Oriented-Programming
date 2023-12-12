
abstract class Shape3D {
    double depth;
    double height;
    double width;
    double radius;
    float PI;
    Shape3D(double depth, double height, double width) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    Shape3D(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    abstract double getValue();

    @Override
    public String toString() {
        return "Shape3D";
    }
}

