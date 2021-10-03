import java.util.Scanner;

public class chef_strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long sum = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                sum += (Math.abs(arr[i + 1] - arr[i])) - 1;
                // System.out.print((Math.abs(arr[i + 1] - arr[i])) - 1 + " ");
            }
            System.out.println(sum);
        }
        input.close();
    }
}