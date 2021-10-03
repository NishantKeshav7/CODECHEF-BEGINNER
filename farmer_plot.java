import java.util.Scanner;

public class farmer_plot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int length = input.nextInt();
            int breadth = input.nextInt();
            int min = Math.min(length, breadth);
            int num = 1;
            for (int i = 1; i <= min; i++) {
                if (length % i == 0 && breadth % i == 0) {
                    num = i;
                }
            }
            length = (int) (length / num);
            breadth = (int) (breadth / num);
            System.out.println(length * breadth);
        }
    }
}
