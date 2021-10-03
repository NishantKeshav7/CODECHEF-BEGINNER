import java.util.*;

public class chefWildcard_matching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str1 = input.next();
            String str2 = input.next();
            char arr1[] = new char[str1.length()];
            char arr2[] = new char[str2.length()];
            for (int i = 0; i < str1.length(); i++) {
                arr1[i] = str1.charAt(i);
            }
            for (int i = 0; i < str2.length(); i++) {
                arr2[i] = str2.charAt(i);
            }
            boolean cond = true;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == '?') {
                    continue;
                } else if (arr2[i] == '?') {
                    continue;
                } else if ((arr1[i] != arr2[i])) {
                    cond = false;
                    break;
                }
            }
            if (cond) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
