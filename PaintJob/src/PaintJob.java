public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(2.1,3,2));
    }
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <=0 || areaPerBucket <= 0 || extraBuckets <0) {
            return -1;
        }

        double neededBucketsd = (width*height) / areaPerBucket ;
        int neededBuckets = (int) ((width*height) / areaPerBucket);
        if (neededBuckets != neededBucketsd) {
            neededBuckets ++;
        }
        return neededBuckets - extraBuckets;

    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <=0 || areaPerBucket <= 0) {
            return -1;
        }
        int extraBuckets = 0;
        double neededBucketsd = (width*height) / areaPerBucket ;
        int neededBuckets = (int) ((width*height) / areaPerBucket);
        if (neededBuckets != neededBucketsd) {
            neededBuckets ++;
        }
        return neededBuckets - extraBuckets;
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int extraBuckets = 0;
        double neededBucketsd = area / areaPerBucket;
        int neededBuckets = (int) (area / areaPerBucket);
        if (neededBuckets != neededBucketsd) {
            neededBuckets ++;
        }
        return neededBuckets - extraBuckets;
    }

}
