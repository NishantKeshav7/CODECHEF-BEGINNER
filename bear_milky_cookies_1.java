import java.util.*;

public class bear_milky_cookies_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            ArrayList<String> arr = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                String str = input.next();
                arr.add(str);
            }
            // System.out.println(arr);
            if (arr.get(arr.size() - 1).equals("cookie")) {
                System.out.println("NO");
            } else {
                boolean cond = true;
                for (int i = 0; i < n - 1; i++) {
                    if (((arr.get(i).equals("cookie")) && !(arr.get(i + 1).equals("milk")))) {
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
