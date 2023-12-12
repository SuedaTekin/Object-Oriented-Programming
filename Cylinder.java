
class Cylinder extends Shape3D {
    Cylinder(double height, double radius) {
        super(0, height, radius);
    }

    @Override
    double getValue() {
        return PI * Math.pow(radius, 2) * height;
    }

    double getArea() {
        return 2 * PI * radius * (radius + height);
    }
}

class Pyramid extends Shape3D {
    Pyramid(int depth, int height, int width) {
        super(depth, height, width);
    }

    @Override
    double getValue() {
        return (1.0 / 3.0) * height * width * depth;
    }

    double getArea() {
        return width * depth + width * Math.sqrt(Math.pow(depth / 2.0, 2) + Math.pow(height, 2))
                + depth * Math.sqrt(Math.pow(width / 2.0, 2) + Math.pow(height, 2));
    }
}
class Sphere extends Shape3D {
    Sphere(double radius) {
        super(0, radius);
    }

    @Override
    double getValue() {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    double getArea() {
        return 4 * PI * Math.pow(radius, 2);
    }
}
class Cone extends Shape3D {
    Cone(double height, double radius) {
        super(0, height, radius);
    }

    @Override
    double getValue() {
        return (1.0 / 3.0) * PI * Math.pow(radius, 2) * height;
    }

    double getArea() {
        return PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }
}
