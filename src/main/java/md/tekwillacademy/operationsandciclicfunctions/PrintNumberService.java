package md.tekwillacademy.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int a = 101;
        int limit = 101;

        // while loop decrement [a = 0]
        while (a > 0){
            System.out.println(a + ", ");
            a--;
        }

        System.out.println();

        do {
            System.out.println(a + ", ");
            a++;
        } while (a < limit);

        System.out.println();

        for (int i = 1; i <= limit; i++) {
            System.out.println(i + ", ");
        }

        System.out.println();

        // print even numbers
        for (int i = 1; i <= limit; i++) {
            if ((i % 2) == 0) {
                System.out.println(i + ", ");
            } else {
                System.out.println("[], ");
            }
        }

        // print odd numbers
        for (int i = 1; i <= limit; i++) {
            if ((i % 2) == 1) {
                System.out.println(i + ", ");
            } else {
                System.out.println("[], ");
            }
        }
    }
}
