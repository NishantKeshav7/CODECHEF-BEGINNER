// import java.util.*;

// public class chef_eid {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         while (t-- > 0) {
//             int n = input.nextInt();
//             int arr[] = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr[i] = input.nextInt();
//             }
//             Arrays.sort(arr);
//             int min = Integer.MAX_VALUE;
//             for (int i = 0; i < arr.length - 1; i++) {
//                 for (int j = i + 1; j < arr.length; j++) {
//                     int Tm = Math.abs(arr[i] - arr[j]);
//                     min = Math.min(min, Tm);
//                 }
//             }
//             System.out.println(min);
//         }
//         input.close();
//     }
// }
import java.util.*;

public class chef_eid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                int Tm = Math.abs(arr[i] - arr[i + 1]);
                min = Math.min(min, Tm);
            }
            System.out.println(min);
        }
        input.close();
    }
}