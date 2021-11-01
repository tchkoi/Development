public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    }
    public static boolean isPalindrome (int number){
        if (number < 0) {
           number *= -1;
        }

        int reverse = 0;
        int stored = number;
        while (stored >0){
             int lastDigit = stored % 10;
             reverse = (reverse * 10) + lastDigit;
             stored /= 10;
        }
        if (number == reverse) {
            return true;
        }
        else {
            return false;
        }
    }
}
