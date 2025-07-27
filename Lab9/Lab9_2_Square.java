public class Lab9_2_Square extends Lab9_2_Shape{
    int length;

    // Constructor
    Lab9_2_Square(int length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return length * length;
    }
}
