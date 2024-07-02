package VisitorVariations;

public class Circle extends Shape {
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

    public void walk(Visitor v) {
        v.visit(this); // no corners, nothing else to do here.
        v.postwalk(this);
    }
}
