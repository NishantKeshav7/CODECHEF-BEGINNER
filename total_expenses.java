import java.util.Scanner;

public class total_expenses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            long Quantity = input.nextLong();
            long Price = input.nextLong();
            if (Quantity <= 1000) {
                double cost = Price * Quantity;
                System.out.println((float) cost);
            } else {
                double cost = Price * Quantity;
                double discount = (cost * 10) / 100;
                cost = cost - discount;
                System.out.println((float) cost);
            }
        }
        input.close();
    }
}
