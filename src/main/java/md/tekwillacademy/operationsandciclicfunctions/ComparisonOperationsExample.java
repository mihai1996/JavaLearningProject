package md.tekwillacademy.operationsandciclicfunctions;

public class ComparisonOperationsExample {

    public static void main(String[] args) {

        int num1 = 32;
        int num2 =  10;

        // is equal
        boolean isEqual = num1 == num2;
        System.out.println("Is equal with: " + isEqual);

        // is greater than
        boolean isGreaterThan = num1 > num2;
        System.out.println("Is greater than: " + isGreaterThan);

        // is less than
        boolean isLessThan = num1 < num2;
        System.out.println("Is less than: " + isLessThan);

        // is greater than or equal
        boolean isGreaterThanOrEqual = num1 >= num2;
        System.out.println("Is greater than or equal: " + isGreaterThanOrEqual);

        // is less than or equal
        boolean isLessThanOrEqual = num1 <= num2;
        System.out.println("Is less than or equal: " + isLessThanOrEqual);

        // is not equal
        boolean isNotEqual = num1 != num2;
        System.out.println("Is not equal: " + isNotEqual);
    }
}
