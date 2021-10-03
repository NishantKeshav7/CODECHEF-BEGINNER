import java.util.Scanner;

public class buggy_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long a = input.nextLong();
            long b = input.nextLong();
            System.out.println((a + b) - 10);
        }
        input.close();
    }
}