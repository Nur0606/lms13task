public class Circle {
    private static final double PI = 3.14;

    public static double area(double radius) {
        return PI * (radius * radius);
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }
}
