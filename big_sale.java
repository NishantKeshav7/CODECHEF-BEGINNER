import java.util.Scanner;

public class big_sale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        while (i-- > 0) {
            int t = input.nextInt();
            double sum = 0;
            while (t-- > 0) {
                double price = input.nextDouble();
                double actualPrice = price;
                double Quantity = input.nextDouble();
                double discount = input.nextDouble();
                price += ((discount / 100) * price);
                price -= ((discount / 100) * price);
                sum += ((actualPrice - price) * Quantity);
            }
            System.out.println(sum);
        }
        input.close();
    }
}
