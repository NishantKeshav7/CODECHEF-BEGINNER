import java.util.Scanner;

public class puppy_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int d = input.nextInt();
            int n = input.nextInt();
            int sum = 0;
            for (int j = 0; j < d; j++) {
                sum = Add(n);
                n = sum;
            }
            System.out.println(sum);
        }
        input.close();
    }

    public static int Add(int N) {
        int sum = 0;
        for (int i = N; i >= 0; i--) {
            sum += i;
        }
        return sum;
    }
}
