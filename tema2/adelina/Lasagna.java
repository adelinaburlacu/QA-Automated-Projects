package tema2.adelina;

public class Lasagna {
    public static void main(String[] args) {

    }
    static int expectedMinutesInOven() {
        int minute = 40;
        System.out.println("Timpul estimat de stat in cuptor este: " + minute);
        return minute;
    }
    static int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;

    }
    static int preparationTimeInMinutes(int layers) {
        return layers *2;
    }

    static int totalTimePreparationInMinutes(int layers, int minutesInOven) {
        return remainingMinutesInOven(minutesInOven) + preparationTimeInMinutes(layers);
    }
}
