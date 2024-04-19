import java.util.Arrays;
import java.util.Scanner;

public class Revarray {
    public static void main(String[] args) {

        // int arr[] = new int[5];
        // Scanner inp = new Scanner(System.in);
        // System.out.println("Entre elements");
        // for (int i = 0; i <= arr.length - 1; i++) {
        // arr[i] = inp.nextInt();
        // }
        // System.out.println("Reverse array is");
        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.println(arr[i]);
        // }

        int[] arr = { 1, 2, 3, 4, 5 };
        reverseArray(arr);

        System.out.println("Revserse array is " + Arrays.toString(arr));
    }

    static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
}