import java.util.Scanner;

public class lucky_four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long num = input.nextLong();
            String str = new String(num + "");
            long count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '4') {
                    count++;
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}
