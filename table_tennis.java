import java.util.Scanner;

public class table_tennis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            int ones = 0, zero = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    ones++;
                } else {
                    zero++;
                }
            }
            if (ones > zero)
                System.out.println("WIN");
            else
                System.out.println("LOSE");
        }

    }
}