package lambdas;

import java.util.List;

public class Main {

    public static void main(String[]args){
        Person.printPersons(Person.createRoster(), new CheckPersonEligibleForSelectiveService());
        System.out.println("Pull test");
    }
}
