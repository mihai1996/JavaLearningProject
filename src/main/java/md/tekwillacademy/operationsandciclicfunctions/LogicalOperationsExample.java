package md.tekwillacademy.operationsandciclicfunctions;

public class LogicalOperationsExample {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        // operator AND
        boolean result = a && b; // false
        System.out.println("Logic and " + result);

        a = result && b; // false
        System.out.println("Logic and: " + a);

        // operator OR
        // a = true;
        result = a || b; // false
        System.out.println("Logic or: " + result);

        // negation
        System.out.println("Negation: " + !result); // true
    }
}