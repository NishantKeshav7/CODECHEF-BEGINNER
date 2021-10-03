import java.util.Scanner;

public class good_Goke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int number = 0;
            for (int i = 1; i <= n; i++) {
                int a = input.nextInt();
                int b = input.nextInt();
                number = number ^ i;
            }
            System.out.println(number);
        }
    }
}
