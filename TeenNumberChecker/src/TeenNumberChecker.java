public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(23, 345, 16));
        System.out.println(isTeen(12));
    }
    public static boolean hasTeen (int firstParameter, int secondParameter, int thirdParameter) {
        if ((firstParameter >= 13 && firstParameter <= 19) ||
                (secondParameter >=13 && secondParameter <=19) ||
                (thirdParameter >=13 && thirdParameter <=19)) {
            return true;
        } else return false;
    }
    public static boolean isTeen (int parameter) {
        if (parameter >= 13 && parameter <=19) {
            return true;
        } else return false;
    }
}
