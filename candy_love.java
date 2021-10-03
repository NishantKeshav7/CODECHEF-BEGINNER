import java.util.Scanner;

public class candy_love {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt(), sum = 0;
            int arr[] = new int[n];
            for (int i : arr) {
                arr[i] = input.nextInt();
                sum += arr[i];
            }
            if (sum % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }
        input.close();
    }
}