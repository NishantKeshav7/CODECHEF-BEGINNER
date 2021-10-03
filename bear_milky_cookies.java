import java.util.Scanner;
public class bear_milky_cookies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String arr[] = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.next();
            }
            if (arr[n - 1].equals("cookie")) {
                System.out.println("NO");
            } else {
                boolean cond = true;
                for (int i = 0; i < n - 1; i++) {
                    if ((arr[i].equals("cookie")) && !(arr[i + 1].equals("milk"))) {
                        cond = false;
                        break;
                    }
                }
                if (cond) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        input.close();
    }
}