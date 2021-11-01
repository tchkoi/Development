public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(86,23));
    }
    public static boolean hasSharedDigit (int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }
        if ((a/10 == b/10) || (a/10 == b%10) || (a%10 == b/10) || (a%10 == b%10)) {
            return true;
        }
        return false;
    }
}
