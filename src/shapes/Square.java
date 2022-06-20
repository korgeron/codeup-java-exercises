package shapes;

public class Square extends Rectangle{
    private int side;

    public Square(int side){
        super(side, side);
        this.side = side;
    }

    @Override
    public int getArea(){
        return area = side * side;
    }

    @Override
    public int getPerimeter(){
        return perimeter = 4 * side;
    }

    public static void main(String[] args) {

    }
}
