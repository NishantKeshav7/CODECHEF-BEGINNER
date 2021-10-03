import java.util.Scanner;

public class Archi_and_Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            double n = input.nextDouble();
            if (n % 2 == 0) {
                if (a < 0) {
                    a = Math.abs(a);
                }
                if (b < 0) {
                    b = Math.abs(b);
                }
            }
            if (a == b) {
                System.out.println(0);
            } else if (a > b) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        input.close();
    }
}