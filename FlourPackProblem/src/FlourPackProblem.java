public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
    }
    public static boolean canPack (int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal <0) {
            return false;
        }
        int bigOne = bigCount * 5;
        for (int j = 0; j<= bigOne; j+=5)
        for (int i = 0; i <= smallCount; i++){
            if (j+ i == goal) {
                return true;
            }
        }
            return false;
    }
}
