import java.util.Scanner;

public class chef_steps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong();
            long k = input.nextLong();
            String str = "";
            long arr[] = new long[(int) n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextLong();
                if (arr[i] % k == 0) {
                    str += "1";
                } else {
                    str += "0";
                }
            }
            System.out.println(str);
        }
        input.close();
    }
}