import java.util.Scanner;

public class chess_match {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();
            int sum1 = 2 * (180 + n);
            int sum2 = a + b;
            System.out.println(sum1 - sum2);
        }
        input.close();
    }
}