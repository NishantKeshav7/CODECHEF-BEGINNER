import java.util.Scanner;

public class chef_price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = input.nextInt();
                arr2[i] = arr1[i];
                sum1 += arr1[i];
            }
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] > k) {
                    arr2[i] = k;
                }
                sum2 += arr2[i];
            }
            System.out.println(sum1 - sum2);
        }
        input.close();
    }
}