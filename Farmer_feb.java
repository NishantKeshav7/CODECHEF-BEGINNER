import java.util.Scanner;

public class Farmer_feb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c;
            for (int i = 1; true; i++) {
                int sum = a + b + i;
                if (isPrime(sum)) {
                    c = i;
                    break;
                }
            }
            System.out.println(c);
        }
        input.close();
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
