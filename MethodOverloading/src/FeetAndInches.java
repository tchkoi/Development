public class FeetAndInches {
    public static void main(String[] args) {
        double centimeter = calcFeetAndInchesToCentimeters(7, 13);
        if (centimeter < 0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(157);
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("You got error");
            return -1;
        }
        double centimeter = (feet * 12) * 2.54;
        centimeter += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeter + " cm ");
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + "feet and " + remainingInches + " inches ");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}