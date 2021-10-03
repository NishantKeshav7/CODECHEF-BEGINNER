import java.util.Scanner;

public class cakewalk_problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            boolean cond = true;
            int arr[][] = new int[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    arr[i][j] = input.nextInt();
                }
            }
            int count = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (arr[i][j] < 1 || arr[i][j] > 60) {
                        cond = false;
                        break;
                    } else if (arr[i][j] >= 1 && arr[i][j] <= 30) {
                        count++;
                    }
                }
                if (cond == false) {
                    break;
                }
            }
            if (cond == false) {
                System.out.println("no");
            } else {
                if (count >= 60) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
        input.close();
    }
}