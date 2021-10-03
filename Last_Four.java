import java.util.Scanner;

public class Last_Four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int j = 0; j < T; j++) {
            int num = input.nextInt();
            int n = num;
            int count = 0;
            while (num > 0) {
                int rem1 = num % 10;
                count++;
                num = num / 10;
            }
            int arr[] = new int[count];
            for (int i = 0; i < arr.length; i++) {
                int rem2 = n % 10;
                arr[i] = rem2;
                n = n / 10;
            }
            count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 4) {
                    count++;
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}