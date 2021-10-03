import java.util.Scanner;

public class Small_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            long N = input.nextLong();
            long fact = 1;
            for (int j = 1; j <= N; j++) {
                fact = fact * j;
            }
            System.out.println(fact);
        }
        input.close();
    }
}