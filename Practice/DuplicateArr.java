public class DuplicateArr {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 1, 5, 9, 5, 3, 4 };
        System.out.println("duplicate element are:");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[j]);
                }
            }
        }
    }
}
