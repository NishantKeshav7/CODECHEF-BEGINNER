import java.util.Scanner;

public class chef_ipcCertificates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        int count = 0;
        while (n-- > 0) {
            int arr[] = new int[k];
            int sum = 0;
            for (int i = 0; i < k; i++) {
                arr[i] = input.nextInt();
                sum += arr[i];
            }
            int num = input.nextInt();
            if (sum >= m && num <= 10) {
                count++;
            }
        }
        System.out.println(count);

    }
}
