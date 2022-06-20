package shapes;

public class Square extends Rectangle{
    private int side;

    public int Side(int num){
        return side = setWidth(num) + setLength(num);
    }
    @Override
    public int getArea(){
        return area = side ^ 2;
    }

    @Override
    public int getPerimeter(){
        return perimeter = 4 * side;
    }

    public static void main(String[] args) {

    }
}
