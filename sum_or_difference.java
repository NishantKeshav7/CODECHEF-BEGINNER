import java.util.Scanner;
public class sum_or_difference {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int N1 = input.nextInt();
        int N2 = input.nextInt();
        if (N1 > N2) {
            System.out.println(N1 - N2);
        } else {
            System.out.println(N1 + N2);
        }
        input.close();
    }
}
