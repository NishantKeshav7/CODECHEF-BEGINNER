import java.util.Scanner;

public class Chef_fruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int oranges = input.nextInt();
            int apples = input.nextInt();
            int gold = input.nextInt();
            int min = Math.min(oranges, apples);
            int max = Math.max(oranges, apples);
            for (int i = 1; i <= gold; i++) {
                if (i % 2 == 1) {
                    min++;
                } else {
                    max++;
                }
            }
            System.out.println(max - min);

        }
    }
}