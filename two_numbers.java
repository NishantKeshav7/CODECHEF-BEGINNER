// import java.util.Scanner;

// public class two_numbers {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         while (t-- > 0) {
//             long alice = input.nextLong();
//             long bob = input.nextLong();
//             long N = input.nextLong();
//             for (long i = 1; i <= N; i++) {
//                 if (i % 2 == 1) {
//                     alice = alice * 2;
//                 } else {
//                     bob = bob * 2;
//                 }
//             }
//             // System.out.println(alice + " " + bob);
//             long min = Math.min(alice, bob);
//             long max = Math.max(alice, bob);
//             System.out.println((long) (max / min));
//         }
//     }
// }
import java.util.Scanner;

public class two_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long alice = input.nextLong();
            long bob = input.nextLong();
            long n = input.nextLong();
            long sol = 0;
            if (n % 2 == 0) {
                sol = (Math.max(alice, bob)) / (Math.min(alice, bob));
            } else {
                sol = (Math.max(alice * 2, bob)) / (Math.min(alice * 2, bob));
            }
            System.out.println(sol);
        }
    }
}