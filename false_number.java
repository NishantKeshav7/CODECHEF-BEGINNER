import java.util.Scanner;

public class false_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String num = input.next();
            String str = "";
            if (num.charAt(0) > '1') {
                str += "1" + num;
            } else {
                str += num.substring(0, 1) + "0" + num.substring(1);
            }
            System.out.println(str);
        }
    }
}