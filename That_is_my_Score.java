import java.util.*;

public class That_is_my_Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int number = input.nextInt();
            int arr[][] = new int[number][2];
            int num[] = new int[number];
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < number; i++) {
                num[i] = arr[i][0];
            }
            Arrays.sort(num);
            if (isEqual(num) && num.length > 1) {
                int n1 = num[0];
                int sum = isvailable(n1, arr);
                System.out.println(sum);
            } else {
                int sum = 0;

                for (int i = 0; i < number - 1; i++) {
                    if ((num[i] != num[i + 1])) {
                        if (num[i] >= 1 && num[i] <= 8)
                            sum += isvailable(num[i], arr);
                    }
                }
                if (isAvail(num[number - 1], num)) {
                    if (num[number - 1] >= 1 && num[number - 1] <= 8)
                        sum += isvailable(num[number - 1], arr);
                }
                System.out.println(sum);
            }
        }
        input.close();
    }

    public static boolean isAvail(int num, int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (num == arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static int isvailable(int num, int arr[][]) {
        int greatest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == num) {
                if (arr[i][1] > greatest) {
                    greatest = arr[i][1];
                }
            }
        }
        return greatest;
    }

    public static boolean isEqual(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}