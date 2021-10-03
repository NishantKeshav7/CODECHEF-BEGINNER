import java.util.*;

public class one_wierd_game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(2 * a * b - a - b);
            input.close();
        }
        input.close();
    }
}