import java.util.*;

public class chef_coloring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            String str = input.next();
            int r = 0, g = 0, b = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'R') {
                    r++; //
                } else if (str.charAt(i) == 'G') {
                    g++; //
                } else {
                    b++;
                }
            }
            int num = 0;
            if (r >= g && r >= b) {
                num = str.length() - r;
            } else if (g >= b && g >= r) {
                num = str.length() - g;
            } else {
                num = str.length() - b;
            }
            System.out.println(num);
        }
    }
}