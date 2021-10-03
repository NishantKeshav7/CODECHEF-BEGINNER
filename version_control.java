import java.util.Scanner;

public class version_control {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            int length1 = input.nextInt();
            int length2 = input.nextInt();
            int arr1[] = new int[length1];
            int arr2[] = new int[length2];
            for (int i = 0; i < length1; i++) {
                arr1[i] = input.nextInt();
            }
            for (int i = 0; i < length2; i++) {
                arr2[i] = input.nextInt();
            }
            int max = 0, mid = 0, min = 0;
            for (int i = 1; i <= N; i++) {
                if (isnumarr1(arr1, i) && isnumarr2(arr2, i)) {
                    max++; //
                } else if (isnumarr1(arr1, i) || isnumarr2(arr2, i)) {
                    mid++; //
                } else {
                    min++;
                }
            }
            System.out.println(max + " " + min);
        }
    }

    public static boolean isnumarr1(int arr[], int num) {
        boolean cond = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                cond = true;
                break;
            }
        }
        return cond;
    }

    public static boolean isnumarr2(int arr[], int num) {
        boolean cond = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                cond = true;
                break;
            }
        }
        return cond;
    }
}