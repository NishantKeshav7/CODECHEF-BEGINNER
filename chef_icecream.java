import java.util.Scanner;

public class chef_icecream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int c5 = 0 , c10= 0;
            String cond = "YES";
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0 ; i < n ; i++) {
                if (arr[i] == 5) {
                    c5++;
                } else if (arr[i] == 10) {
                    if (c5 > 0) {
                        c5--;
                        c10++;
                    } else {
                        cond = "NO";
                        break;
                    }
                } else {
                    if (c10 > 0) {
                        c10--;
                    } else if (c5 > 1) {
                        c5 -= 2;
                    } else {
                        cond = "NO";
                        break;
                    }
                }
            }
            System.out.println(cond);
        }
        input.close();
    }
}
