import java.util.Scanner;

public class chef_division_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long total_Questions = 0;
            int n = input.nextInt();
            long k = input.nextLong();
            long d = input.nextLong();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextLong();
                total_Questions += arr[i];
            }
            long constest_holded = (total_Questions / k);
            if (constest_holded > d) {
                constest_holded = d;
            }
            System.out.println(constest_holded);
        }
        input.close();
    }
}
