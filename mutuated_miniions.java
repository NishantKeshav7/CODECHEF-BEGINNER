import java.util.*;

public class mutuated_miniions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            int k = input.nextInt();
            int count = 0;
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
                arr[i] += k;
                if (arr[i] % 7 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
