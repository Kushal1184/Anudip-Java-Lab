public class Lab9_2_Circle extends Lab9_2_Shape{
    int radius;


    Lab9_2_Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14159 * radius * radius;
    }
}
