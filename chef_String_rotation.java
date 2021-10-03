import java.util.Scanner;

public class chef_String_rotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            String str1 = (str.substring(1) + str.substring(0, 1));
            String str2 = (str.charAt(str.length() - 1) + str.substring(0, str.length() - 1));
            if (str1.equals(str2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}