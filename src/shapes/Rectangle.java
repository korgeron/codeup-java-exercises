package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        super((int) length, (int) width);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setLength(int length) {
        this.length = length;
    }

    @Override
    void setWidth(int width) {
        this.width = width;
    }
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public int setLength(int length) {
//       return this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public int setWidth(int width) {
//       return this.width = width;
//    }
//
//
//    public int getArea(){
//        return  length * width;
//    }
//
//    public int getPerimeter(){
//        return (2 * length) + (2 * width);
//    }
}

