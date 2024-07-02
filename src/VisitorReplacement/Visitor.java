package VisitorReplacement;

public abstract class Visitor {
    public Shape visit(Circle c) {return c;}
    public Shape visit(Square s) {return s;}
    public Shape visit(Triangle t) {return t;}
}
