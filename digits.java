import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String str = num + "";
        if (str.length() > 3) {
            System.out.println("More than 3 digits");
        } else
            System.out.println(str.length());
    }
}