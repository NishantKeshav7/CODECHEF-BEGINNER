import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int N = input.nextInt();
            System.out.println((int) (Math.sqrt(N)));
        }
        input.close();
    }
}
