import java.util.*;

public class robot_testing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong();
            long x = input.nextLong();
            ArrayList<Long> newarr = new ArrayList<>();
            newarr.add(x);
            String str = input.next();
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == 'R') {
                    x += 1;
                    newarr.add(x);
                } else {
                    x -= 1;
                    newarr.add(x);
                }
            }
            // System.out.println(newarr);
            newarr.sort(Comparator.naturalOrder());
            long count = 0, temp = Long.MIN_VALUE;
            for (int i = 0; i < newarr.size(); i++) {
                if (temp != newarr.get(i)) {
                    count++;
                    temp = newarr.get(i);
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}