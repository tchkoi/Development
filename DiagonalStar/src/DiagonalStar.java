public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                if (row == column || column == number - row - 1 || row == 0 || column == 0 || row == number - 1 || column == number - 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        printSquareStar(21);
    }
}
