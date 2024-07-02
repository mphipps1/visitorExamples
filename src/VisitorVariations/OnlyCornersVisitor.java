package VisitorVariations;

public class OnlyCornersVisitor extends Visitor {
    public void visit(Circle c) {/* Do NOTHING */ }
    public void visit(Square s) {/* Do something */ }
    public void visit(Triangle t) { /* Do something */
    }
}
