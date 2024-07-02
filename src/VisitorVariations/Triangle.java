package VisitorVariations;

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

    public void walk(Visitor v) {
        v.visit(this);
        if (top!= null) top.walk(v);
        if (left != null) left.walk(v);
        if (right != null) right.walk(v);
        v.postwalk(this);
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
