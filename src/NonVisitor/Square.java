package NonVisitor;

public class Square extends Shape {
    public int getWidth() {
        return width;
    }

    private int width;
    public Shape topLeft, topRight, bottomLeft, bottomRight;

    public Square( int width) {
       this.width = width;
    }

    public float getArea() {
        float retVal = width * width;
        if (topLeft != null) retVal += topLeft.getArea();
        if (topRight != null) retVal += topRight.getArea();
        if (bottomLeft != null) retVal += bottomLeft.getArea();
        if (bottomRight != null) retVal += bottomRight.getArea();
        return retVal;
    }

    @Override
    public float getPerimeter() {
        float retVal = 4 * width;
        if (topLeft != null) retVal += topLeft.getPerimeter();
        if (topRight != null) retVal += topRight.getPerimeter();
        if (bottomLeft != null) retVal += bottomLeft.getPerimeter();
        if (bottomRight != null) retVal += bottomRight.getPerimeter();
        return retVal;
    }

    @Override
    public String toString() {
        return "NonVisitor.Square:" +
                "width=" + width +
                ", topLeft=" + topLeft +
                ", topRight=" + topRight +
                ", bottomLeft=" + bottomLeft +
                ", bottomRight=" + bottomRight;
    }
}
