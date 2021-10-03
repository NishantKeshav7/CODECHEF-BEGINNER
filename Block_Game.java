import java.util.Scanner;

public class Block_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int N = input.nextInt();
            int original = N;
            int reverse = 0;
            while (N != 0) {
                int remainder = N % 10;
                reverse = reverse * 10 + remainder;
                N /= 10;
            }
            if (original == reverse) {
                System.out.println("wins");
            } else {
                System.out.println("loses");
            }
        }
        input.close();
    }
}