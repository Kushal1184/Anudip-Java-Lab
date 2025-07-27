public class Lab9_2_Rectangle extends Lab9_2_Shape{
    int width;
    int height;


    Lab9_2_Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}
