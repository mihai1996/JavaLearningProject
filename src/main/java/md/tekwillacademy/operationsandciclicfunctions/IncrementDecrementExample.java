package md.tekwillacademy.operationsandciclicfunctions;

public class IncrementDecrementExample {

    public static void main(String[] args) {

        int num1 = 42;

        // Incrementation
        num1++; // 43
        System.out.println("The value after incrementation: " + num1);

        // pre-incrementation
        ++num1; // 44

        int num2 = ++num1; // 45
        int temp = num1; // 45
        int num3 = num1++; // 45
        System.out.println("The value after pre-incrementation: " + num1);
        System.out.println("Show num2 = " + num2 + " temp = " + temp + " num3 = " + num3 + " temp2 = " + num1);

        // decrement
        num1--; // 45
        System.out.println("The value after decrement: " + num1);

        // pre-decrement
        --num1; // 44
        System.out.println("The value after pre-decrement: " + num1);
    }
}