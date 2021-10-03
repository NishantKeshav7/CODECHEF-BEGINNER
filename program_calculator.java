import java.util.Scanner;

public class program_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int t = input.nextInt();
        // while (t-- > 0) {
        double a = input.nextDouble();
        double b = input.nextDouble();
        char ch = input.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.println((int) (a + b));
                break;
            case '-':
                System.out.println((int) (a - b));
                break;
            case '*':
                System.out.println((int) (a * b));
                break;
            case '/':
                System.out.println((a / b));
                break;
        }
    }
}
