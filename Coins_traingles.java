import java.util.Scanner;

public class Coins_traingles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            int k = 1;
            int count = 0;
            while (N != 0) {
                N = N - k;
                count++;
                k++;
                if (N < k) {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}