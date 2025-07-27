class Lab11_1_Circle extends Lab11_1_Shape{
    double radius;

    Lab11_1_Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14159 * radius * radius;
    }
}
