import java.util.Scanner;

public class Chef_denomiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long s = input.nextLong();
            long m = input.nextLong();
            long count = 0;
            count = s / m;
            if (s % m == 0) {
                System.out.println(count);
            } else {
                s = s % m;
                if (s % 2 == 0 || s == 1) {
                    count += (1);
                } else {
                    count += (2);
                }
                System.out.println(count);
            }
        }
        input.close();
    }
}