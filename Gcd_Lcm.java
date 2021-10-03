import java.util.Scanner;

public class Gcd_Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            long A = input.nextLong();
            long B = input.nextLong();
            long gcd = gcd(A, B);
            long lcm = (long) ((A * B) / gcd);
            System.out.println(gcd + " " + lcm);
        }
        input.close();
    }

    public static long gcd(long N1, long N2) {
        if (N2 % N1 == 0)
            return N1;
        else
            return gcd(N2 % N1, N1);
    }
}
