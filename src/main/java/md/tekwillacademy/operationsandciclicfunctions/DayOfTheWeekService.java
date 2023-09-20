package md.tekwillacademy.operationsandciclicfunctions;

public class DayOfTheWeekService {

    public static void main(String[] args) {

        int dayNumber = 5;
        String dayName;

        switch (dayNumber){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "day";
                System.out.println("This day is not defined.");
        }

        System.out.println("Day's number " + dayNumber + " is " + dayName);

    }
}