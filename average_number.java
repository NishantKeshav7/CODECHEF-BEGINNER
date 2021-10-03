// import java.util.Scanner;

// public class pair_me {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         while (t-- > 0) {
//             double n = input.nextDouble();
//             double k = input.nextDouble();
//             double v = input.nextDouble();
//             double arr[] = new double[(int) n];
//             double avg = 0;
//             for (int i = 0; i < n; i++) {
//                 arr[i] = input.nextDouble();
//                 avg += arr[i];
//             }
//             avg = avg / n;
//             if (avg > v) {
//                 System.out.println(-1);
//             } else {
//                 double sum = 0;
//                 for (int i = 0; i < n; i++) {
//                     sum += arr[i];
//                 }
//                 int num = 0;
//                 for (int i = 1;; i++) {
//                     double sum1 = sum + (i * k);
//                     if (sum1 / (n + k) == v) {
//                         num = i;
//                         break;
//                     }
//                 }
//                 System.out.println(num);
//             }
//         }
//         input.close();
//     }
// }
import java.util.Scanner;

public class average_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            double n = input.nextDouble();
            double k = input.nextDouble();
            double v = input.nextDouble();
            double arr[] = new double[(int) n];
            double sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextDouble();
                sum += arr[i];
            }
            double x = (v * (n + k) - sum) / k;
            if (x % 1 == 0 && x > 0)
                System.out.println((int) x);
            else
                System.out.println(-1);
        }
        input.close();
    }

}