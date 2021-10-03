import java.util.Scanner;

public class model {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int max = 0;
            int min = 1000000;
            int max_pos = 0;
            int min_pos = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (arr[i] > max) {
                    max = arr[i];
                    max_pos = i;
                }
                if (arr[i] < min) {
                    min = arr[i];
                    min_pos = i;
                }
            }
            if (min_pos < max_pos) {
                System.out.println(min + " " + max);
            } else {
                System.out.println(max + " " + min);
            }
        }
        input.close();
    }
}