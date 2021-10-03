import java.util.Scanner;

public class primeality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int j = 0; j < t; j++) {
            int num = input.nextInt();
            if (isPrime(num)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        input.close();
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
