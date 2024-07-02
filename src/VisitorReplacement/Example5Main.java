package VisitorReplacement;

import java.util.ArrayList;

public class Example5Main {

    public static void main(String[] args) {
        // Build a sample set of objects
        var myShapes = new ArrayList<Shape>();
        myShapes.add(new Circle(1.0));
        myShapes.add(new Circle(3.0));
        var t = new Triangle(3,4);
        t.left = new Square(4);
        t.right = new Circle(3);
        t.top = new Square(3);
        myShapes.add(t);
        var sq = new Square(5);
        sq.topLeft = new Square(4);
        sq.topRight = new Circle(3);
        sq.bottomLeft = new Square(3);
        myShapes.add(sq);
        for (Shape s : myShapes) {
            // print each one
            System.out.println("Original: " + s);
            SquareTheCircleVisitor v = new SquareTheCircleVisitor();
            Shape retVal = s.walk(v);
            System.out.println("Modified: " + retVal);
        }
    }
}
