import java.util.Scanner;

public class Naive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();
            int c1 = 0, c2 = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (arr[i] == x)
                    c1++;
                if (arr[i] == y)
                    c2++;
            }
            float x1 = (float) c1 / n;
            float x2 = (float) c2 / n;

            System.out.printf("%.10f\n", x1 * x2);
        }
        input.close();
    }
}