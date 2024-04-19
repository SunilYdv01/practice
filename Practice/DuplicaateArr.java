import java.util.Scanner;

public class DuplicaateArr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int arr[] = { 1, 20, 33, 1, 2, 33,7,7,8,9,8 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate is " + arr[i]);
                }
            }
        }
    }
}
