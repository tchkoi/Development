public class SecondsAndMinutes {
    private static final String Invalid_Value_Message = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(213,33));
        System.out.println(getDurationString(3712));
        System.out.println(getDurationString(-54));
        System.out.println(getDurationString(65,8));
    }
    public static String getDurationString (long minutes, long seconds){
        if ((minutes <0) || (seconds <0) || (seconds > 59)) {
            return Invalid_Value_Message;
        }
        long hours = minutes /60;
        long remainingMinutes = minutes % 60;

        String hourString = hours + "h ";
        if (hours < 10) {
            hourString = "0" + hourString;
        }

        String minuteString = remainingMinutes + "m ";
        if (remainingMinutes < 10) {
            minuteString = "0" + minuteString;
        }

        String secondsString = seconds + "s ";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hourString + " " + minuteString + " " + secondsString ;

    }
    public static String getDurationString (long seconds) {
        if (seconds <0) {
            return Invalid_Value_Message;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }


}
