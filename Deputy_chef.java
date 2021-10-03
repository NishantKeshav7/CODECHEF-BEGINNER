import java.util.Scanner;

public class Deputy_chef {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int attack[] = new int[n];
            int defence[] = new int[n];
            for (int i = 0; i < n; i++) {
                attack[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                defence[i] = input.nextInt();
            }
            int ans = -1;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    int front = attack[i + 1];
                    int back = attack[n - 1];
                    if (defence[i] > (front + back)) {
                        ans = Math.max(ans, defence[i]);
                    }
                } else if (i == n - 1) {
                    int front = attack[0];
                    int back = attack[n - 1 - 1];
                    if (defence[i] > (front + back)) {
                        ans = Math.max(ans, defence[i]);
                    }
                } else {
                    int front = attack[i + 1];
                    int back = attack[i - 1];
                    if (defence[i] > (front + back)) {
                        ans = Math.max(ans, defence[i]);
                    }
                }
            }
            System.out.println(ans);
        }
        input.close();
    }
}