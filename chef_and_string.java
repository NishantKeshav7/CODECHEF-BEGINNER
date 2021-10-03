import java.util.*;

public class chef_and_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            int count = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) != str.charAt(i + 1)) {
                    count++;
                    i++;
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}