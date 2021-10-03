package CodechefEasy;

import java.util.Scanner;

public class max_number {
    public static void main(String[] args) {
        try {
            int arr[] = new int[17];
            for (int i = 0; i < 17; i++) {
                arr[i] = (int) Math.pow(2, i);
            }
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            String bin = input.next();
            int num = toDecimal(bin + "", 0);
            int ans = 0;
            for (int i = 0; i < 17; i++) {
                if (num % arr[i] == 0) {
                    ans = i;
                }
            }
            System.out.println(ans);
        } catch (Exception e) {

        }
    }

    static int toDecimal(String binary, int i) {
        int n = binary.length();
        if (i == n - 1)
            return binary.charAt(i) - '0';
        return ((binary.charAt(i) - '0') << (n - i - 1)) + toDecimal(binary, i + 1);
    }
}
// /* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// class Codechef {
//     public static void main(String[] args) throws java.lang.Exception {
//         Scanner s = new Scanner(System.in);
//         try {
//             int n = s.nextInt();
//             String st = s.next();
//             int ans = 0;
//             for (int i = st.length() - 1; i >= 0; i--) {
//                 if (st.charAt(i) == '1') {
//                     System.out.println(ans);
//                     break;
//                 }
//                 ans++;
//             }
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }
