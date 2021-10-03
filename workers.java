import java.util.*;

public class workers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // try {
        // int n = input.nextInt();
        // int arr1[] = new int[n];
        // int arr2[] = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr1[i] = input.nextInt();
        // }
        // for (int i = 0; i < n; i++) {
        // arr2[i] = input.nextInt();
        // }
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        // if (arr2[i] == 1) {
        // list1.add(arr1[i]);
        // } else if (arr2[i] == 2) {
        // list2.add(arr1[i]);
        // } else if (arr2[i] == 3) {
        // list3.add(arr1[i]);
        // }
        // }
        // Collections.sort(list1);
        // Collections.sort(list2);
        // int sum = list1.get(0) + list2.get(0);
        // for (int i = 0; i < list3.size(); i++) {
        // sum = Math.min(sum, list3.get(i));
        // }
        // System.out.println(sum);
        // } catch (Exception e) {
        // }
        int n = input.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        boolean cond[] = new boolean[3];
        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextInt();
            if (arr2[i] == 1) {
                cond[0] = true;
                a = Math.min(a, arr1[i]);
            } else if (arr2[i] == 2) {
                cond[1] = true;
                b = Math.min(b, arr1[i]);
            } else {
                cond[2] = true;
                c = Math.min(c, arr1[i]);
            }
        }
        if (cond[0] && cond[1]) {
            System.out.println(Math.min((a + b), c));
        } else {
            System.out.println(c);
        }
    }
}
