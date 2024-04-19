import java.util.Scanner;

public class fibanocci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num");
        int num = inp.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;
        for (int i = 1; i <= num; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }

    }
}
