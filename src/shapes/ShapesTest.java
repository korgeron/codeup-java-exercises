package shapes;

public class ShapesTest{

    public static void main(String[] args) {
//TODO: This is for Inherit and Poly exercise

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter()); // 18
//        System.out.println(box1.getArea()); // 20
//
//        Square box2 = new Square(5);
//
//        System.out.println(box2.getPerimeter()); // 20
//        System.out.println(box2.getArea()); // 25

//TODO: This is for interface and abstract exercise

        Measurable myShape1 = new Square(10); // 40
        Measurable myShape2 = new Rectangle(10, 5); // 30
        System.out.println("Square: " + myShape1.getPerimeter());
        System.out.println("Rectangle: " + myShape2.getPerimeter());




    }
}
