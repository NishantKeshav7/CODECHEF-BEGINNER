import java.util.Scanner;

public class Passing_marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int Amin = input.nextInt();
            int Bmin = input.nextInt();
            int Cmin = input.nextInt();
            int Tmin = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if (a >= Amin && b >= Bmin && c >= Cmin && (Tmin >= (a + b + c))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}