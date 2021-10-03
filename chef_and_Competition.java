import java.util.Scanner;

public class chef_and_Competition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            int arr1[] = new int[N];
            int arr2[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr1[i] = input.nextInt();
            }
            for (int i = 0; i < N; i++) {
                arr2[i] = input.nextInt();
            }
            int g1 = indexof(arr1);
            int g2 = indexof(arr2);
            arr1[g1] = 0;
            arr2[g2] = 0;
            // for (int i = 0; i < N; i++) {
            // System.out.print(arr1[i] + " ");
            // }
            // System.out.println();
            // for (int i = 0; i < N; i++) {
            // System.out.print(arr2[i] + " ");
            // }
            int alice = 0, bob = 0;
            for (int i = 0; i < N; i++) {
                alice += arr1[i];
                bob += arr2[i];
            }
            if (bob < alice) {
                System.out.println("Bob");
            } else if (alice < bob) {
                System.out.println("Alice");
            } else {
                System.out.println("Draw");
            }
        }
        input.close();
    }

    public static int indexof(int[] arr) {
        int index = 0;
        int greatest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
                index = i;
            }
        }
        return index;
    }
}
