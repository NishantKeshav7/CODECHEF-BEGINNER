import java.util.Scanner;

public class Even_differences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int arr[] = new int[n];
            int odd = 0, even = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (arr[i] % 2 == 0)
                    even++;
                else
                    odd++;
            }
            System.out.println(Math.min(even, odd));
        }
        input.close();
    }
}