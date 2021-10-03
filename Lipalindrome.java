import java.util.*;

public class Lipalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int k = 0; k < t; k++) {

            String str = input.next();
            int n = str.length() / 2;
            char arr1[] = new char[n];
            char arr2[] = new char[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = str.charAt(i);
            }
            for (int i = 0, j = str.length() - 1; i < n; i++, j--) {
                arr2[i] = str.charAt(j);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (isEqual(arr1, arr2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }

    public static boolean isEqual(char arr1[], char arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}