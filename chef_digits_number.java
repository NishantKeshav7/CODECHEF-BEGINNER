import java.util.*;

public class chef_digits_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int num = input.nextInt();
            String str1 = num + "";
            int Zeroes = 0, ones = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == '1') {
                    ones++; //
                } else {
                    Zeroes++;
                }
            }
            if (ones == 1 || Zeroes == 1) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }
    }
}
