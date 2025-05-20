public class Rectangle extends Coordinates implements Shape {
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("宽度和高度必须为正数");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}