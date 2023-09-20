package md.tekwillacademy.accessmodifiers;

import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {

    public static void main(String[] args) {

        // constructor without parameters [Person 1]
        Person ezaura = new Person();
        ezaura.isRetired = true;
        ezaura.checkIfPersonIsRetired(); // the name attribute is null because it was not declared

        System.out.println("\n");

        // constructor with 4 parameters [Person 2]
        Person anabela = new Person("Anabela Kalaba", (byte)24, "Female", true);
        anabela.checkIfPersonIsRetired();

        System.out.println("\n");

        // constructor with 6 parameters [Person 3]
        Person hercules = new Person(1234567899876L, "Hercules Moldovan", (byte) 45, "Male", "Married", false);
        hercules.checkIfPersonIsRetired();

        System.out.println("\n");

        // constructor with 6 parameters [Person 4]
        Person hunter = new Person(1234567899696L, "Bidon Hunter", (byte) 65, "Male", "Married", true);
        hunter.checkIfPersonIsRetired();

        System.out.println("\n");

        // constructor with 6 parameters [Person 5]
        Person anjela = new Person(1234567899696L, "Anjela Merkel", (byte) 75, "Female", "Married", true);
        anjela.checkIfPersonIsRetired();
    }
}
