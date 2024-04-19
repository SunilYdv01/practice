import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter two num");
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int g = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                g = i;
            }
        }
        System.out.println("Gcd is = " + g);
    }
}
