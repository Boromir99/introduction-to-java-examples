package learning;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(1, 2, 2, "redSuperclasses and Subclasses");

        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.toString());

    }
}
