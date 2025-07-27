public class Lab11_1_Main {
    public static void main(String[] args) {
        Lab11_1_Shape circle = new Lab11_1_Circle(5);
        Lab11_1_Shape rectangle = new Lab11_1_Rectangle(4, 6);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}

