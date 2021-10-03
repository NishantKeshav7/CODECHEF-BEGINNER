// import java.util.Scanner;

// public class HTML_tags {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         while (t-- > 0) {
//             String str = input.next();
//             if (str.length() >= 4) {
//                 if (isHTML(str)) {
//                     System.out.println("Success");
//                 } else {
//                     System.out.println("Error");
//                 }
//             } else {
//                 System.out.println("Error");
//             }
//         }
//     }

//     static boolean isHTML(String str) {
//         if (isStartsEnds(str) && isContains(str))
//             return true;
//         return false;
//     }

//     static boolean isStartsEnds(String str) {
//         if (str.charAt(0) == '<' && str.charAt(1) == '/' && str.charAt(str.length() - 1) == '>') {
//             return true;
//         }
//         return false;
//     }
//     static boolean isContains(String str) {
//         for (int i = 2; i < str.length() - 2; i++) {
//             if (!((str.charAt(i) >= 97 && str.charAt(i) <= 122) || (str.charAt(i) >= 47 && str.charAt(i) <= 57))) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
import java.util.Scanner;

// public class HTML_tags {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         while (t-- > 0) {
//             String str = input.next();
//             boolean cond = true;
//             if (str.length() < 4) {
//                 cond = false;
//             } else {
//                 if (str.charAt(0) == '<' && str.charAt(1) == '/' && str.charAt(str.length() - 1) == '>') {
//                     cond = true;
//                     if (cond) {
//                         for (int i = 2; i < str.length() - 2; i++) {
//                             if (!((str.charAt(i) >= 97 && str.charAt(i) <= 122)
//                                     || (str.charAt(i) >= 48 && str.charAt(i) <= 57))) {
//                                 cond = false;
//                                 break;
//                             }
//                         }
//                     }
//                 } else {
//                     cond = false;
//                 }
//             }
//             if (cond) {
//                 System.out.println("Success");
//             } else {
//                 System.out.println("Error");
//             }
//         }
//     }
// }
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HTML_tags {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            if (str.length() >= 4) {
                if (str.charAt(0) == '<' && str.charAt(1) == '/' && str.charAt(str.length() - 1) == '>') {
                    int flag = 0;
                    for (int i = 2; i <= str.length() - 2; i++) {
                        if (!((str.charAt(i) >= 97 && str.charAt(i) <= 122)
                                || (str.charAt(i) >= 47 && str.charAt(i) <= 57)))
                            flag = 1;
                    }
                    if (flag == 1)
                        System.out.println("Error");
                    else
                        System.out.println("Success");
                } else
                    System.out.println("Error");
            } else
                System.out.println("Error");
        }
    }
}