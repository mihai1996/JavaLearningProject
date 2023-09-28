package md.tekwillacademy.zooclubservice;

public class Cat extends Animal implements AnimalInterface {

    public Cat(String name) {
        // call the constructor from the parent class
        super(name);
    }

    @Override
    public void makeSound() {
        // override from interface AnimalInterface
        System.out.println("Cat " + getName() + " says Meow!");
    }
    @Override
    public void eat() {
        // override from abstract class Animal
        System.out.println(getName() + " is eating fish.");
    }
}