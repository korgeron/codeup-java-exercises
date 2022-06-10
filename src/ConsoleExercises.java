import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.printf("The value of %f is approximately 3.14 \n", pi);
//
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Give me a number: ");
//        int userNum = scanner.nextInt();
//        System.out.println(userNum);
//
//        System.out.println("List 3 words: ");
//        String input1 = scanner.next();
//        String input2 = scanner.next();
//        String input3 = scanner.next();
//
//        System.out.println(input1);
//        System.out.println(input2);
//        System.out.println(input3);
//
//        System.out.println("Give me a sentence!");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);



//TODO: changed int to float to see how it works

        System.out.println("Enter length of room: ");
        float length = Float.parseFloat(scanner.nextLine());
        System.out.println(length);
        System.out.println("Enter width of room: ");
        float width = Float.parseFloat(scanner.nextLine());
        System.out.println(width);

        System.out.printf("The area of the room is %.2f %n", (length * width));
        System.out.printf("The perimeter of the room is %.2f" , ((length * 2) + (width * 2)));









    }
}
