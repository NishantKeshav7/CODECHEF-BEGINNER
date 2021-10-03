import java.util.*;

public class Grade_steel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int hardness = 0, carbon = 0, tensile = 0;
            int hard = input.nextInt();
            double car = input.nextDouble();
            int tens = input.nextInt();
            if (hard > 50) {
                hardness++;
            }
            if (car < 0.7) {
                carbon++;
            }
            if (tens > 5600) {
                tensile++;
            }
            int number = 0;
            if (hardness == 1 && carbon == 1 && tensile == 1) {
                number = (10);
            } else if (hardness == 1 && carbon == 1 && tensile == 0) {
                number = 9;
            } else if (hardness == 0 && carbon == 1 && tensile == 1) {
                number = 8;
            } else if (hardness == 1 && carbon == 0 && tensile == 1) {
                number = 7;
            } else if (hardness == 1 || carbon == 1 || tensile == 1) {
                number = 6;
            } else if (hardness == 0 && carbon == 0 && tensile == 0) {
                number = 5;
            }
            System.out.println(number);
        }
    }
}
