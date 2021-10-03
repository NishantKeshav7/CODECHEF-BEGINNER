import java.util.*;

public class Helping_chef {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int N = input.nextInt();
            if (N < 10) {
                System.out.println("Thanks for helping Chef!");
            } else {
                System.out.println(-1);
            }
        }
        input.close();
    }
}