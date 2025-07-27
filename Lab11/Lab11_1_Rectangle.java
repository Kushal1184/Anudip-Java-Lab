public class Lab11_1_Rectangle extends Lab11_1_Shape{
    double width;
    double height;

    Lab11_1_Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}
