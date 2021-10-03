// import java.util.Scanner;

// public class Ciel_Recipt {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         for (int i = 0; i < t; i++) {
//             int[] price = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 1024, 2048 };
//             int N = input.nextInt();
//             if (N == price[0] || N == price[1] || N == price[2] || N == price[3] || N == price[4] || N == price[5]
//                     || N == price[6] || N == price[7] || N == price[8] || N == price[9] || N == price[10]) {
//                 System.out.println(1);
//             } else if (N > 2048) {
//                 if (N % 2048 == 0) {
//                     System.out.println(N / 2048);
//                 } else {
//                     int number = N;
//                     int count = 0;
//                     while (N > 2048) {
//                         count++;
//                         N = N - 2048;
//                     }
//                     number = number % 2048;
//                     if (isNumberAvailable(price, number)) {
//                         System.out.println(count + 1);
//                     } else if (number % 2 == 0) {
//                         System.out.println(count + isEven(price, number));
//                     } else {
//                         System.out.println(count + isOdd(price, number));
//                     }
//                 }
//             } else if (N < 2048) {
//                 if (N % 2 == 1) {
//                     System.out.println(isOdd(price, N));
//                 } else {
//                     System.out.println(isEven(price, N));
//                 }
//             }
//         }
//     }

//     public static int isEven(int price[], int N) {
//         int count = 0;
//         for (int i = 0; i < price.length; i++) {
//             if (price[i] < N) {
//                 count++;
//             }
//         }
//         return (N % count);
//     }

//     public static int isOdd(int price[], int N) {
//         int count = 0;
//         for (int i = 0; i < price.length; i++) {
//             if (price[i] < N) {
//                 count++; //
//             }
//         }
//         return (count);
//     }

//     public static boolean isNumberAvailable(int price[], int N) {
//         for (int i = 0; i < price.length; i++) {
//             if (price[i] == N) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
import java.util.Scanner;

public class Ciel_Recipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int p = input.nextInt();
            int menuNum = 0;
            for (int price = 2048; price != 0; price /= 2) {
                menuNum += p / price;
                p %= price;
            }
            System.out.println(menuNum);
        }
        input.close();
    }
}