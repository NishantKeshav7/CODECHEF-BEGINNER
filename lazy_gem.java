import java.util.Scanner;

public class lazy_gem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long question = input.nextLong();
            long br = input.nextLong();
            long minutes = input.nextLong();
            long middle = 0;
            long count = 0;
            while (question > 0) {
                if (question % 2 == 0) {
                    middle = question / 2;
                } else {
                    middle = (question + 1) / 2;
                }
                count += (middle * minutes);
                count += br;
                minutes *= 2;
                question = question - middle;
            }
            System.out.println(count - br);
        }
        input.close();
    }
}
// 131351258112
// 131351258112
