package md.tekwillacademy.methodstask;

public class ExecutionService {

    public static void main(String[] args) {

        System.out.println(DataGeneratorUtil.getRandomInt(10, 30));
        System.out.println(DataGeneratorUtil.getRandomInt(20));
        System.out.println(DataGeneratorUtil.getRandomDouble());
        System.out.println(DataGeneratorUtil.getRandomBoolean());
        System.out.println(DataGeneratorUtil.getEmail("mihai.lascu@mail.ru"));

        Customer customer1 = new Customer("Ion", "male", 42);
        String c1 = customer1.toString();
        System.out.println(c1);
        customer1.setAge(35);
        System.out.println(customer1.toString());
        customer1.setName("Iuretz");
        System.out.println(customer1.toString());
        System.out.println(String.format("Virsta lui %s este %d ani", customer1.getName(), customer1.getAge()));
        System.out.println(DataGeneratorUtil.getRandomString(4));



    }
}