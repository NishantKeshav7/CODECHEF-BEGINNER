import java.util.*;

public class chef_fantasy_league {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int price = input.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = input.nextInt();
            }
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (arr2[i] == 0) {
                    list1.add(arr1[i]);
                } else if (arr2[i] == 1) {
                    list2.add(arr1[i]);
                }
            }
            // for (int i = 0; i < list1.size(); i++) {
            // System.out.print(list1.get(i) + " ");
            // }
            // System.out.println();
            // for (int i = 0; i < list2.size(); i++) {
            // System.out.print(list2.get(i) + " ");
            // }
            boolean cond = false;
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    if ((price + list1.get(i) + list2.get(j)) <= 100) {
                        cond = true;
                        break;
                    }
                }
                if (cond == true) {
                    break;
                }
            }
            if (cond) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        input.close();
    }
}