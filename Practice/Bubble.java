import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        // Scanner inp = new Scanner(System.in);
        int[] a = { 10, 18, 5, 25, 90, 91, 1 };
        for (int i = 0; i <= a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
