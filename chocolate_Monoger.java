package CodechefEasy;

import java.util.*;

public class chocolate_Monoger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int x = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            ArrayList<Integer> newarr = new ArrayList<>();
            int temp = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != temp) {
                    newarr.add(arr[i]);
                    temp = arr[i];
                }
            }
            System.out.println(Math.min(n - x, newarr.size()));
        }
    }
}
