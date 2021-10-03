import java.util.*;

public class life_limited {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int gold = input.nextInt();
            int c = input.nextInt();
            for (int i = 0; i < c; i++) {
                int a = input.nextInt();
                int b = input.nextInt();
                if (gold == a) {
                    gold = b;
                } else if (gold == b) {
                    gold = a;
                }
            }
            System.out.println(gold + n - n);
        }
        input.close();
    }
}
