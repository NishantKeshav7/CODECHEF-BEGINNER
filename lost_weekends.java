import java.util.Scanner;

public class lost_weekends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int arr[] = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = input.nextInt();
            }
            int d = input.nextInt();
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += (arr[i] * d);
            }
            if (sum > (24 * 5)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        input.close();
    }
}