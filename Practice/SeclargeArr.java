public class SeclargeArr {
    public static void main(String[] args) {
        int[] a = { 4, 8, 9, 7, 11, 1, 99, 100, 11111, 1111 };
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
        System.out.println("Second largest is " + a[1]);
    }
}
