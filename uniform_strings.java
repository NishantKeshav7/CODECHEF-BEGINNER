import java.util.*;

public class uniform_strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            int count = 0;
            for (int i = 0; i < 8 - 1; i++) {
                if ((str.charAt(i) == '1' && str.charAt(i + 1) == '0')
                        || (str.charAt(i) == '0' && str.charAt(i + 1) == '1')) {
                    count++;
                }
            }
            if (str.charAt(0) != str.charAt(7)) {
                count++;
            }
            if (count > 2) {
                System.out.println("non-uniform");
            } else {
                System.out.println("uniform");
            }
        }
        input.close();
    }
}