import java.util.Scanner;

public class chef_subarrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextLong();
            }
            long sum = 0, multi = 1, count = 0;
            for (int i = 0; i < n; i++) {
                sum = 0;
                multi = 1;
                for (int j = i; j < n; j++) {
                    sum += arr[j];
                    multi *= arr[j];
                    if (sum == multi) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
