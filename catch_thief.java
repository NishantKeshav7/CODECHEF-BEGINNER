import java.util.Scanner;

public class catch_thief {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long x = input.nextLong();
            long y = input.nextLong();
            long k = input.nextLong();
            long n = input.nextLong();
            if (Math.abs(x - y) % (2 * k) == 0 && (Math.abs(x - y) != k)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        input.close();
    }
}