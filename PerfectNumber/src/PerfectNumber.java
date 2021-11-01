public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
    public static boolean isPerfectNumber (int number) {
        if (number < 0) {
            return false;
        }
        int factor = 0;
        int sum = 0;
        while (factor < number) {
            factor ++;
            if (factor==number)
            {
                break;}
            if (number % factor == 0) {
                sum += factor;
            } if (sum == number) {
                return true;
            }
        } return false;
    }
}
