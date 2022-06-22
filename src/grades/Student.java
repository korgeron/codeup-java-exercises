package grades;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Student {
    private String name;
    private ArrayList<Double> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public String getName() {
        return this.name;

    }

    public void addGrade(double grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
             AtomicReference<Double> t = new AtomicReference<>((double) 0);
         grades.forEach((k) -> {
             t.updateAndGet(v -> ((double) (v + k)));
         });
        return t.get() / grades.size();

//todo: this is same but for() loop
//        double sum = 0;
//        for (double grade : grades) {
//            sum += grade;
//        }
//        return sum / grades.size();
    }

}


