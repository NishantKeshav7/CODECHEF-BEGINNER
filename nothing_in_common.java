// import java.util.*;

// public class nothing_in_common {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         while (t-- > 0) {
//             int n = input.nextInt();
//             int m = input.nextInt();
//             int arr1[] = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr1[i] = input.nextInt();
//             }
//             int arr2[] = new int[m];
//             for (int i = 0; i < m; i++) {
//                 arr2[i] = input.nextInt();
//             }
//             ArrayList<Integer> newarr = new ArrayList<Integer>();
//             for (int i = 0; i < n; i++) {
//                 newarr.add(arr1[i]);
//             }
//             for (int i = 0; i < m; i++) {
//                 newarr.add(arr2[i]);
//             }
//             // System.out.println(newarr.size());

//             newarr.sort(Comparator.naturalOrder());
//             int count = 0;
//             for (int i = 0; i < newarr.size() - 1; i++) {
//                 if (newarr.get(i) == newarr.get(i + 1))
//                     count++;
//             }
//             System.out.println(count);
//         }
//         input.close();
//     }
// }
import java.util.*;

public class nothing_in_common {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            int arr1[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = input.nextInt();
            }
            int arr2[] = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = input.nextInt();
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int i = 0, j = 0, count = 0;
            while (i < n && j < m) {
                if (arr1[i] < arr2[j]) {
                    i++;
                } else if (arr2[j] < arr1[i]) {
                    j++;
                } else {
                    count++;
                    i++;
                    j++;
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}