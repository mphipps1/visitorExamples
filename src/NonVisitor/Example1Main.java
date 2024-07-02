package NonVisitor;

import java.util.ArrayList;

public class Example1Main {

    public static void main(String[] args) {
        var myShapes = new ArrayList<Shape>();
        myShapes.add(new Circle(1.0));
        myShapes.add(new Circle(3.0));

        for (Shape s : myShapes)
            if (s instanceof Circle)
                System.out.println((Circle)s);
    }
}
