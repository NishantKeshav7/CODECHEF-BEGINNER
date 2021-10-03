import java.util.*;

public class bear_candies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String str = "";
        while (t-- > 0) {
            int limak = input.nextInt();
            int bob = input.nextInt();
            for (int i = 1, j = 2; true; i += 2, j += 2) {
                if (limak >= i) {
                    limak = limak - i;
                } else if (i > limak) {
                    str = "Bob";
                    break;
                }
                if (bob >= j) {
                    bob = bob - j;
                } else if (j > bob) {
                    str = "Limak";
                    break;
                }
            }
            System.out.println(str);
        }
    }
}
