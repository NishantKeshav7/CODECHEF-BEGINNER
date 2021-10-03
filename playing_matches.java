import java.util.Scanner;

public class playing_matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
        int t = input.nextInt();
        while (t-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int Num = a + b;
            int count = 0;
            while (Num != 0) {
                int rem = Num % 10;
                count += arr[rem];
                Num = Num / 10;
            }
            System.out.println(count);
        }
    }
}
