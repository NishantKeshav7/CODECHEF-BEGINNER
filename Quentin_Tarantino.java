import java.util.Scanner;

public class Quentin_Tarantino {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            boolean cond1 = isSorted(arr), cond2 = isExtra(arr, n);
            if (cond1 && cond2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        input.close();
    }

    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExtra(int arr[], int num) {
        int newarr[] = new int[num+1];
        try {
            for (int i = 0 ; i < num ; i++) {
                newarr[arr[i]]++;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean isSorted2(int arr[]) {
        if (arr.length == 1) {
            return true;
        }
        if (arr.length == 2) {
            if (arr[0] <= arr[1]) {
                return true;
            } else {
                return false;
            }
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        int newarr[] = new int[arr.length - 1];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = arr[i + 1];
        }
        return isSorted2(newarr);
    }
}
// // import java.util.Arrays;
// import java.util.*;

// class tarantino {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// int t = input.nextInt();
// while (t-- > 0) {
// int n = input.nextInt();
// int[] arr = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = input.nextInt();
// }
// System.out.println(solve(arr, n));
// }
// }

// public static String solve(int[] arr, int n) {
// int[] newarr = new int[n];
// for (int i = 0; i < n; i++) {
// newarr[i] = i + 1;
// }
// if (Arrays.equals(arr, newarr))
// return "no";
// Arrays.sort(arr);
// return (Arrays.equals(arr, newarr)) ? "yes" : "no";
// }
// }
