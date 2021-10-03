import java.util.*;

public class Scholarship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        if (num <= 50) {
            System.out.println("100");
        } else if (num <= 100 ) {
            System.out.println("50");
        } else {
            System.out.println("0");
        }
    }
}
