import java.util.Scanner;

public class HighLow {

    public static void game() {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100) + 1;
        System.out.println("Guess number between 1 and 100");
        int answer = scanner.nextInt();
        while (true) {

            if (answer == randomNum) {
                System.out.println("GOOD GUESS");
                break;
//                System.out.println("Play again? [Y/N]");
//                String choice = scanner.nextLine();
//                if (choice.equalsIgnoreCase("y")) {
//                    game();
            } else if (answer < randomNum) {
                System.out.println("HIGHER");
            } else if (answer > randomNum) {
                System.out.println("LOWER");
            }

        }
    }

    public static void main(String[] args) {
        game();
    }
}
