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
        System.out.println("Welcome " + "\"" + character + "\"" + " to the World of Endrasil! \n... \nEnter the number of where you would like to start!");
        System.out.println("1) Town of New Hope \n2) Dread Lands");
        int startingAt = scanner.nextInt();
        String startArea = null;
        if (startingAt == 1) {
            System.out.println("\"" + character + "\"" + " has arrived to the Town of New Hope!\n...");
            startArea = "town";
        } else if (startingAt == 2) {
            System.out.println("\"" + character + "\"" + " has arrived to the Dread Lands!\n...");
            startArea = "dread";
        }
        return startArea;
    }


    public static int gamePlay() {
        Scanner scanner = new Scanner(System.in);
        int charHealth = 100;
        int randomizer = (int) (Math.random() * 1) + 1;
        String startArea = starterArea(gameStart());
        if (startArea.equalsIgnoreCase("town")) {
            if (randomizer == 1) {
                System.out.println("Walter: Help me!! A .. A.. GOBLIN!!\n...");
                System.out.println("Attack by choosing a number between 1 and 2");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("You thrust your rusty sword into the goblins neck!\n...");
                    System.out.println("Walter: Thank you hero! YOU SAVED ME!\n...");
                    System.out.println("Walter: Please please! Come to my house for dinner.\n...");
                    System.out.println("Choose 1 to follow Walter");
                    System.out.println("Choose 2 to explore the rest of the town");
                    int choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        System.out.println("You arrive to Walters house\n...");
                        System.out.println("Walter: Im sorry for this hero...\n...\nWalter: You will be my dinner!");
                        System.out.println("Walter stabs you in the shoulder\n...\nYou take 20 damage!");
                        charHealth -= 20;
                        System.out.println("Health: " + charHealth + "%");
                        System.out.println("Hero: What the hell Walter!\n...\nYou go to attack!\n...");
                        int random = (int) (Math.random() * 5) + 1;
                        System.out.println("Choose a number between 1 and 5 to attack");
                        while(true) {
                            int attackChoice = scanner.nextInt();

                            if (attackChoice == random) {
                                System.out.println("Walter is dead!");
                                break;
                            } else {
                                System.out.println("Walter's sword connects\n...\nYou take 30 damage!");
                                charHealth -= 30;
                                System.out.println("Health: " + charHealth + "%");

                            }
                            if (charHealth <= 0){
                                charHealth = 0;
                                break;
                            }
                        }
                        if (charHealth > 0) {
                            System.out.println("Hero: Damn it Walter... That was a close one!\n...");
                        }

                    } else if (choice2 == 2) {
                        int random = (int) (Math.random() * 7) + 1;
                        System.out.println("You arrive to the town square\n...");
                        System.out.println("Hero: Hmm.. something is off\n...\nWhere is everyone!\n...");
                        System.out.println(" * laughing in the distance *");
                        System.out.println("Walter: You really should have come with me...NOW DIE!");
                        System.out.println("Choose a number between 1 and 7 to attack");
                        while(true) {
                            int attackChoice = scanner.nextInt();

                            if (attackChoice == random) {
                                System.out.println("Walter is dead!");
                                break;
                            } else {
                                System.out.println("Walter connects with his sword\n...\nYou take 40 damage!");
                                charHealth -= 40;
                                System.out.println("Health: " + charHealth + "%");

                            }
                            if (charHealth <= 0){
                                charHealth = 0;
                                break;
                            }
                        }

                    } else {
                        System.out.println("Listen to directions!\n...");
                        charHealth = 0;
                    }
                } else if (choice == 2) {
                    int random = (int) (Math.random() * 7) + 1;
                    System.out.println("The goblin knocks you out!\n...");
                    charHealth -= 20;
                    System.out.println("Health: " + charHealth + "%");
                    System.out.println(" * waking up *");
                    System.out.println("Hero: W.. Walter?\n...\nARE YOU TRYING TO EAT ME!");
                    System.out.println("Choose a number between 1 and 7 to attack");
                    while(true) {
                        int attackChoice = scanner.nextInt();

                        if (attackChoice == random) {
                            System.out.println("Walter is dead!");
                            break;
                        } else {
                            System.out.println("Walter slices you up!\n...\nYou take 40 damage!");
                            charHealth -= 40;
                            System.out.println("Health: " + charHealth + "%");

                        }
                        if (charHealth <= 0){
                            charHealth = 0;
                            break;
                        }
                    }

                } else {
                    System.out.println("Listen to directions!\n...");
                    charHealth = 0;
                }
            } else if (randomizer == 2) {
                System.out.println("You journey to the inn looking for work");
            } else if (randomizer == 3) {
                System.out.println("You head to the town square");
            }
        } else if (startArea.equalsIgnoreCase("dread")) {
            if (randomizer == 1) {
                System.out.println("Purchase DLC");
            } else if (randomizer == 2) {
                System.out.println("Purchase DLC");
            } else if (randomizer == 3) {
                System.out.println("Purchase DLC");
            }
        }

        if (charHealth <= 0) {
            System.out.println("YOU DIED!");
        }
        return charHealth;
    }

    public static void main(String[] args) {
        gamePlay();


    }
}
