import java.util.Scanner;

public class chef_Sequence2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > 1) {
                    count++;
                }
            }
            if (count <= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
