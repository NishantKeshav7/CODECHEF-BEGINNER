import java.util.Scanner;

public class judging_delay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int arr[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = input.nextInt();
                }
            }
            int newarr[] = new int[n];
            for (int i = 0; i < n; i++) {
                newarr[i] = Math.abs(arr[i][0] - arr[i][1]);
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (newarr[i] > 5) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
