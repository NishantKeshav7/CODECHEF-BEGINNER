import java.util.Scanner;

public class cut_the_board {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = a * b;
            int d = a + b;
            System.out.println((c - d) + 1);
        }
    }
}
