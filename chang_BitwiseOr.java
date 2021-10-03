import java.util.Scanner;

public class chang_BitwiseOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextLong();
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans = ans | arr[i];
            }
            System.out.println(ans);
        }
        input.close();
    }
}
