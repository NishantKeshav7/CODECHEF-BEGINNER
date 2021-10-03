import java.util.Scanner;

public class coupon_system {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int INDEX1 = Integer.MAX_VALUE;
            int DISCOUNT1 = Integer.MIN_VALUE;
            int INDEX2 = Integer.MAX_VALUE;
            int DISCOUNT2 = Integer.MIN_VALUE;
            int INDEX3 = Integer.MAX_VALUE;
            int DISCOUNT3 = Integer.MIN_VALUE;
            while (n-- > 0) {
                int index = input.nextInt();
                int type = input.nextInt();
                int discount = input.nextInt();
                if (type == 1) {
                    if (discount > DISCOUNT1) {
                        DISCOUNT1 = discount;
                        INDEX1 = index;
                    }
                    if (discount == DISCOUNT1) {
                        if (index < INDEX1) {
                            INDEX1 = index;
                            DISCOUNT1 = discount;
                        }
                    }
                } else if (type == 2) {
                    if (discount > DISCOUNT2) {
                        DISCOUNT2 = discount;
                        INDEX2 = index;
                    }
                    if (discount == DISCOUNT2) {
                        if (index < INDEX2) {
                            INDEX2 = index;
                            DISCOUNT2 = discount;
                        }
                    }
                } else if (type == 3) {
                    if (discount > DISCOUNT3) {
                        DISCOUNT3 = discount;
                        INDEX3 = index;
                    }
                    if (discount == DISCOUNT3) {
                        if (index < INDEX3) {
                            INDEX3 = index;
                            DISCOUNT3 = discount;
                        }
                    }
                }
            }
            System.out.println(DISCOUNT1 + " " + INDEX1);
            System.out.println(DISCOUNT2 + " " + INDEX2);
            System.out.println(DISCOUNT3 + " " + INDEX3);
        }
        input.close();
    }
}