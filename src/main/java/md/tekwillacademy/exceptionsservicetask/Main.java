package md.tekwillacademy.exceptionsservicetask;

public class Main {

    public static void main(String[] args) {

        String controlVariable = null;
        System.out.println("The text length is: " + TextManager.getTextLength(controlVariable));
        System.out.println("The text length is: " + TextManager.getTextLengthWithTryCatch(controlVariable));
        System.out.println("The text length is: " + TextManager.getTextLengthWithIf(controlVariable));
        System.out.println("The result is: " + ArithmeticOperationService.divideNoExceptionHandling(20, 0));
        System.out.println("The result is: " + ArithmeticOperationService.divideWithExceptionHandling(20, 0));
    }
}