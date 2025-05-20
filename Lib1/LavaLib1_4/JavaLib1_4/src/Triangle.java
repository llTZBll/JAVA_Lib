public class Triangle extends Coordinates implements Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double x, double y, double side1, double side2, double side3) {
        super(x, y);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        // 使用海伦公式计算三角形面积
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}