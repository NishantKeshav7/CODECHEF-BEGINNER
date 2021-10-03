
import java.util.*;

public class football_match {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String arr[] = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.next();
            }
            Arrays.sort(arr);
            String temp = "";
            ArrayList<String> newarr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (!(arr[i].equals(temp))) {
                    newarr.add(arr[i]);
                    temp = arr[i];
                }
            }
            // System.out.println(newarr);
            int team1 = 0, team2 = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i].equals(newarr.get(0))) {
                    team1++;
                } else {
                    team2++;
                }
            }
            // System.out.println(team1 + " " + team2);
            if (team1 == team2) {
                System.out.println("Draw");
            } else if (team1 > team2) {
                System.out.println(newarr.get(0));
            } else {
                System.out.println(newarr.get(1));
            }
        }
        input.close();
    }
}