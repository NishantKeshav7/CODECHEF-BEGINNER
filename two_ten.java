import java.util.Scanner;

public class two_ten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long num = input.nextLong();
            // long num2 = num;
            if ((num % 10) == 0 || (num % 10) == 5) {
                int count = 0;
                for (; true;) {
                    if (num % 10 == 0) {
                        break;
                    }
                    num = num * 2;
                    count++; //
                }
                System.out.println(count);
            } else {
                System.out.println(-1);
            }
        }
    }
}