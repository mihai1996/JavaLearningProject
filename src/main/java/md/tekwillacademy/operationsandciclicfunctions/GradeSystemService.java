package md.tekwillacademy.operationsandciclicfunctions;

public class GradeSystemService {

    public static void main(String[] args) {

        int testResult = 69;

        if (testResult >= 90) {
            System.out.println("Grade A");
        } else if (testResult >= 80) {
            System.out.println("Grade B");
        } else if (testResult >= 70) {
            System.out.println("Grade C");
        } else if (testResult >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Sorry, you have a low grade. Try again.");
        }
        System.out.println("Finish of the program");
    }
}
