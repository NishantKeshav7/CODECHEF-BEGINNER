import java.util.Scanner;

public class Making_meal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int count = 0, c = 0, o = 0, d = 0, e = 0, h = 0, f = 0;
            int n = input.nextInt();
            String arr[] = new String[n];
            String str = "";
            for (int i = 0; i < n; i++) {
                arr[i] = input.next();
                str += arr[i];
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'c')
                    c++;
                else if (str.charAt(i) == 'o')
                    o++;
                else if (str.charAt(i) == 'd')
                    d++;
                else if (str.charAt(i) == 'e')
                    e++;
                else if (str.charAt(i) == 'h')
                    h++;
                else if (str.charAt(i) == 'f')
                    f++;
                if (c >= 2 && o >= 1 && d >= 1 && e >= 2 && h >= 1 && f >= 1) {
                    count++;
                    c -= 2;
                    o--;
                    d--;
                    e -= 2;
                    h--;
                    f--;
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}