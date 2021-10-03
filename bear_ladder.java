import java.util.Scanner;

public class bear_ladder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long a = input.nextLong();
            long b = input.nextLong();
            if (a == 1) {
                if (a == 1 && b == 2) {
                    System.out.println("YES");
                } else if (a == 1 && b == 3) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else if (a == 2) {
                if (a == 2 && b == 1) {
                    System.out.println("YES");
                } else if (a == 2 && b == 4) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else if (a % 2 == 1) {
                if ((a - 2) == b) {
                    System.out.println("YES");
                } else if ((a + 1) == b) {
                    System.out.println("YES");
                } else if ((a + 2) == b) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else if (a % 2 == 0) {
                if ((a - 2) == b) {
                    System.out.println("YES");
                } else if ((a - 1) == b) {
                    System.out.println("YES");
                } else if ((a + 2) == b) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}