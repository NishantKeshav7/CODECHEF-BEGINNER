import java.util.Scanner;

public class strange_operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                sum += arr[i];
            }
            if (sum % 2 == 0) {
                if (k == 1) {
                    System.out.println("odd");
                } else {
                    System.out.println("even");
                }
            } else
                System.out.println("even");
        }
        input.close();
    }
}
