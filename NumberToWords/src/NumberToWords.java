public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int count = getDigitCount(number);
        number = reverse(number);

        while (count > 0) {
            int digit = number % 10;
            if (digit == 0) {
                System.out.print("Zero ");
            } else if (digit == 1) {
                System.out.print("One ");
            } else if (digit == 2) {
                System.out.print("Two ");
            } else if (digit == 3) {
                System.out.print("Three ");
            } else if (digit == 4) {
                System.out.print("Four ");
            } else if (digit == 5) {
                System.out.print("Five ");
            } else if (digit == 6) {
                System.out.print("Six ");
            } else if (digit == 7) {
                System.out.print("Seven ");
            } else if (digit == 8) {
                System.out.print("Eight ");
            } else if (digit == 9) {
                System.out.print("Nine ");
            }
            number /= 10;
            count --;
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number != 0);
        return count;
    }
}
