package md.tekwillacademy.classesandobjects;

import md.tekwillacademy.classesandobjects.autoservicetask.Car;
import md.tekwillacademy.classesandobjects.autoservicetask.Garage;
import md.tekwillacademy.classesandobjects.autoservicetask.Person;
import md.tekwillacademy.classesandobjects.autoservicetask.Worker;

public class ManageAutoService {

    public static void main(String[] args) {

        // Garage objects
        Garage autoPlusGarage = new Garage();

        autoPlusGarage.address = "Mesterul Manole 5B";
        autoPlusGarage.surfaceM2 = 120.5f;
        autoPlusGarage.capacity = 10;

        System.out.println(String.format("The garage %s has the next properties", autoPlusGarage.address) + "\t" +
                "cm^2: " + autoPlusGarage.surfaceM2 + "\t" + "free spaces: " + autoPlusGarage.capacity);

        // update the capacity of the garage
        autoPlusGarage.capacity = 20;

        System.out.println(String.format("The garage %s has the next properties", autoPlusGarage.address) + "\t" +
                "cm^2: " + autoPlusGarage.surfaceM2 + "\t" + "free spaces: " + autoPlusGarage.capacity);

        Garage gasMonkeyTeam = new Garage();

        gasMonkeyTeam.address = "2330 Merrell Rd Dallas TX 75229";
        gasMonkeyTeam.surfaceM2 = 300.0f;
        gasMonkeyTeam.capacity = 50;

        System.out.println(String.format("The garage %s has the next properties", gasMonkeyTeam.address) + "\t" +
                "cm^2: " + gasMonkeyTeam.surfaceM2 + "\t" + "free spaces: " + gasMonkeyTeam.capacity);
        System.out.println("\n");

        // Worker object
        Worker employee1 = new Worker();
        employee1.name = "Alina";
        employee1.age = 26;

        System.out.println(String.format("The employee's name is %s and she is %d old year.", employee1.name,
                                                                                          employee1.age));

        Worker employee2 = new Worker();
        employee2.name = "Frederico";
        employee2.age = 50;

        System.out.println(String.format("The employee's name is %s and He is %d old year.", employee2.name,
                employee2.age));

        // person object
        Person client1 = new Person("Mihai", "+37379906900");

        // car object
        Car skodaSuperb = new Car("A123CEH19962013", "Skoda Superb", client1);

        Car teslaModel3 = new Car("T432432ES344LA12", "Tesla Model 3", new Person("Stas",
                                                                      "+37360223344"));

        System.out.println("\n");
        System.out.println("The car's mark is " + skodaSuperb.mark + " and his owner is " + skodaSuperb.owner.name +
                           "\t" + "Phone number: " + skodaSuperb.owner.phoneNumber);
        System.out.println("\n");
        System.out.println("The car's mark is " + teslaModel3.mark + " and his owner is " + teslaModel3.owner.name +
                           "\t" + "Phone number: " + teslaModel3.owner.phoneNumber);

    }
}
