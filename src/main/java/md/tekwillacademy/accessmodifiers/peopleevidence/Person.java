package md.tekwillacademy.accessmodifiers.peopleevidence;

public class Person {

    // private instance
    private long idnp;

    // default instance
    String maritalStatus;

    // protected instance
    protected String name;

    protected byte age;

    // public instance
    public String gender;
    public boolean isRetired;

    public Person(){
        System.out.println("This is a defined constructor without params.");
    }

    public Person(String name, byte age, String gender, boolean isRetired){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isRetired = isRetired;
        System.out.println("This is a defined constructor with 4 params.");
    }

    public Person(long idnp, String name, byte age, String gender, String maritalStatus, boolean isRetired){

        this.idnp = idnp;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.isRetired = isRetired;
    }

    public void checkIfPersonIsRetired(){
        // check if the person is retired or not

        if (isRetired){
            System.out.println(String.format("%s is retired.", name));
        } else {
            System.out.println(String.format("%s is not retired.", name));
        }
    }
}
