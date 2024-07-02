package VisitorReplacement;

public class Triangle extends Shape {
    public float getHeight() {
        return height;
    }

    public float getBaseWidth() {
        return baseWidth;
    }

    private float height, baseWidth;
    public Shape top, left, right;

    public Triangle(int height, int baseWidth) {
        this.baseWidth = baseWidth;
        this.height = height;
    }

    public Shape walk(Visitor v) {
        Shape retVal = v.visit(this);
        if (top!= null) top = top.walk(v);
        if (left != null) left = left.walk(v);
        if (right != null) right = right.walk(v);
        return retVal;
    }

    @Override
    public String toString() {
        return "Triangle:" +
                "height=" + height +
                ", baseWidth=" + baseWidth +
                ", top=" + top +
                ", left=" + left +
                ", right=" + right ;
    }
}
