import java.util.Scanner;

public class inp {

    public static void main(String[] args) {
        final int s = 7;
        int[] a = new int[s];
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < s; i++) {
            System.out.print("" + (i + 1) + " :");
            a[i] = inp.nextInt();
            System.out.println("");
        }

    }
}
