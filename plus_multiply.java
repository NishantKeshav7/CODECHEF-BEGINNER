import java.util.Scanner;

public class plus_multiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextLong();
            }
            long count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (((arr[i] + arr[j]) == (arr[i] * arr[j])) && (i != j)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        input.close();
        // int t = input.nextInt();
        // while (t-- > 0) {
        // int n = input.nextInt();
        // long arr[] = new long[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = input.nextLong();
        // }
        // long c1 = 0, c2 = 0;
        // for (int i = 0; i < n; i++) {
        // if (arr[i] == 0) {
        // c1++;
        // } else if (arr[i] == 2) {
        // c2++;
        // }
        // }
        // System.out.println((c1 * (c1 - 1) / 2) + (c2 * (c2 - 1) / 2));
        // }
        // input.close();
    }
}