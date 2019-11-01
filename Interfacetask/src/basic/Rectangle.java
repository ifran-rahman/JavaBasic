package basic;

public class Rectangle implements Shape {

    private double length;
    private double width;

    @Override
    public String Shape(String name) {
        return null;
    }

    @Override
    public String getname() {
        return null;
    }

    @Override
    public void setname(String name) {

    }

    @Override
    public double area() {

        return length*width ;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
