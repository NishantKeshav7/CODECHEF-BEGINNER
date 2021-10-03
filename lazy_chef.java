// import java.util.Scanner;

// public class lazy_chef {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         while (t-- > 0) {
//             int x = input.nextInt();
//             int m = input.nextInt();
//             int d = input.nextInt();
//             int A = x * m;
//             int B = x + d;
//             System.out.println(Math.min(A, B));
//         }
//     }
// }
// import java.util.Scanner;

// public class lazy_chef {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         while (t-- > 0) {
//             int n = input.nextInt();
//             boolean cond = true;
//             for (int i = 0; i < n; i++) {
//                 String str = input.next();
//                 if (isstr(str)) {
//                     cond = true; //
//                 } else {
//                     cond = false;
//                     break;
//                 }
//             }
//             if (cond) {
//                 System.out.println("YES");
//             } else {
//                 System.out.println("NO");
//             }
//         }
//     }

//     public static boolean isstr(String str) {
//         boolean cond = true;
//         int lang1 = 0;
//         int lang2 = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch >= 'a' && ch <= 'm') {
//                 lang1++;
//             } else if (ch >= 'N' && ch <= 'Z') {
//                 lang2++;
//             }
//             if ((lang1 > 0 && lang2 > 0) || (lang2 > 0 && lang1 > 0)) {
//                 return false;
//             }
//             if ((ch >= 'a' && ch <= 'm') || (ch >= 'N' && ch <= 'Z')) {
//                 cond = true; //
//             } else {
//                 cond = false;
//                 break;
//             }
//         }
//         return cond;
//     }
// }
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// class lazy_chef {
//     public static void main(String[] args) {
//         try {
//             Scanner input = new Scanner(System.in);
//             int t = input.nextInt();
//             while (t-- > 0) {
//                 int n = input.nextInt();
//                 boolean cond = true;
//                 for (int i = 0; i < n; i++) {
//                     String str = input.next();
//                     if (isstr(str)) {
//                         cond = true; //
//                     } else {
//                         cond = false;
//                         break;
//                     }
//                 }
//                 if (cond) {
//                     System.out.println("YES");
//                 } else {
//                     System.out.println("NO");
//                 }
//             }
//         } catch (Exception e) {
//             return;
//         }
//     }

//     public static boolean isstr(String str) {
//         boolean cond = false;
//         int lang1 = 0;
//         int lang2 = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch >= 'a' && ch <= 'm') {
//                 lang1++;
//             } else if (ch >= 'N' && ch <= 'Z') {
//                 lang2++;
//             }
//             if ((lang1 > 0 && lang2 > 0) || (lang2 > 0 && lang1 > 0)) {
//                 return false;
//             }
//             if ((ch >= 'a' && ch <= 'm') || (ch >= 'N' && ch <= 'Z')) {
//                 cond = true; //
//             } else {
//                 cond = false;
//                 break;
//             }
//         }
//         return cond;
//     }
// }
// import java.util.Scanner;

// public class Codechef {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int testcases = input.nextInt();
//         while (testcases-- > 0) {
//             int N = input.nextInt();
//             String arr[] = new String[N];
//             for (int i = 0; i < N; i++) {
//                 arr[i] = input.next();
//             }
//             boolean condition = true;
//             for (int i = 0; i < N; i++) {
//                 String word = arr[i];
//                 if (isstr(word)) {
//                     condition = true;
//                 } else {
//                     condition = false;
//                     break;
//                 }
//             }
//             if (condition) {
//                 System.out.println("YES");
//             } else {
//                 System.out.println("NO");
//             }
//         }
//         input.close();
//     }

//     public static boolean isstr(String str) {
//         int language1 = 0;
//         int language2 = 0;
//         int language3 = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch >= 'a' && ch <= 'm') {
//                 language1++;
//             } else if (ch >= 'N' && ch <= 'Z') {
//                 language2++; //
//             } else {
//                 language3++;
//             }
//             if (language1 > 0 && language2 > 0) {
//                 return false;
//             }
//         }
//         if (language3 > 0)
//             return false;
//         else
//             return true;
//     }
// }
// import java.util.*;

// public class lazy_chef {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         while (t-- > 0) {
//             int N = input.nextInt();
//             int M = input.nextInt();
//             int K = input.nextInt();
//             int arr[] = new int[K];
//             for (int i = 0; i < K; i++) {
//                 arr[i] = input.nextInt();
//             }
//             Arrays.sort(arr);
//             int count = 0;
//             int duplicate = 0;
//             for (int i = 0; i < K - 1; i++) {
//                 if (arr[i] == arr[i + 1] && arr[i] != duplicate) {
//                     duplicate = arr[i];
//                     count++;
//                 }
//             }
//             if (count == 0) {
//                 System.out.println(0);
//             } else {
//                 int newarr[] = new int[count];
//                 duplicate = 0;
//                 for (int i = 0, j = 0; i < K - 1; i++) {
//                     if (arr[i] == arr[i + 1] && arr[i] != duplicate) {
//                         newarr[j] = arr[i];
//                         duplicate = arr[i];
//                         j++;
//                     }
//                 }
//                 for (int i = 0; i < newarr.length; i++) {
//                     if (newarr[i] >= (N + 1) && newarr[i] <= (N + M)) {
//                         count--;
//                     }
//                 }
//                 System.out.print(count + " ");
//                 for (int i = 0; i < newarr.length; i++) {
//                     if (newarr[i] >= 1 && newarr[i] <= N) {
//                         System.out.print(newarr[i] + " ");
//                     }
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }