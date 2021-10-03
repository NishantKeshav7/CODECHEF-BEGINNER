import java.util.Scanner;

public class truth_dare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n1 = input.nextInt();
            int truth[] = inputNum(input, n1);
            // for (int i = 0; i < n1; i++) {
            // truth[i] = input.nextInt();
            // }
            int n2 = input.nextInt();
            int dare[] = inputNum(input, n2);
            // for (int i = 0; i < n2; i++) {
            // dare[i] = input.nextInt();
            // }
            int n3 = input.nextInt();
            int arr1[] = inputNum(input, n3);
            // for (int i = 0; i < n3; i++) {
            // arr1[i] = input.nextInt();
            // }
            int n4 = input.nextInt();
            int arr2[] = inputNum(input, n4);
            // for (int i = 0; i < n4; i++) {
            // arr2[i] = input.nextInt();
            // }
            if (iscond(arr1, truth) && iscond(arr2, dare)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }

    public static boolean iscond(int arr[], int check[]) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (check(num, check) == false) {
                return false;
            }
        }
        return true;
    }

    // public static boolean iscond2(int arr[], int dare[]) {
    // for (int i = 0; i < arr.length; i++) {
    // int num = arr[i];
    // if (check(num, dare) == false) {
    // return false;
    // }
    // }
    // return true;
    // }
    public static boolean check(int num, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i])
                return true;
        }
        return false;
    }

    public static int[] inputNum(Scanner input, int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }
}