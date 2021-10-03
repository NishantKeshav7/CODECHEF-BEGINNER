import java.util.Scanner;

public class chef_strIng2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String str = input.next();
            char arr[] = str.toCharArray();
            boolean cond = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == arr[n - 1]) {
                    cond = true;
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