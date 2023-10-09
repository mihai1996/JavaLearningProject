package md.tekwillacademy.exceptionsservicetask;

public class ArithmeticOperationService {

    public static int divideNoExceptionHandling(int a, int b) {
        int result = a / b;

        return result;
    }

    public static int divideWithExceptionHandling(int a, int b) {

        int result;
        try {
            result = a / b;
            return result;
        }
        catch (ArithmeticException exceptionObj) {

            System.out.println("An exception has occurred: " + exceptionObj.getMessage());
            return 0;
        }
    }
}