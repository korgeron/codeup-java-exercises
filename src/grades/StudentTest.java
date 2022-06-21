package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student bill = new Student("Bill");
        System.out.println(bill.getName());
        bill.addGrade(99);
        bill.addGrade(65);
        bill.addGrade(90);
        System.out.println(bill.getGrades());
        System.out.printf("%s's average grade is a %.2f%%%n", bill.getName(), bill.getGradeAverage()); // 254 / 3 = 84.67
    }
}
