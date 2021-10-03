import java.util.Scanner;

public class Bowling_strategy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int l = input.nextInt();
            if ((n > (k * l)) || (k == 1 && n > 1)) {
                System.out.println(-1);
            } else {
                for (int i = 1; i <= n; i++) {
                    if (i % k == 0) {
                        System.out.print(k + " ");
                    } else {
                        System.out.print((i % k) + " ");
                    }
                }
            }
        }
        input.close();
    }
}
