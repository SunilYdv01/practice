import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num");
        int num = inp.nextInt();
        int temp = 0;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                temp = temp + 1;
            }

        }
        if (temp > 0) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }
    }
}
