package md.tekwillacademy.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    private static Random objOfRandomClass = new Random();

    public static int getRandomInt(int min, int max) {

        int delta = max - min;

        int randomIntForThisDelta = objOfRandomClass.nextInt(delta);

        if (delta >= 0) {
            System.out.println("The delta has to be positive.");
        }

        if (randomIntForThisDelta >= min && randomIntForThisDelta <= max) {
            System.out.println(String.format("The random value is in the range %d - %d ", min, max));
        } else {
            System.out.println("The value is out of the range.");
        }

        return randomIntForThisDelta;
    }

    public static int getRandomInt(int value) {

        return  objOfRandomClass.nextInt(value);
    }

    public static double getRandomDouble() {

        return  objOfRandomClass.nextDouble();
    }

    public static boolean getRandomBoolean() {

        return  objOfRandomClass.nextBoolean();
    }

    public static String getEmail(String domain) {

        String uuid = UUID.randomUUID().toString();


        return  uuid + "\t" + domain;
    }

    public static  String getRandomString(int length) {

        String acceptedChars = "ABCDEFGHLMNabcdefghlmn0123456789";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In iteratia: i = " + i + " caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }

}