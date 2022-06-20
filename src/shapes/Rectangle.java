package shapes;

public class Rectangle {
    protected int length;
    protected int width;
    protected int area;
    protected int perimeter;

    public int getLength() {
        return length;
    }

    public int setLength(int length) {
       return this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int setWidth(int width) {
       return this.width = width;
    }


    public int getArea(){
        return area = length * width;
    }

    public int getPerimeter(){
        return perimeter = (2 * length) + (2 * width);
    }
}

