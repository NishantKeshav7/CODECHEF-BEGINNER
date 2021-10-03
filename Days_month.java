import java.util.Scanner;

public class Days_month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strarr[] = { "mon", "tues", "wed", "thurs", "fri", "sat", "sun" };
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String str = input.next();
            int arr[] = new int[7];
            for (int i = 1, j = pos(str, strarr); i <= n; i++) {
                arr[j % 7] += 1;
                j++;
            }
            for (int i = 0; i < 7; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        input.close();
    }

    static int pos(String str, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i])) {
                return i;
            }
        }
        return 0;
    }
}