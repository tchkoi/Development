public class Area {

    public static void main(String[] args) {
        System.out.println(area(7));
        System.out.println(area(3,7));
    }
    public static double area (double radius){
        if (radius <0) {
            return -1;
        } return (radius * radius * Math.PI);
    }

    public static double area (double x, double y){
        if (x<0 || y<0){
            return -1;
        } return (x * y);
    }


}
