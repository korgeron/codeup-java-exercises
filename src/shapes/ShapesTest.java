package shapes;

public class ShapesTest{

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle();
        box1.setWidth(4);
        box1.setLength(5);
        System.out.println(box1.getPerimeter()); // 18
        System.out.println(box1.getArea()); // 20

        Square box2 = new Square();
        box2.Side(5);
        System.out.println(box2.getPerimeter()); // 20 // 40 for the override method
        System.out.println(box2.getArea()); // 25 //8 for the override method

    }
}
