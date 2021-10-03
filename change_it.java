import java.util.*;

public class change_it {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int arr[] = new int[n];
            int count = 1;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            if (notEqual(arr)) {
                System.out.println(n - count);
            } else {
                count = 1;
                for (int i = 0; i < n - 1; i++) {
                    if (arr[i] != arr[i + 1])
                        count++;
                }
                int newarr[] = new int[count];
                int temp = 0;
                for (int i = 0, j = 0; i < n; i++) {
                    if (temp != arr[i]) {
                        newarr[j] = arr[i];
                        temp = arr[i];
                        j++;
                    }
                }
                int newarr2[] = new int[newarr.length];
                int greatest = 0;
                for (int i = 0; i < newarr.length; i++) {
                    newarr2[i] = isCount(arr, newarr[i]);
                    if (newarr2[i] > greatest) {
                        greatest = newarr2[i];
                    }
                }
                System.out.println(n - greatest);
            }
        }
    }

    static boolean notEqual(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static int isCount(int arr[], int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
            }
        }
        return count;
    }
}