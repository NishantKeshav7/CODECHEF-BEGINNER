import java.util.Scanner;

public class minimum_attendance_required {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int length = input.nextInt();
            String str = input.next();
            int count = 0;
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == '0')
                    count++;
            }
            double present = 120 - count;
            double percent = (present / 120) * 100;
            if (percent >= 75.0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
