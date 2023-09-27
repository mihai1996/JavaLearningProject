package md.tekwillacademy.methodstask;

public class Customer {

    private String name;
    private String gen;
    private int age;

    public Customer(String name, String gen, int age){
        this.name = name;
        this.gen = gen;
        this.age = age;
    }

    public void setAge(int age){

        if (age > 127 || age < 1) {
            System.out.println("The customer age is not correct.");

        } else {
            System.out.println(String.format("The customer age is %d ", age));
        }
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    public int getAge(){

        return this.age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", gen='" + gen + '\'' +
                ", age=" + age +
                '}';
    }
}