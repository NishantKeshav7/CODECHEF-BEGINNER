import java.util.Scanner;

public class Laddu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String user = input.next();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                String str1 = input.next();
                if (str1.equals("CONTEST_WON")) {
                    int x = input.nextInt();
                    if (x <= 20) {
                        sum += 300 + (20 - x);
                    } else {
                        sum += 300;
                    }
                } else if (str1.equals("BUG_FOUND")) {
                    int x = input.nextInt();
                    sum += x;
                } else if (str1.equals("TOP_CONTRIBUTOR")) {
                    sum += 300;
                } else if (str1.equals("CONTEST_HOSTED")) {
                    sum += 50;
                }
            }
            if (user.equals("INDIAN")) {
                System.out.println(sum / 200);
            } else {
                System.out.println(sum / 400);
            }
        }
        input.close();
    }
}