import java.util.Scanner;

public class increANDdecre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (N % 4 == 0) {
            System.out.println(N + 1);
        } else {
            System.out.println(N - 1);
        }
        input.close();
    }
}
