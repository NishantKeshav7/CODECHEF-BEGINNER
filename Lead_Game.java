import java.util.Scanner;

public class Lead_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int arr[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int sum1 = 0, sum2 = 0;
        int Lead[] = new int[N];
        int player[] = new int[N];
        for (int i = 0; i < N; i++) {
            sum1 += arr[i][0];
            sum2 += arr[i][1];
            if (sum1 > sum2) {
                Lead[i] = (sum1 - sum2);
                player[i] = 1;
            } else if (sum1 < sum2) {
                Lead[i] = (sum2 - sum1);
                player[i] = 2;
            }
        }
        int maximum = Lead[0];
        for (int i = 0; i < N; i++) {
            if (Lead[i] > maximum) {
                maximum = Lead[i];
            }
        }
        int Number = 0;
        for (int i = 0; i < N; i++) {
            if (Lead[i] == maximum) {
                Number = i;
            }
        }
        System.out.println(player[Number] + " " + maximum);
        input.close();
    }
}
