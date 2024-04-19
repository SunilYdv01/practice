import java.util.Scanner;

public class palindromeStr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter String");
        String sc = inp.nextLine();
        String rev = "";
        for (int i = sc.length() - 1; i >= 0; i--) {
            rev = rev + sc.charAt(i);
        }
        if (sc.equals(rev)) {
            System.out.println("Palindrome");
        }

        else {
            System.out.println("Not palindrome");
        }
    }
}
