package CodechefEasy;

import java.util.*;

public class maximum_value {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while (t-- > 0) {
            String sc = s.nextLine();
            Scanner s2 = new Scanner(sc);
            ArrayList<Integer> list = new ArrayList<>();
            while (s2.hasNextInt()) {
                list.add(s2.nextInt());
            }

            list.remove(new Integer(list.size() - 1));

            Collections.sort(list);
            System.out.println(list.get(list.size() - 1));
        }
    }
}
