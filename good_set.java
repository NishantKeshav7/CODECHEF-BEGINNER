import java.util.Scanner;

public class good_set {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print(((i*3)-1) + " ");
            }
            System.out.println();
        }
        input.close();
    }
}