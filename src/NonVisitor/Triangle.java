package NonVisitor;

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

    public float getArea() {
        float retVal = baseWidth * height / 2;
        if (top!= null) retVal += top.getArea();
        if (left != null) retVal += left.getArea();
        if (right != null) retVal += right.getArea();
        return retVal;
    }

    @Override
    public float getPerimeter() { // Assume isosceles triangle
        float oneSide = (float)Math.sqrt((float)(((baseWidth / 2) * (baseWidth / 2) + height * height)));
        float retVal = baseWidth + 2 * oneSide;
        if (top!= null) retVal += top.getPerimeter();
        if (left != null) retVal += left.getPerimeter();
        if (right != null) retVal += right.getPerimeter();
        return retVal;
    }

    @Override
    public String toString() {
        return "NonVisitor.Triangle:" +
                "height=" + height +
                ", baseWidth=" + baseWidth +
                ", top=" + top +
                ", left=" + left +
                ", right=" + right ;
    }
}
