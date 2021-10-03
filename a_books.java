import java.util.Scanner;

public class a_books {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            int arr2[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = getCount(arr, arr[i]);
                System.out.print(arr2[i] + " ");
            }
            System.out.println();
        }
        input.close();
    }

    static int getCount(int arr[], int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                count++;
            }
        }
        return count;
    }
}