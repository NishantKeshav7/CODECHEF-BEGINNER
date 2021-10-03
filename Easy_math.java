import java.util.Scanner;

public class Easy_math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int m = sum(arr[i] * arr[j]);
                    if (m > sum) {
                        sum = m;
                    }
                }
            }
            System.out.println(sum);
        }
        input.close();
    }

    static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            int r = num % 10;
            sum += r;
            num /= 10;
        }
        return sum;
    }
}
