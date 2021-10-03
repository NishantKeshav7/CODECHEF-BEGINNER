import java.util.Scanner;

public class chef_difficult_contest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long a = input.nextLong();
            long b = input.nextLong();
            if ((a + b) == (b + a))
                System.out.println("YES");
            else {
                System.out.println("Maa Chuda");
            }
        }
        input.close();
    }
}
