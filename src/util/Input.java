package util;


import java.util.Arrays;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter in some text please!");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter a variant of the word: YES");
        String[] isYes = {"y", "yes", "yeah", "yea", "ya", "ok", "okay", "yeehaw", "of course", "im on it", "very well", "definitely", "certainly", "sounds good", "indeed", "affirmative"};
        String answer = scanner.nextLine();
        boolean isTrue = false;
        for(int i = 0; i < isYes.length; i++){
            if (answer.toLowerCase().matches(isYes[i]) ){
                isTrue = true;
            }
        }
        return isTrue;
    }

    public int getInt(int min, int max){
        System.out.printf("Enter number between %d and %d", min, max);
        int answer = scanner.nextInt();
        int theNumber = 0;
        if (answer >= min && answer <= max ){
            theNumber = answer;
            System.out.println("You chose the number " + theNumber);
        } else {
            System.out.println("Try again...");
            getInt(min,max);
        }
        return theNumber;
    }

    public int getInt(){
        System.out.println("Give me a whole valued number!");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter number between %.2f and %.2f", min, max);
        double answer = scanner.nextDouble();
        double theNumber = 0;
        if (answer > min && answer < max ){
            theNumber = answer;
            System.out.println("You chose the number " + theNumber);
        } else {
            System.out.println("Try again...");
            getDouble(min,max);
        }
        return theNumber;
    }

    public double getDouble(){
        System.out.println("Give me a decimal valued number!");
        return scanner.nextDouble();
    }


    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.getString());
        System.out.println(input.yesNo());
//        input.getInt(1,10);
//        input.getDouble(0,1);
    }

}
