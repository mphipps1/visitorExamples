package Visitor;

public abstract class Visitor {
    public abstract void visit(Circle c);
    public abstract void visit(Square s);
    public abstract void visit(Triangle t);
}
