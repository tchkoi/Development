public class SpeedConverter {

    public static long toMilesPerHour (double kilometresPerHour) {

        if (kilometresPerHour < 0 ) {
            return -1;
        }

        return Math.round(kilometresPerHour / 1.609);
    }

    public static void printConversion (double kilometresPerHour) {

        if (kilometresPerHour < 0) {
            System.out.println("Invalid value");
        }   else {
            long milesPerHour = toMilesPerHour(kilometresPerHour);
            System.out.println(kilometresPerHour + " km/h = " +
                    milesPerHour + " mi/h");
        }
    }
}
