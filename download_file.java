import java.util.Scanner;

public class download_file {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            int A = input.nextInt();
            int totaldata = 0;
            int freedata = 0;
            for (int i = 0; i < N; i++) {
                int a = input.nextInt();
                int b = input.nextInt();
                totaldata += (a * b);
                for (int j = 0; j < (Math.min(A, a)); j++) {
                    freedata += b;
                }
                A -= a;
            }
            System.out.println(totaldata - freedata);
        }
    }
}
