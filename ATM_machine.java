import java.util.Scanner;

public class ATM_machine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt(); // total number of people = N
            int k = input.nextInt(); // Total units of Money
            String str = "";
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < N; i++) {
                if (k >= arr[i]) {
                    str += '1';
                    k = k - arr[i];
                } else {
                    str += '0';
                }
            }
            System.out.println(str);
        }
    }
}
