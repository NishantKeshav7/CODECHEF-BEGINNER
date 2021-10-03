import java.util.*;

public class sticks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            int count = 0;
            int mully = 1;
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            for (int i = N - 1; i > 0; i--) {
                if (arr[i] == arr[i - 1]) {
                    count++;
                    mully *= arr[i];
                    i--;
                }
                if (count == 2) {
                    break;
                }
            }
            if (count == 2)
                System.out.println(mully);
            else
                System.out.println(-1);
        }
    }
}
