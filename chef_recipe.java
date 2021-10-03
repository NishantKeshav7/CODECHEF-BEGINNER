import java.util.*;

public class chef_recipe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            int freq[] = new int[1001];
            for (int i = 0; i < n; i++) {
                freq[arr[i]]++;
            }
            boolean cond1 = false;
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < 1001; i++) {
                if (freq[i] > 0) {
                    list.add(freq[i]);
                }
            }
            Collections.sort(list);
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) == list.get(i + 1)) {
                    cond1 = true;
                    break;
                }
            }
            // System.out.println(list);
            if (cond1) {
                System.out.println("NO");
            } else {
                boolean cond2 = true;
                boolean visit[] = new boolean[1001];
                visit[arr[0]] = true;
                for (int j = 1; j < n; j++) {
                    if (arr[j] == arr[j - 1])
                        continue;
                    if (visit[arr[j]] == true) {
                        cond2 = false;
                        break;
                    }
                    visit[arr[j]] = true;
                }
                if (cond2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        input.close();
    }
}