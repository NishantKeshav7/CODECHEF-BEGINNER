import java.util.Scanner;

public class red_alert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int d = input.nextInt();
            int h = input.nextInt();
            boolean cond = false;
            int arr[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    sum += arr[i];
                } else if (arr[i] == 0) {
                    if (sum < d) {
                        sum = 0;
                    } else {
                        sum = sum - d;
                    }
                }
                if (sum > h) {
                    cond = true;
                    break;
                }
            }
            if (cond) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
