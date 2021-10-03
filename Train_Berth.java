import java.util.Scanner;

public class Train_Berth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr1[] = new String[700];
        for (int i = 1; i < 690; i += 8) {
            arr1[i] = i + "LB"; // 1
            arr1[i + 1] = i + 1 + "MB"; // 2
            arr1[i + 2] = i + 2 + "UB"; // 3
            arr1[i + 3] = i + 3 + "LB"; // 4
            arr1[i + 4] = i + 4 + "MB"; // 5
            arr1[i + 5] = i + 5 + "UB"; // 6
            arr1[i + 6] = i + 6 + "SL"; // 7
            arr1[i + 7] = i + 7 + "SU"; // 8
        }
        String arr2[] = new String[700];
        for (int i = 1; i < 690; i += 8) {
            arr2[i] = arr1[i + 3]; // 1 = 4
            arr2[i + 1] = arr1[i + 1 + 3]; // 2 = 5
            arr2[i + 2] = arr1[i + 2 + 3]; // 3 = 6
            arr2[i + 3] = arr1[i + 3 - 3]; // 4 = 1
            arr2[i + 4] = arr1[i + 4 - 3]; // 5 = 2
            arr2[i + 5] = arr1[i + 5 - 3]; // 6 = 3
            arr2[i + 6] = arr1[i + 6 + 1]; // 7 = 8
            arr2[i + 7] = arr1[i + 7 - 1]; // 8 = 7
        }
        int t = input.nextInt();
        while (t-- > 0) {
            int num = input.nextInt();
            System.out.println(arr2[num]);
        }
        input.close();
    }
}
// 1LB
// 2MB
// 3UB
// 4LB
// 5MB
// 6UB
// 7SL
// 8SU
// 9LB
// 10MB
// 11UB
// 12LB
// 13MB
// 14UB
// 15SL
// 16SU
// 17LB
// 18MB
// 19UB
// 20LB
// 21MB
// 22UB
// 23SL
// 24SU
// 25LB
// 26MB
// 27UB
// 28LB
// 29MB
// 30UB
// 31SL
// 32SU
// 33LB
// 34MB
// 35UB
// 36LB
// 37MB
// 38UB
// 39SL
// 40SU
// 41LB
// 42MB
// 43UB
// 44LB
// 45MB
// 46UB
// 47SL
// 48SU
// 49LB
