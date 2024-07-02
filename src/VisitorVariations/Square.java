package VisitorVariations;

public class Square extends Shape {
    public int getWidth() {
        return width;
    }

    private int width;
    public Shape topLeft, topRight, bottomLeft, bottomRight;

    public Square(int width) {
       this.width = width;
    }

    public void walk(Visitor v) {
        v.visit(this);
        if (topLeft != null) topLeft.walk(v);
        if (topRight != null) topRight.walk(v);
        if (bottomLeft != null) bottomLeft.walk(v);
        if (bottomRight != null) bottomRight.walk(v);
        v.postwalk(this);
    }

    @Override
    public String toString() {
        return "Square:" +
                "width=" + width +
                ", topLeft=" + topLeft +
                ", topRight=" + topRight +
                ", bottomLeft=" + bottomLeft +
                ", bottomRight=" + bottomRight;
    }
}
