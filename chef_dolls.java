import java.util.*;

public class chef_dolls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            boolean cond = true;
            int number = 0;
            for (int i = 0; i < arr.length; i++) {
                if (isNotpair(arr, arr[i])) {
                    cond = false;
                    number = arr[i];
                    break;
                }
            }
            System.out.println(number);
        }
    }

    public static boolean isNotpair(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        if (count > 1) {
            return false; //
        } else {
            return true;
        }
    }
}
