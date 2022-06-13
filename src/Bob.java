import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Whats your question!");
//        String userInput = scanner.nextLine();
//        System.out.println(userInput);
//        if (userInput.endsWith("?")){
//            System.out.println("Sure.");
//        }else if (userInput.endsWith("!")){
//            System.out.println("Whoa, chill out!");
//        }else if (userInput.equals("")){
//            System.out.println("Fine. Be that way!");
//        } else{
//            System.out.println("Whatever.");
//        }


        do {
            System.out.println("Do you have a question? [Y/N]");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase("y")) {

                System.out.println("Bob: Whats your question!");
                String userInput = scanner.nextLine();
                if (userInput.endsWith("?")) {
                    System.out.println("Bob: Sure.");
                } else if (userInput.endsWith("!")) {
                    System.out.println("Bob: Whoa, chill out!");
                } else if (userInput.equals("")) {
                    System.out.println("Bob: Fine. Be that way!");
                } else {
                    System.out.println("Bob: Whatever.");
                }

            }
            if (userAnswer.equalsIgnoreCase("n")){
                System.out.println("Bob: Get outta here!");
                break;
            }
        } while (true);


    }
}
