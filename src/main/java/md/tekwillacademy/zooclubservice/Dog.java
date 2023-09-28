package md.tekwillacademy.zooclubservice;

public class Dog extends Animal implements AnimalInterface{

    public Dog(String name) {
        // call the constructor from the parent class
        super(name);
    }

    @Override
    public void makeSound() {
        // override from interface AnimalInterface
        System.out.println("Dog " + getName() + " says: Woof!");
    }

    @Override
    public void eat() {
        // override from abstract class Animal
        System.out.println(getName() + " is eating bones.");
    }
}