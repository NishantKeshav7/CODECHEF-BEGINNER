// import java.util.Scanner;

// public class devu_grapes {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         while (t-- > 0) {
//             long n = input.nextLong();
//             long k = input.nextLong();
//             long arr[] = new long[(int) n];
//             for (long i = 0; i < arr.length; i++) {
//                 arr[(int) i] = input.nextLong();
//             }
//             long operations = 0;
//             for (long i = 0; i < arr.length; i++) {
//                 for (long j = 0; true; j++) {
//                     if ((arr[(int) i] + j) % k == 0) {
//                         operations += j;
//                         break;
//                     } else if ((arr[(int) i] - j) % k == 0) {
//                         operations += j;
//                         break;
//                     }
//                 }
//             }
//             System.out.println(operations);
//         }
//     }
// }
import java.util.Scanner;

public class devu_grapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            long operations = 0;
            for (int i = 0; i < n; i++) {
                int r = arr[i] % k;
                if (arr[i] >= k) {
                    operations += Math.min(r, k - r);
                } else {
                    operations += (k - r);
                }
            }
            System.out.println(operations);
        }
    }
}