package md.tekwillacademy.operationsandciclicfunctions;

public class AssignmentOperationsExample {

    public static void main(String[] args) {

        int num1 = 32;
        int num2 = 10;

        // Atribuire simpla
        int result = num1;
        System.out.println("Atribuire simpla: " + result);

        // Atribuiere cu adunare
        result += num2; // long form: result = result + num2
        System.out.println("Atribuire cu adunare: " + result);

        // Atribuire cu scadere
        result -= num2;
        System.out.println("Atribuire cu scadere: " + result);

        // Atribuire cu inmultire
        result *= num2;
        System.out.println("Atribuire cu inmultire: " + result);

        // Atribuire cu impartire
        result /= num2;
        System.out.println("Atribuire cu impartire: " + result);

        // Atribuire cu restul impartirii
        result %= num2;
        System.out.println("Atribuire cu restul impartirii: " + result);
    }
}