package md.tekwillacademy.zooclubservice;

public class ZooService {

    public static void main(String[] args) {

        // polymorphism create an object Animal with children's constructor
        Animal dog = new Dog("Grivei"); // in this case you can not call the method makeSound() because the object
                                              // dog is declared in the Interface. Solution for this problem is:
                                              // the Interface should be implemented of the abstract class Animal.

        // dog.makeSound(); // was tested
        dog.eat();

        Cat cat = new Cat("Murzic");
        Dog dog2 = new Dog("Spike");

        System.out.println("\n");

        cat.makeSound();
        cat.eat();

        System.out.println("\n");

        dog2.makeSound();
        dog2.eat();

    }
}