package shapes;

public class Square extends Rectangle{
    protected int side;


//TODO: This "SUPER" is a constructor that references its extended Classes Constructor
    public Square(int side){
        super(side, side);
        this.side = side;
    }


    @Override
    public int getArea() {
        System.out.println("This is from the squares area!");
        return side * side;
    } // Math.pow(side,2);

    @Override
    public int getPerimeter(){
        System.out.println("This is from the squares perimeter!");
        return 4 * side;
    }


}
