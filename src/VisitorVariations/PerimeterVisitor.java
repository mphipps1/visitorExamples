package VisitorVariations;

public class PerimeterVisitor extends Visitor {
    double perimeterSum;
    public void visit(Circle c) {
        perimeterSum += c.getRadius()* 2 * Math.PI;}
    public void visit(Square s) {
        perimeterSum += s.getWidth() * 4;}
    public void visit(Triangle t) {
        perimeterSum += t.getBaseWidth() + 2*
            Math.sqrt(t.getHeight()*t.getHeight() + t.getBaseWidth()*t.getBaseWidth());}
}
