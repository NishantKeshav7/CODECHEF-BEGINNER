// import java.util.Scanner;

// public class what_inYour_name {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         try {
//             int t = input.nextInt();
//             while (t-- > 0) {
//                 String str = input.nextLine();
//                 String arr[] = str.split(" ");
//                 if (arr.length == 1) {
//                     String str3 = str.substring(1);
//                     System.out.println(Character.toUpperCase(str.charAt(0)) + str3.toLowerCase());
//                 } else {
//                     String str2 = "", str3 = arr[arr.length - 1].substring(1);
//                     for (int i = 0; i < arr.length - 1; i++) {
//                         str2 += (Character.toUpperCase(arr[i].charAt(0)) + ". ");
//                     }
//                     str2 += (Character.toUpperCase(arr[arr.length - 1].charAt(0)) + str3.toLowerCase());
//                     System.out.println(str2);
//                 }
//             }
//         } catch (Exception e) {
//         }
//     }
// }
import java.util.Scanner;

public class what_inYour_name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int t = input.nextInt();
            while (t-- > 0) {
                String str = input.nextLine();
                String str2 = "";
                String arr[] = str.split(" ");
                for (int i = 0; i < arr.length - 1; i++) {
                    str2 += Character.toUpperCase(arr[i].charAt(0)) + ". ";
                }
                String str3 = arr[arr.length - 1].substring(1);
                str2 += Character.toUpperCase(arr[arr.length - 1].charAt(0)) + str3.toLowerCase();
                System.out.println(str2);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}