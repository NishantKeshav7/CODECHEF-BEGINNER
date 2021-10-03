import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final long M = 1000000007;
        long arr[] = new long[10000000];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 9) {
                arr[i] = i;
            } else {
                long n = i;
                String str1 = n + "";
                String str2 = reverse(str1.substring(0, str1.length() - 1));
                n = Long.parseLong(str1 + str2);
                arr[i] = n;
            }
        }
        int l = input.nextInt();
        int r = input.nextInt();
        long sum = 1;
        for (int i = l + 1; i <= r; i++) {
            long s = (long) ((Math.pow(arr[l], arr[i])) % M);
            sum = sum * (s % M);
        }
        System.out.println(sum % M);
    }

    static String reverse(String str) {
        if (str.length() == 1) {
            return str.charAt(0) + "";
        }
        String str2 = str.substring(0, str.length() - 1);
        return str.charAt(str.length() - 1) + reverse(str2);
    }
}
