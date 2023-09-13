package md.tekwillacademy.variablesprogramme;

public class VariablesAndCommands {
    public static void main(String[] args) {
        // Declare the variables
        // bool related
        boolean isUsed;
        boolean hasBattery;
        boolean isAndroid;
        boolean isStolen;
        boolean isBlocked;
        boolean isCharged;

        // char related
        char condition;

        // numeric related
        byte numberOfSimCards;
        byte randomAccessMemory;
        short productionYear;
        int numOfOwners;
        long product_id;
        float operatingSystemVersion;
        double price;

        isUsed = true;
        hasBattery = true;
        isAndroid = true;
        isStolen = false;
        isBlocked = false;
        isCharged = true;

        condition = 'A';

        numberOfSimCards = 4;
        randomAccessMemory = 6;
        productionYear = 2060;
        numOfOwners = 0;
        product_id = 432423432534L;
        operatingSystemVersion = 13.69f;
        price = 29999.9f;

        System.out.println("The phone is charged " + isCharged);
        System.out.println("The phone price is: " + price);


    }
}
