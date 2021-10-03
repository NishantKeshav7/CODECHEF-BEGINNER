import java.util.Scanner;

public class ping_paja_pong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long x = input.nextLong();
            long y = input.nextLong();
            long k = input.nextLong();
            if ((x + y) % k == 0) {
                System.out.println("Chef");
            } else {
                System.out.println("Paja");
            }
        }
        input.close();
    }
}
