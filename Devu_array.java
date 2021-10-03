import java.util.*;

public class Devu_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        long arr1[] = new long[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = input.nextLong();
        }
        long arr2[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextLong();
        }
        Arrays.sort(arr1);
        long min = arr1[0], max = arr1[m - 1];
        for (int i = 0; i < n; i++) {
            if (arr2[i] >= min && arr2[i] <= max) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
