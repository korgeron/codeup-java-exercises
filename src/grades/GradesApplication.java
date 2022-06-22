package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GradesApplication {
    public static void main(String[] args) {

        //todo: Created a map
        HashMap<String, Student> students = new HashMap<>();

        //todo: creating 4 student objects with 3 grades
        Student bill = new Student("Bill");
        bill.addGrade(50);
        bill.addGrade(87);
        bill.addGrade(43);
        Student jill = new Student("Jill");
        jill.addGrade(95);
        jill.addGrade(93);
        jill.addGrade(90);
        Student will = new Student("Will");
        will.addGrade(75);
        will.addGrade(83);
        will.addGrade(72);
        Student imposter = new Student("Phil");
        imposter.addGrade(100);
        imposter.addGrade(100);
        imposter.addGrade(100);

        //todo: add Github username and Student object to map
        students.put("billagus", bill);
        students.put("jillagus", jill);
        students.put("willagus", will);
        students.put("philagus", imposter);
        System.out.println();

        //todo: add user interaction to see students grades based on github handle
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;
        //THESE NULL VARIABLES ARE FOR STORING DATA FROM A LOOP
        String student = null;
        String username = null;
        Double gradeAvg = null;

            System.out.println("Welcome!");
        while (keepGoing){
            System.out.println("Here are the GitHub usernames of our students:");
            System.out.println("---------------------------------------------------");
            students.keySet().forEach((k) -> {
                System.out.printf("| %s | ",k);
            });
            System.out.println("\n---------------------------------------------------");
            System.out.println("\nWhat student would you like to see more information on?");
            String answer1 = scanner.nextLine();
            for (Map.Entry<String, Student> entry : students.entrySet()) {
                String k = entry.getKey();
                Student v = entry.getValue();
                if (answer1.contains(k)){
                    student = v.getName();
                    username = k;
                    gradeAvg = v.getGradeAverage();
                }
            }

            if (student == null){
                System.err.printf("Sorry, no student found with the GitHub username of \"%s\".%n %n", answer1);
            } else {
                System.out.printf("Name: %s - Github Username: %s %nCurrent Average: %.2f%n %n", student, username, gradeAvg);
            }

            System.out.println("Would you like to see another student? [Y/N]");
            String answer2 = scanner.nextLine();
            if (answer2.equalsIgnoreCase("n")){
                System.out.println("Goodbye, and have a wonderful day!");
                keepGoing = false;
            }
            if (answer2.equalsIgnoreCase("y")){
                System.out.println("GREAT!");
                student = null;
                username = null;
                gradeAvg = null;
            }
        }
    }
}
