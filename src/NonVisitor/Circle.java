package NonVisitor;

public class Circle extends Shape{
    public double getRadius() {
        return radius;
    }

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circle: radius=" + radius  ;
    }

    @Override
    public float getArea() {
        return (float) (radius * radius * Math.PI);
    }

    public float getPerimeter() {
        return (float)(radius * 2 * Math.PI);
    }
}
