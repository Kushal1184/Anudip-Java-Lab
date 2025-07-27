public class Lab9_2_Main {
    public static void main(String[] args) {
        Lab9_2_Circle circle = new Lab9_2_Circle(5);
        Lab9_2_Square square = new Lab9_2_Square(4);
        Lab9_2_Rectangle rectangle = new Lab9_2_Rectangle(6, 3);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}

