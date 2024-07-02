package Visitor;

import java.util.ArrayList;

public class Example3Main {

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
        // Run area on each one
        for (Shape s : myShapes) {
            AreaVisitor v = new AreaVisitor();
            s.walk(v);
            System.out.println("The area of " + s + " is " + v.areaSum);
        }
        // Run perimeter on each one
        for (Shape s : myShapes) {
            PerimeterVisitor v = new PerimeterVisitor();
            s.walk(v);
            System.out.println("The perimeter of " + s + " is " + v.perimeterSum);
        }
    }
}
