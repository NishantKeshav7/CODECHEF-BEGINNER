import java.util.Scanner;

public class new_tablet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            int totalb = input.nextInt();
            int maxarea = 0;
            for (int i = 1; i <= N; i++) {
                int width = input.nextInt();
                int height = input.nextInt();
                int price = input.nextInt();
                if (price > totalb) {
                    continue;
                }
                if (width * height > maxarea) {
                    maxarea = width * height;
                }
            }
            if (maxarea == 0) {
                System.out.println("no tablet");
            } else {
                System.out.println(maxarea);
            }
        }
    }
}
