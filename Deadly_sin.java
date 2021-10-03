import java.util.Scanner;
public class Deadly_sin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long a = input.nextLong();
            long b = input.nextLong();
            if (a == b) {
                System.out.println(a + b);
                continue;
            }
            while (a != 0 && b != 0 && a != b) {
                if (a > b) {
                    a = a % b;
                } else {
                    b = b % a;
                }
            }
            if (a == 0 || b == 0)
                System.out.println(2 * (a + b));
            else
                System.out.println(a + b);
        }
        input.close();
    }
}
