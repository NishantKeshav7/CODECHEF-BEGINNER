import java.util.Scanner;

public class chef_mean {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0) {
            int n = input.nextInt();
            long arr[] = new long[n];
            long sum = 0;
            for (int i = 0 ; i < n ; i++) {
                arr[i] = input.nextLong();
                sum += arr[i];
            }
            if (sum % n != 0) {
                System.out.println("Impossible");
                continue;
            }
            long Mean = sum / n;
            int found = -1;
            for (int i = 0 ; i < n ; i++) {
                if ((sum - arr[i]) % (n-1) != 0) {
                    continue;
                }
                if (((sum - arr[i]) / (n-1)) == Mean) {
                    found = i+1;
                    break;
                }
            }
            if (found != -1) {
                System.out.println(found);
            } else {
                System.out.println("Impossible");
            }
        }
        input.close();
    }
}