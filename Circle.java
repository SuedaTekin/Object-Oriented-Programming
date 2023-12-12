
class Circle extends Shape2D {
    Circle(double radius) {
        super(radius);
    }

    @Override
    double getArea() {
        return PI * Math.pow(radius, 2);
    }
}

class Square extends Shape2D {
    Square(double width) {
        super(0, width);
    }

    @Override
    double getArea() {
        return Math.pow(width, 2);
    }
}

class Rectangle extends Shape2D {
    Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    double getArea() {
        return height * width;
    }
}