public class MaxArray {
    public static void main(String[] args) {
        int arr[] = { 23, 25, 125, 19, 99, 11 , 9};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(" max value is " + max);
        System.out.println("Min Value is " + min);
    }
}
