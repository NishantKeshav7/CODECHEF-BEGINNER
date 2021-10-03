import java.util.Scanner;

public class Studying_alphabets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        int t = input.nextInt();
        while (t-- > 0) {
            String str2 = input.next();
            int count = 0;
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        count++;
                    }
                }
            }
            if (count == str2.length()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}