import java.util.Scanner;

public class secret_recipe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            double x1 = input.nextDouble();
            double x2 = input.nextDouble();
            double x3 = input.nextDouble();
            double v1 = input.nextDouble();
            double v2 = input.nextDouble();
            double speed1 = Math.abs(x3 - x1) / v1;
            double speed2 = Math.abs(x3 - x2) / v2;
            System.out.println(speed1 + " " + speed2);
            if (speed2 < speed1) {
                System.out.println("Kefa");
            } else if (speed1 < speed2) {
                System.out.println("Chef");
            } else {
                System.out.println("Draw");
            }
        }
        input.close();
    }
}