import java.util.Scanner;

public class Closing_tweets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int arr[] = new int[N];
        int t = input.nextInt();
        while (t-- > 0) {
            for (int i = 0; i < N; i++) {
                arr[i] = 0;
            }
            String str = input.next();
            if (str.equals("CLICK")) {
                int n = input.nextInt();
                for (int i = 0; i < n; i++) {
                    arr[i] = 1;
                }
            } else {
                for (int i = 0; i < N; i++) {
                    arr[i] = 0;
                }
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] == 1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
