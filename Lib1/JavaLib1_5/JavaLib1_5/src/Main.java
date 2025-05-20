public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(0, 0, 5, 3);
        System.out.println("矩形面积: " + rect.getArea());
        System.out.println("矩形周长: " + rect.getPerimeter());

        Circle circle = new Circle(1, 1, 4);
        System.out.println("圆形面积: " + circle.getArea());
        System.out.println("圆形周长: " + circle.getPerimeter());

        Triangle triangle = new Triangle(2, 2, 3, 4, 5);
        System.out.println("三角形面积: " + triangle.getArea());
        System.out.println("三角形周长: " + triangle.getPerimeter());
    }
}