import java.util.Scanner;
public class Greedy_puppy {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int A = input.nextInt();
            int B = input.nextInt();
            int max = 0;
            for (int i = 2 ; i <= B ; i++) {
                if ((A%i) > max) {
                    max = A % i;
                }
            }
            System.out.println(max);
        }
    }
}
