import java.util.*;

public class Pintu_fruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = input.nextInt();
            }
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                int num = arr1[i];
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    if (arr1[j] == num) {
                        sum += arr2[j];
                    }
                }
                list.add(sum);
            }
            Collections.sort(list);
            System.out.println(list.get(0));
        }
        input.close();
    }
}