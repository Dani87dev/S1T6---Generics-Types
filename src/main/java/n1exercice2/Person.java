package n1exercice2;


public class Person {

    private String name = "";
    private String surname = "";
    private int age = 0;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " +name + " " +surname+ ", "+ age+ " years old.";
    }
}
