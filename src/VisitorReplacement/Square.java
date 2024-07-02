package VisitorReplacement;

public class Square extends Shape {
    public int getWidth() {
        return width;
    }

    private int width;
    public Shape topLeft, topRight, bottomLeft, bottomRight;

    public Square(int width) {
       this.width = width;
    }

    public Shape walk(Visitor v) {
        Shape retVal = v.visit(this);
        if (topLeft != null)
            topLeft = topLeft.walk(v);
        if (topRight != null)
            topRight = topRight.walk(v);
        if (bottomLeft != null)
            bottomLeft = bottomLeft.walk(v);
        if (bottomRight != null)
            bottomRight = bottomRight.walk(v);
        return retVal;
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
