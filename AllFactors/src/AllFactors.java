public class AllFactors {
    public static void main(String[] args) {
        System.out.println(printFactors(14));
    }

    public static String printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int factor = 0;
            while (factor <= number) {
                factor ++;
                if (number % factor == 0){
                    System.out.println(factor + "");
                }
        } return "";
    }
}
