public class Circle {
    private double radius = 1.0;
    private String color = "Red";
    public Circle(){
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public String getColor(){
        return this.color;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
}
