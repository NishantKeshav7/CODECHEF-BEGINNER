import java.util.Scanner;

public class chef_friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c = "chef";
        int count = 0;
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            for (int i = 0; i < str.length() - 1; i++) {
                String str2 = str.substring(i, i + 2);
                if (c.contains(str2)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        input.close();
    }
}
