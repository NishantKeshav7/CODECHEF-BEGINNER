import java.util.*;

public class malvika_baloons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            char arr[] = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i);
            }
            Arrays.sort(arr);
            int a = 0, b = 0;
            for (int i = 0; i < str.length(); i++) {
                if (arr[i] == 'a') {
                    a++;
                } else {
                    b++;
                }
            }
            if (b < a) {
                System.out.println(b);
            } else if (a == b) {
                System.out.println(a);
            } else {
                System.out.println(a);
            }
        }
        input.close();
    }
}