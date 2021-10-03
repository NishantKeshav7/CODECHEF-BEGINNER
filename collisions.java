import java.util.Scanner;

public class collisions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[105];
        int k = 0;
        for (int i = 1; i < 105; i++) {
            arr[i] = k;
            k += i;
        }
        int t = input.nextInt();
        while (t-- > 0) {
            // int n = input.nextInt();
            // int m = input.nextInt();
            // int newarr1[][] = new int[n][m];
            // for (int i = 0; i < n; i++) {
            // for (int j = 0; j < m; j++) {
            // newarr1[i][j] = input.nextInt();
            // }
            // }
            // int newarr2[] = new int[m];
            // int a = 0;
            // for (int i = 0; i < m; i++) {
            // int sum = 0;
            // for (int j = 0; j < n; j++) {
            // sum += newarr1[j][i];
            // }
            // newarr2[a++] = sum;
            // }
            // int count = 0;
            // for (int i = 0; i < m; i++) {
            // count += arr[newarr2[i]];
            // }
            // System.out.println(count);
            int n = input.nextInt();
            int m = input.nextInt();
            String newarr1[] = new String[n];
            int newarr2[] = new int[m];
            for (int i = 0; i < n; i++) {
                newarr1[i] = input.next();
                //int a = 0;
                for (int j = 0; j < m; j++) {
                    if (newarr1[i].charAt(j) == '1') {
                        newarr2[j] += 1;
                    }
                }
                // input.nextLine();
            }
            // for (int i = 0; i < m; i++) {
            //     System.out.print(newarr2[i] + " ");
            // }
            int count = 0;
            for (int i = 0; i < m; i++) {
            count += arr[newarr2[i]];
            }
            System.out.println(count);
        }
        input.close();
    }
}