package tema2.adelina;

public class BirdsLoopsBonus {
    public static void main(String[] args) {

        final int[] pasariPeSaptamana = {0, 2, 5, 3, 7, 8, 4};
        System.out.println(getToday(pasariPeSaptamana));
        getLastWeek(pasariPeSaptamana);
        System.out.println(incrementTodayCount(pasariPeSaptamana));
        System.out.println(hasDayWithoutBirds(pasariPeSaptamana));
        System.out.println(getCountForFirstDay(pasariPeSaptamana, 4));
        System.out.println("Numer of busy days = " + getBusyDays(pasariPeSaptamana));


    }

    static int getBusyDays(int[] array) {
        int busyDays = 0;
        for (int i = 0; i < array.length-1; i++ ) {
            if (array[i] >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
    static int getCountForFirstDay(int[] array, int days) {
        int sum = 0;
        for (int i =0; i < days; i++) {
            sum += array[i];
        }
        return sum;
    }
    static void getLastWeek(int[] array) {
        for(int i = 0; i < array.length-1; i++ ) {
            System.out.println(array[i]);
        }
    }
    static int  getToday(int[] array) {
        return array[array.length-1];
    }

    static int incrementTodayCount(int[] array) {
        int todayIncrement = array[array.length-1] + 1;
        return todayIncrement;
        //return array[array.length-1];
    }
    static boolean hasDayWithoutBirds(int[] array) {
        for (int i =0; i < array.length-1; i++) {
            if (array[i] == 0) {

            }
        }
        return true;
    }
}
