package shapes;

public class Square extends Quadrilateral{
    protected int side;
    protected double length;
    protected double width;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    protected void setLength(int length) {

    }

    @Override
    protected void setWidth(int width) {

    }


//TODO: This "SUPER" is a constructor that references its extended Classes Constructor
//    public Square(int side){
//        super(side, side);
//        this.side = side;
//    }


//    @Override
//    public int getArea() {
//        System.out.println("This is from the squares area!");
//        return side * side;
//    } // Math.pow(side,2);

//    @Override
//    public int getPerimeter(){
//        System.out.println("This is from the squares perimeter!");
//        return 4 * side;
//    }


}
