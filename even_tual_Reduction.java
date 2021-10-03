import java.util.Scanner;

public class even_tual_Reduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String str = input.next();
            boolean cond = true;
            int arr[] = new int[26];
            for (int i = 0; i < n; i++) {
                arr[str.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (arr[i] % 2 != 0) {
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
        input.close();
    }
}