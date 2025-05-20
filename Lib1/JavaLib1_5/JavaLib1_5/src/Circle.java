public class Circle extends Coordinates implements Shape {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        if (radius <= 0) {
            throw new IllegalArgumentException("半径必须为正数");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}