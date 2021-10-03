import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int N = input.nextInt();
            if (N == 0) {
                input.close();
                break;
            } else {
                int arr[] = new int[N + 1];
                for (int j = 1; j <= N; j++) {
                    arr[j] = input.nextInt();
                }
                int newarr[] = new int[N + 1];
                for (int j = 1; j <= N; j++) {
                    newarr[arr[j]] = j;
                }
                if (isAmbigious(arr, newarr)) {
                    System.out.println("ambiguous");
                } else {
                    System.out.println("not ambiguous");
                }
            }
        }
    }

    public static boolean isAmbigious(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}