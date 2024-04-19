import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class AnagramStr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter First String :");
        String s1 = inp.nextLine();
        System.out.println("enter Second Strind :");
        String s2 = inp.nextLine();

        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result = Arrays.equals(a, b);
        if (result == true) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("String is not Anagram");
        }
    }
}
