import java.util.Scanner;

public class kitchen_timetables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            long A[] = new long[N + 1];
            long B[] = new long[N + 1];
            for (int i = 1; i <= N; i++) {
                A[i] = input.nextLong();
            }
            for (int i = 1; i <= N; i++) {
                B[i] = input.nextLong();
            }
            int count = 0;
            for (int i = 1; i <= N; i++) {
                long num = A[i] - A[i - 1];
                if (num >= B[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
