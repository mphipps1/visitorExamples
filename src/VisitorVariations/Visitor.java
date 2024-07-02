package VisitorVariations;

public abstract class Visitor {
    public void visit(Circle c) {}
    public void visit(Square s){}
    public void visit(Triangle t){}
    public void postwalk(Circle c){}
    public void postwalk(Square s){}
    public void postwalk(Triangle t){}
}
