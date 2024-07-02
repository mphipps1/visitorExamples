package Visitor;

public class AreaVisitor extends Visitor{
    double areaSum;
    public void visit(Circle c) {areaSum += c.getRadius() * c.getRadius() * Math.PI;}
    public void visit(Square s) {areaSum += s.getWidth() * s.getWidth();}
    public void visit(Triangle t) {areaSum += t.getHeight() * t.getBaseWidth()/ 2;}
}
