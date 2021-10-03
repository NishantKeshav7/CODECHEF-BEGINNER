import java.util.Scanner;

public class play_piano {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            boolean cond = true;
            for (int i = 0; i < str.length(); i += 2) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    cond = false;
                    break;
                }
            }
            if (cond) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
