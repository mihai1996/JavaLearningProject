package md.tekwillacademy.operationsandciclicfunctions;

public class ArithmeticOperationExample {

    public static void main(String[] args) {

        int num1 = 42;
        int num2 = 10;

        // Sum
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("\n");

        // Subtraction
        int sub = num1 - num2;
        System.out.println("Result: " + sub);
        System.out.println("\n");

        // Multiplication
        int result = num1 * num2;
        System.out.println("Result: " + result);
        System.out.println("\n");

        // Division
        result = num1 / num2;
        System.out.println("Result: " + result);
        System.out.println("\n");

        // The rest of the division or division with remainder
        result = num1 % num2;
        System.out.println("Result: " + result);
        System.out.println("\n");

        // Subtraction that return a negative digit
        result = num2 - num1;
        System.out.println("Result: " + result);
    }
}