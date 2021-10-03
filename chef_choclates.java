import java.util.Scanner;

public class chef_choclates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            if (isEqual(n, m)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        input.close();
    }

    static boolean isEqual(int n, int m) {
        return (n % 2 == 0 || m % 2 == 0);
    }
}
