import java.util.Scanner;

public class coronaVirus_spread {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int count = 1;
            for (int i = 0; i < n - 1; i++) {
                if (Math.abs(arr[i + 1] - arr[i]) <= 2)
                    count++;
                else {
                    max = Math.max(max, count);
                    min = Math.min(min, count);
                    count = 1;
                }
            }
            max = Math.max(max, count);
            min = Math.min(min, count);
            System.out.println(min + " " + max);
        }
        input.close();
    }
}