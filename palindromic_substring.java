import java.util.*;

public class palindromic_substring {
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
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (isd(arr1, arr2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean isd(char arr1[], char arr2[]) {
        // boolean cond = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
