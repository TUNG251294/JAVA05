public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("Blue");
        System.out.println(circle.getColor());
        System.out.println(circle.getRadius());
        System.out.printf("%.3f",circle.getArea());
    }
}