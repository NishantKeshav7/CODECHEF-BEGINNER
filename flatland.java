import java.util.*;

public class flatland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            int count = 0;
            while (N != 0) {
                int max = (int) Math.sqrt(N);
                count++;
                N = N - (max * max);
            }
            System.out.println(count);
        }
    }
}