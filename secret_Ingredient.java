import java.util.Scanner;

public class secret_Ingredient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong();
            long x = input.nextLong();
            long arr[] = new long[(int) n], count = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextLong();
                if (arr[i] >= x) {
                    count++;
                }
            }
            if (count >= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}