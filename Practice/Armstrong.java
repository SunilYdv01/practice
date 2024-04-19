import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num");
        int num = inp.nextInt();
        int arm = 0;
        int rem;
        int c = num;
        while (num > 0) {
            rem = num % 10;
            arm = (rem * rem * rem) + arm;
            num = num / 10;
        }

        if (c == arm) {
            System.out.println("Aermstrong num");
        } else {
            System.out.println("Not");
        }
    }
}