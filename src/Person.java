public class Person {
    private String name;

    public String getName(){
        return this.name;
    }

    public String setName(String name){
        return this.name = name;
    }

    public String sayHello(){
        return String.format("Hello my name is %s", getName());
    }


public static void main(String[]args){
Person jack = new Person();
jack.setName("Jack");
    System.out.println(jack.getName());
    System.out.println(jack.sayHello());

        }
};
