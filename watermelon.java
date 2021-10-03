import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int sum = 0, arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                sum += arr[i];
            }
            if (sum >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}