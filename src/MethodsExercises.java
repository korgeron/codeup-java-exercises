import java.util.Scanner;

public class MethodsExercises {
    //TODO: Part One
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }


//TODO: Part Two

    public static int getInt (int min, int max){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = scan.nextInt();
            if (userInput > max || userInput < min){
                System.out.println(userInput+" is not between "+ min + " and " + max);
               return getInt(min, max);
            }
        return userInput;
    }





//TODO: Part Three

    public static void factorials(){
        Scanner scan = new Scanner(System.in);
        int userData = getInt(1,10);
        long userFact = 1;
        for (int i = 1; i <= userData; i++){
            userFact *= i;

        }
        System.out.println(userFact);
        System.out.println("Would you like to continue? [Y/N]");
        String answer = scan.nextLine();
        if (answer.equalsIgnoreCase("y")){
            factorials();
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(3, 1));
//        System.out.println(multiplication(3, 1));
//        System.out.println(division(10, 2));
//        chooseNumber();


        factorials();



    }
}
