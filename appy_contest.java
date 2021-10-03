import java.util.Scanner;

public class appy_contest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong();
            long a = input.nextLong();
            long b = input.nextLong();
            long k = input.nextLong();
            long count = 0;
            for (int i = 1; i < n; i++) {
                if ((i % a == 0) && (i % b != 0))
                    count++;
                else if ((i % b == 0) && (i % a != 0))
                    count++;
                else
                    count += 0;
            }
            if (count >= k) {
                System.out.println("Win");
            } else {
                System.out.println("Lose");
            }
        }
        input.close();
    }
}