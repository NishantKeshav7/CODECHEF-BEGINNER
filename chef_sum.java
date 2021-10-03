import java.util.Scanner;

public class chef_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long k = input.nextLong();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextLong();
            }
            boolean cond = false;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if ((arr[i] + arr[j]) == k) {
                        cond = true;
                        break;
                    }
                }
            }
            if (cond) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        input.close();
    }
}
