import java.util.Scanner;

public class three_game_comm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int number = input.nextInt();
            int arr[][] = new int[3][2];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = input.nextInt();
                }
            }
            double n1 = distance(arr[0][0], arr[1][0], arr[0][1], arr[1][1]);
            double n2 = distance(arr[1][0], arr[2][0], arr[1][1], arr[2][1]);
            double n3 = distance(arr[0][0], arr[2][0], arr[0][1], arr[2][1]);
            if (n1 <= number && n2 <= number && n3 <= number) {
                System.out.println("yes");
            } else if (n1 <= number && n2 <= number) {
                System.out.println("yes");
            } else if (n2 <= number && n3 <= number) {
                System.out.println("yes");
            } else if (n3 <= number && n1 <= number) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static double distance(int x1, int x2, int y1, int y2) {
        double dis = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return dis;
    }
}
