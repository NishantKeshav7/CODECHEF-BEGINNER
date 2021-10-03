import java.util.Scanner;

public class ipl_rcb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int pointsNeed = input.nextInt();
            int matchesRemain = input.nextInt();
            if (pointsNeed > matchesRemain) {
                System.out.println(pointsNeed - matchesRemain);
            } else {
                System.out.println(0);
            }
        }
    }
}