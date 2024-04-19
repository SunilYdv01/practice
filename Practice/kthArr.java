public class kthArr {
    public static void main(String[] args) {
        int[] ar = { 5, 7, 11, 9, 19, 25, 99 };
        int k = 4;
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;

                }
            }
            if (i == k - 1) {
                System.out.println(k + " largest is : " + ar[i]);
            }

        }
        System.out.println("---------");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + "");
        }
    }
}
