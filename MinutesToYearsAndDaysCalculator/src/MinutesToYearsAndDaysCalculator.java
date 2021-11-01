public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(21423523);
    }
    public static void printYearsAndDays (long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long hours = minutes / 60;
        long day = hours / 24;
        long year = day / 365 ;
        long remainingDay = day % 365;
        System.out.println(minutes + " min = " + year + " y and " + remainingDay + " d " );
    }
}
