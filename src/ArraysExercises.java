import java.util.Arrays;
public class ArraysExercises {

    public static Person[] addPerson(Person[] persons, Person newPerson) {
        Person[] newPersonArr = Arrays.copyOf(persons, persons.length + 1);
        newPersonArr[persons.length] = newPerson;
        return newPersonArr;
    }



    public static void main(String[] args) {
        Person[] personArr = new Person[3];
        Arrays.fill(personArr, new Person("Bob"));
        for (int i = 0; i < personArr.length; i++) {
            System.out.println(personArr[i].getName());
        }
        System.out.println("---------------------------------");
        personArr = addPerson(personArr, new Person("Jack"));

        for(int j = 0; j < personArr.length; j++){
            System.out.println(personArr[j].getName());
        }


    }


}
