import java.util.Scanner;

public class chef_gift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int count = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (arr[i] % 2 == 0) {
                    count++;
                }
            }
            if (k == 0 && count == n) {
                System.out.println("NO");
            } else if (count >= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
