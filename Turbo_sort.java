import java.util.*;

public class Turbo_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int T = input.nextInt();
        // for (int j = 0; j < T; j++) {
            int N = input.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < N; i++) {
                System.out.println(arr[i]);
            }
        }
    }
// }