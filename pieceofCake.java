import java.util.*;

public class pieceofCake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            char ch = str.charAt(0);
            int greatest = 0;
            for (int i = 0; i < str.length(); i++) {
                int count = getCount(str, str.charAt(i));
                if (count > greatest) {
                    greatest = count;
                    ch = str.charAt(i);
                }
            }
            // System.out.println(ch + " " + greatest);
            int count = str.length() - greatest;
            if (greatest == count) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int getCount(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
