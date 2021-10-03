import java.util.Scanner;

public class Chef_Remissness {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = Math.max(a, b);
            int d = a + b;
            System.out.println(c + " " + d);
        }
        input.close();
    }
}
