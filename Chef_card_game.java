import java.util.Scanner;

public class Chef_card_game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int chef = 0, Morty = 0;
            while (n-- > 0) {
                int c = input.nextInt();
                int m = input.nextInt();
                if (digits(c) > digits(m)) {
                    chef++;
                } else if (digits(c) < digits(m)) {
                    Morty++;
                } else {
                    chef++;
                    Morty++;
                }
            }
            if (chef > Morty) {
                System.out.println("0 " + chef);
            } else if (Morty > chef) {
                System.out.println("1 " + Morty);
            } else {
                System.out.println("2 " + chef);
            }
        }
        input.close();
    }

    public static int digits(int num) {
        int sum = 0;
        int n = num;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
}
