package md.tekwillacademy.bookcollectiontask;

public class IntNumberArrayService {

    public static int findMin(int[] arrayTable){

        int min = arrayTable[0];
        for (int i = 1; i < arrayTable.length; i++) {

            if (min > arrayTable[i]){
                min = arrayTable[i];
            }
        }
        return min;
    }

    public static int getAvg(int[] arrayTable) {

        int sum = 0;
        for (int i = 1; i < arrayTable.length; i++) {
            sum += arrayTable[i];
        }
        return sum;
    }
}
