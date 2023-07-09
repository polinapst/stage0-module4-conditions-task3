package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month < 1 || month > 12) {
            System.out.println("wrong number!");
        } else if (month > 11 || month < 3) {
            System.out.println("Winter");
        } else if (month > 8) {
            System.out.println("Autumn");
        } else if (month > 5) {
            System.out.println("Summer");
        } else {
            System.out.println("Spring");
        }
    }
}
