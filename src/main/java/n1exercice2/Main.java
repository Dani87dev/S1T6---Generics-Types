package n1exercice2;

public class Main {

    public static void main (String [] args) {

        Person person1 = new Person("Dani", "Vila", 38);
        String city = "Barcelona";
        int hellNumber = 666;

        GenericMethods.printElements(city, hellNumber, person1);

    }
}
