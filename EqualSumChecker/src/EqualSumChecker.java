public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,2,3));
    }
    public static boolean hasEqualSum (int firstParameter, int secondParameter, int thirdParameter ){
        if (firstParameter + secondParameter == thirdParameter) {
            return  true;
        } else return false;
    }
}
