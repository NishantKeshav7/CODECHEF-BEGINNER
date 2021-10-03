import java.util.*;

public class pair_me {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int arr[] = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = input.nextInt(); //
            }
            Arrays.sort(arr);
            if (arr[0] + arr[1] == arr[2]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
