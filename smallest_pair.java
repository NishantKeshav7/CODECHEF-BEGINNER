import java.util.*;

public class smallest_pair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int num = input.nextInt();
            int arr[] = new int[num];
            for (int j = 0; j < num; j++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[0] + arr[1]);
        }
        input.close();
    }
}
