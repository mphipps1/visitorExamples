package VisitorReplacement;

public class SquareTheCircleVisitor extends Visitor {
    public Shape visit(Circle c) {return new Square((int)(c.getRadius()));}
}
