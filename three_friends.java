import java.util.Scanner;

public class three_friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            if (x + y - z == 0 || x + z - y == 0 || y + z - x == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        input.close();
    }
}