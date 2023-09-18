package md.tekwillacademy.classesandobjects.autoservicetask;

public class Car {

    public String vinCode;
    public String mark;

    public Person owner;

    public Car(String vinCode, String mark, Person owner){

        this.vinCode = vinCode;
        this.mark = mark;
        this.owner = owner;
        System.out.println("Now there is a car in the service of type " + mark);
    }
}
