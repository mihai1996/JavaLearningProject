package md.tekwillacademy.exceptionsservicetask;

public class TextManager {

    public static int getTextLength(String text) {
        return text.length();
    }

    public static int getTextLengthWithTryCatch(String text) {

        try {
            return text.length();
        }
        catch (NullPointerException exception_task) {

            System.out.println(exception_task.getMessage());
            // exception_task.getStackTrace();
            return  0;
        }
    }

    public static int getTextLengthWithIf(String text) {

        if (text == null) {
            return 0;
        } else {
            return text.length();
        }
    }
}