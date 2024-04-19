
import java.util.Scanner;

public class DuplicateStr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter String :");
        String sc = inp.nextLine();
        System.out.println("New String is " + Duplicate(sc));
    }

    public static String Duplicate(String sc) {
        String newstr = "";
        for (int i = 0; i < sc.length(); i++) {
            char ch = sc.charAt(i);
            if (newstr.indexOf(ch) == -1) {
                newstr += ch;
            }
        }
        return newstr;
    }
}
