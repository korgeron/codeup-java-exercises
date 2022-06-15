import java.util.Scanner;

public class TextGame {


    public static String gameStart() {
        Scanner scanner = new Scanner(System.in);
        String character = null;
        System.out.println("Would you like to start the game? [Y/N]");
        String startGame = scanner.nextLine();
        if (startGame.equalsIgnoreCase("y")) {
            System.out.println("Enter character name: ");
            character = scanner.nextLine();

        } else if (startGame.equalsIgnoreCase("n")) {
            System.out.println("Cya!");
            character = gameStart();
        }
        return character;
    }

    public static String starterArea(String character) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + "\"" + character + "\"" + " to the World of Endvasil! \n... \nEnter the number of where you would like to start!");
        System.out.println("1) Town of New Hope \n2) Dread Lands");
        int startingAt = scanner.nextInt();
        String startArea = null;
        if (startingAt == 1) {
            System.out.println("\"" + character + "\"" + " has arrived to the Town of New Hope!");
            startArea = "town";
        } else if (startingAt == 2) {
            System.out.println("\"" + character + "\"" + " has arrived to the Dread Lands!");
            startArea = "dread";
        }
        return startArea;
    }

    public static int gamePlay() {
        int charHealth = 100;
        int randomizer = (int) (Math.random() * 3) + 1;
        String startArea = starterArea(gameStart());
        if (startArea.equalsIgnoreCase("town")) {
            if (randomizer == 1) {
                System.out.println("one");
            } else if (randomizer == 2) {
                System.out.println("two");
            } else if (randomizer == 3) {
                System.out.println("three");
            }
        } else if (startArea.equalsIgnoreCase("dread")) {
            if (randomizer == 1) {
                System.out.println("one");
            } else if (randomizer == 2) {
                System.out.println("two");
            } else if (randomizer == 3) {
                System.out.println("three");
            }
        }
//        System.out.println("Health: " + charHealth + "%");
        return charHealth;
    }

    public static void main(String[] args) {
        gamePlay();


    }
}
