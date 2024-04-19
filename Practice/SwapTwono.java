import java.util.Scanner;

public class SwapTwono {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = inp.nextInt();
        System.out.println("Enter num 2");
        int num2 = inp.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("swap is number 1 = " + num1 + "  swap of num2 is = " + num2);
    }
}
