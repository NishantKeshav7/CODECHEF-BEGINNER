import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double x1 = ((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
        double x2 = ((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
        System.out.printf("%.6f", x1);
        System.out.printf("%.6f", x2);
        input.close();
    }
}
