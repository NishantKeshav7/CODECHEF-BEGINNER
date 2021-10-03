// import java.util.Scanner;

// public class tickets {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         while (t-- > 0) {
//             String str = input.next();
//             boolean cond = true;
//             if (str.charAt(0) == str.charAt(1)) {
//                 cond = false; //
//             } else {
//                 for (int i = 0; i < str.length()- 2; i++) {
//                     if (str.charAt(i) != str.charAt(i + 2)) {
//                         cond = false;
//                         break; //
//                     }
//                 }
//             }
//             if (cond) {
//                 System.out.println("YES");
//             } else {
//                 System.out.println("NO");
//             }
//         }
//         input.close();
//     }
// }
import java.util.*;

public class tickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            char chArr[] = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                chArr[i] = str.charAt(i);
            }
            Arrays.sort(chArr);
            int count = 1;
            for (int i = 0; i < str.length() - 1; i++) {
                if (chArr[i] != chArr[i + 1]) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println("NO");
            } else {
                boolean cond = true;
                for (int i = 0; i < str.length() - 1; i++) {
                    if (str.charAt(i) == str.charAt(i + 1)) {
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
        }
        input.close();
    }
}