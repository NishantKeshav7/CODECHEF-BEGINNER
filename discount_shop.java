import java.util.*;

public class discount_shop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long num = input.nextLong();
            String str = new String(num + "");
            ArrayList<Long> list = new ArrayList<Long>();
            for (int i = 0; i < str.length(); i++) {
                String str1 = str.substring(0, i) + (str.substring(i + 1, str.length()));
                long n = Long.parseLong(str1);
                list.add(n);
            }
            Collections.sort(list);
            System.out.println(list.get(0));
        }
        input.close();
    }
}