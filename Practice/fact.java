import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num");
        int num = inp.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
