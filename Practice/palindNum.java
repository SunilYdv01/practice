import java.util.Scanner;

public class palindNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num");
        int num = inp.nextInt();
        int rem, rev = 0;
        int c = num;
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }

        if (c == rev) {
            System.out.println("palindrme num");
        }

        else
            System.out.println("Not Palindrome");

    }
}