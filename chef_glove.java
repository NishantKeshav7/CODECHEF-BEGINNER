import java.util.Scanner;

public class chef_glove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long arr1[] = new long[n], arr2[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = input.nextLong();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = input.nextLong();
            }
            int front = 0, back = 0;
            if (Front(arr1, arr2))
                front++;
            if (Back(arr1, arr2))
                back++;
            if (front > 0 && back > 0)
                System.out.println("both");
            else if (front > 0 && back == 0)
                System.out.println("front");
            else if (front == 0 && back > 0)
                System.out.println("back");
            else
                System.out.println("none");
        }
        input.close();
    }

    static boolean Front(long arr1[], long arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            if (!(arr1[i] <= arr2[i]))
                return false;
        }
        return true;
    }

    static boolean Back(long arr1[], long arr2[]) {
        for (int i = 0, j = arr1.length - 1; i < arr1.length; i++, j--) {
            if (!(arr1[j] <= arr2[i]))
                return false;
        }
        return true;
    }
}