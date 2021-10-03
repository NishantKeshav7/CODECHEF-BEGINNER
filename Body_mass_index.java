import java.util.Scanner;

public class Body_mass_index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int m = input.nextInt();
            int h = input.nextInt();
            int BMI = (int) (m / (Math.pow(h, 2)));
            int ans = -1;
            if (BMI <= 18) {
                ans = 1;
            } else if (BMI >= 19 && BMI <= 24) {
                ans = 2;
            } else if (BMI >= 25 && BMI <= 29) {
                ans = 3;
            } else {
                ans = 4;
            }
            System.out.println(ans);
        }
        input.close();
    }
}
