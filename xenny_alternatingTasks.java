import java.util.Scanner;

public class xenny_alternatingTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = input.nextInt();
            }
            int sum1 = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sum1 += arr1[i];
                } else {
                    sum1 += arr2[i];
                }
            }
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sum2 += arr2[i];
                } else {
                    sum2 += arr1[i];
                }
            }
            System.out.println(Math.min(sum1, sum2));
        }
        input.close();
    }
}