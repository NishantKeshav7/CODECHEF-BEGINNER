import java.util.Scanner;

public class lift_rquests {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong();
            long q = input.nextLong();
            long curr = 0, sum = 0;
            for (int i = 0; i < q; i++, n++) {
                long a = input.nextLong();
                long b = input.nextLong();
                sum += Math.abs(a - curr) + Math.abs(b - a);
                curr = b;
            }
            System.out.println(sum + (n - n));
        }
        input.close();
    }
}