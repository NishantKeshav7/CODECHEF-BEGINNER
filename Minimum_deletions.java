import java.util.Scanner;

public class Minimum_deletions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0 ; i < n; i++) {
                arr[i] = input.nextInt();
            }
            int gcd = GCD(arr[0], arr[1]);
            for (int i = 1; i < n; i++) {
                gcd = GCD(gcd, arr[i]);
            }
            if (gcd == 1) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
        input.close();
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
