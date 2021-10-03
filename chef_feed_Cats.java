import java.util.Scanner;

public class chef_feed_Cats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            int[] arr = new int[n + 1];
            int temp_arr[] = new int[m];
            int min , max;
            boolean cond = false;
            for (int i = 0; i < m; i++) {
                temp_arr[i] =input.nextInt();
            }
            for (int i = 0; i < m; i++) {
                int num = temp_arr[i];
                arr[num]++;
                min = arr[1];
                max = min;
                for (int j = 2; j <= n; j++) {
                    min = Math.min(min, arr[j]);
                    max = Math.max(max, arr[j]);
                }
                if ((max - min) > 1) {
                    cond = true;
                    break;
                }
            }
            if (!cond) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}