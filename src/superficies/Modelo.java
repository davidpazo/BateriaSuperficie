package superficies;

/**
 *
 * @author dpazolopez
 */
public class Modelo {

    String shapeType;
    float circleArea;
    float radius;
    float rectangleArea;
    float triangleArea;
    float baseLength;
    float height;
    float squareArea;

    public Modelo() {
    }

    public Modelo(String shapeType, float rectangleArea, float baseLength, float triangleArea, float radius, float heigth, float circleArea, float squareArea) {
        this.shapeType = shapeType;

        this.rectangleArea = rectangleArea;
        this.baseLength = baseLength;
        this.triangleArea = triangleArea;
        this.radius = radius;
        this.height = heigth;
        this.circleArea = circleArea;
        this.squareArea = squareArea;
    }

    public float getSquareArea() {
        return squareArea;
    }

    public void setSquareArea(float squareArea) {
        this.squareArea = squareArea;
    }

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public float getRectangleArea() {
        return rectangleArea;
    }

    public void setRectangleArea(float rectangleArea) {
        this.rectangleArea = rectangleArea;
    }

    public float getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(float baseLength) {
        this.baseLength = baseLength;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getCircleArea() {
        return circleArea;
    }

    public void setCircleArea(float circleArea) {
        this.circleArea = circleArea;
    }

    public float getTriangleArea() {
        return triangleArea;
    }

    public void setTriangleArea(float triangleArea) {
        this.triangleArea = triangleArea;
    }
}
