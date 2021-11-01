public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12562));
    }
    public static int getEvenDigitSum (int number) {
        if (number <0) {
            return -1;
        }
        int sum =0;
        int remainder = 0;
        while (number >0) {
            if (number % 2 == 0) {
                remainder = number % 10;
                sum += remainder;
            }
            number /= 10;
        }
        return sum;
    }
}
