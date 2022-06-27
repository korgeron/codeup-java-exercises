package util;


import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
//        System.out.println("Enter in some text please!");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter a variant of the word: YES");
        String[] isYes = {"y", "yes", "yeah", "yea", "ya", "ok", "okay", "yeehaw", "of course", "im on it", "very well", "definitely", "certainly", "sounds good", "indeed", "affirmative"};
        String answer = scanner.nextLine();
        boolean isTrue = false;
        for (int i = 0; i < isYes.length; i++) {
            if (answer.toLowerCase().matches(isYes[i])) {
                isTrue = true;
            }
        }
        return isTrue;
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter number between %d and %d%n", min, max);
        String userInt = getString();
        int theNumber = 0;
        try {
            if (Integer.parseInt(userInt) >= min && Integer.parseInt(userInt) <= max) {
                theNumber += Integer.parseInt(userInt);
                System.out.println("You chose the number " + theNumber);
            } else {
                System.out.println("Try again...");
                getInt(min, max);
            }
            return theNumber;
        } catch (NumberFormatException e){
            throw new NumberFormatException("This isn't a number!!");
        }
    }

    public int getInt() {
        System.out.println("Give me a(n) Integer!");
        String userDub = getString();
        try {
            return Integer.parseInt(userDub);
        } catch (NumberFormatException e){
//            e.printStackTrace();
            throw new NumberFormatException("This isn't a(n) Integer!");

        }
    }

    public double getDouble(double min, double max) throws Exception {
        System.out.printf("Enter a decimal value between %.2f and %.2f%n", min, max);
        String userDub = getString();
        double theNumber = 0;

        try {

            if (Double.parseDouble(userDub) > min && Double.parseDouble(userDub) < max) {
                theNumber += Double.parseDouble(userDub);
                System.out.println("You choice was the number " + theNumber);
            } else {
                System.err.println("Your answer must be \"BETWEEN\" " + min + " and " + max + "!");
                getDouble(1, 5);
            }

            return theNumber;

        } catch (NumberFormatException e) {
//            e.printStackTrace();
            System.err.println("NEEDS TO BE A NUMBER!!");
           return getDouble(1, 5);
        }

    }


    public double getDouble() {
        System.out.println("Give me a Double value number!");
        String userDub = getString();
        try {
            return Double.parseDouble(userDub);
        } catch (NumberFormatException e){
//            e.printStackTrace();
           throw new NumberFormatException("This isn't even a number....");

        }
    }


    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.getString());
        System.out.println(input.yesNo());
//        input.getInt(1,10);
//        input.getDouble(0,1);
    }

}
