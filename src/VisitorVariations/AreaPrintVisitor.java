package VisitorVariations;


public class AreaPrintVisitor extends Visitor {
    public double areaSum;
    public void visit(Circle c) {areaSum += c.getRadius() * c.getRadius() * Math.PI;}
    public void visit(Square s) {areaSum += s.getWidth() * s.getWidth();}
    public void visit(Triangle t) {areaSum += t.getHeight() * t.getBaseWidth()/ 2;}
    public void postwalk(Circle c) { System.out.println("The area so far is " + areaSum); }
    public void postwalk(Square s) { System.out.println("The area so far is " + areaSum); }
    public void postwalk(Triangle t) { System.out.println("The area so far is " + areaSum); }
}
