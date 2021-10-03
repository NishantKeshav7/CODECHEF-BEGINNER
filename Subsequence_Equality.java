import java.util.Scanner;

public class Subsequence_Equality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            int arr[] = new int[26];
            boolean cond = false;
            for (int i = 0; i < str.length(); i++) {
                arr[str.charAt(i) - 'a']++;
            }
            for (int i = 0; i < str.length(); i++) {
                if (arr[i] > 1) {
                    cond = true;
                    break;
                }
            }
            if (cond)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        input.close();
    }
}
