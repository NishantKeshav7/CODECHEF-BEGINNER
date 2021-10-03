import java.util.Scanner;

public class CV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int num = input.nextInt();
            String str = input.next();
            int count = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
                        && str.charAt(i) != 'u') {
                    if (str.charAt(i + 1) == 'a' || str.charAt(i + 1) == 'e' || str.charAt(i + 1) == 'i'
                            || str.charAt(i + 1) == 'o' || str.charAt(i + 1) == 'u') {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
