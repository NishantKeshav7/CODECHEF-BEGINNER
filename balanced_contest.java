import java.util.*;

class balanced_contest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int Q = input.nextInt();
            int p = input.nextInt();
            int cakewalk = (p / 2);
            int hard = (p / 10);
            int c = 0, h = 0;
            int arr[] = new int[Q];
            for (int i : arr) {
                arr[i] = input.nextInt();
                if (arr[i] <= hard) {
                    h++;
                } else if (arr[i] >= cakewalk) {
                    c++;
                }
            }
            if (c == 1 && h == 2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        input.close();
    }
}