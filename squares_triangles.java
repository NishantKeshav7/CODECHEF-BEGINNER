// import java.util.*;

// public class squares_triangles {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         while (t-- > 0) {
//             int N = input.nextInt();
//             int arr[] = new int[N];
//             arr[0] = 0;
//             arr[1] = 0;
//             int num = 0;
//             for (int i = 2, add = 0; i < arr.length; i += 2, add++) {
//                 num = num + add;
//                 arr[i] = num;
//                 arr[i + 1] = num;
//             }
//             System.out.println(arr[N - 1]);
//         }
//     }
// }
import java.util.Scanner;

public class squares_triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10000];
        arr[0] = 0;
        arr[1] = 0;
        int num = 0;
        for (int i = 2, add = 0; i < arr.length; i += 2, add++) {
            num = num + add;
            arr[i] = num;
            arr[i + 1] = num;
        }
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            System.out.println(arr[n]);
        }
    }
}
