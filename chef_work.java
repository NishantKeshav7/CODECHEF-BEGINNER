import java.util.Scanner;

public class chef_work {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            boolean cond = false;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (arr[i] > k) {
                    cond = true;
                }
            }
            if (cond) {
                System.out.println(-1);
            } else {
                int sum = 0;
                int c = 1;
                for (int i = 0; i < n; i++) {
                    sum += arr[i];
                    if (sum > k) {
                        c++;
                        sum = arr[i];
                    }
                }
                System.out.println(c);
            }
        }
        input.close();
    }
}