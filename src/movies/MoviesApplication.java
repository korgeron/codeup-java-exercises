package movies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MoviesApplication {
    public static void main(String[] args) {

        Movie[] movies =  MoviesArray.findAll();

        Scanner scanner = new Scanner(System.in);
        boolean decision = true;
        while (decision){
            System.err.println("0: Exit\n1: View \"all\" movies\n2: view movies in the \"animated\" category\n3: view movies in the \"drama\" category\n4: view movies in the \"horror\" category\n5: view movies in the \"scifi\" category");
           int choice = scanner.nextInt();
            if (choice == 0){
                System.out.println("Cya then");
                decision = false;
            }
            if (choice == 1){
                for (int i = 0; i < movies.length; i++) {
                    System.out.println((i + 1) + ": " + movies[i].getName() + " - " + movies[i].getCategory());
                }
            }
            if (choice == 2){
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equalsIgnoreCase( "animated")){
                        System.out.println((i + 1) + ": " + movies[i].getName() + " - " + movies[i].getCategory());
                    }
                }
            }
            if (choice == 3) {
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equalsIgnoreCase( "drama")){
                        System.out.println((i + 1) + ": " + movies[i].getName() + " - " + movies[i].getCategory());
                    }
                }
            }
            if (choice == 4){
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equalsIgnoreCase( "horror")){
                        System.out.println((i + 1) + ": " + movies[i].getName() + " - " + movies[i].getCategory());
                    }
                }
            }
            if (choice == 5){
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equalsIgnoreCase( "scifi")){
                        System.out.println((i + 1) + ": " + movies[i].getName() + " - " + movies[i].getCategory());
                    }
                }
            }
        }


    }
}
