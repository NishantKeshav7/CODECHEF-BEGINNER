import java.util.*;

public class COVID_Pandemic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            ArrayList<Integer> newarr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (arr[i] == 1) {
                    newarr.add(i);
                }
            }
            // System.out.println(newarr);
            boolean cond = true;
            for (int i = 0; i < newarr.size() - 1; i++) {
                if (!(Math.abs(newarr.get(i) - newarr.get(i + 1)) >= 6)) {
                    cond = false;
                    break;
                }
            }
            if (cond) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}