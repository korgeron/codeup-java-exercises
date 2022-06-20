package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean keepMakingCircles = true;
        while (keepMakingCircles) {
            Input input = new Input();
            System.out.println("Let's make a circle together!");
            Circle circle = new Circle(input.getDouble());
            System.out.println("A beautiful circle... Let's do some math.");
            System.out.printf("Did you know that your beautiful circle has a circumference of %f?%n", circle.getCircumference());
            System.out.printf("Did you know that your beautiful circle has an area of %f?%n", circle.getArea());
            System.out.println("Wow, that was so much fun!");
            System.out.println("Do you want to make another beautiful circle?");
            scan.nextLine();
            keepMakingCircles = input.yesNo();
            if (keepMakingCircles) {
                System.out.println("HOORAY!!! What a wonderful day!");
            } else {
                System.out.println("I understand, for that can only be so many beautiful circles made in one day.");
            }
        }
        System.out.println("Until next time, stay safe!");
    }
}