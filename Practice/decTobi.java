import java.util.Scanner;

public class decTobi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num");
        int num = inp.nextInt();
        String b = "";
        int temp = 0;
        temp = num;
        while (temp > 0) {
            int rem = temp % 2;
            temp = temp / 2;
            b = rem + b;
        }
        System.out.println(b);
    }
}