import java.util.Scanner;

public class Fancy_Quotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String str = input.nextLine();
            String arr[] = str.split(" ");
            boolean cond = false;
            for (int i = 0; i < arr.length; i++) {
                if ("not".equals(arr[i])) {
                    cond = true;
                    break;
                }
            }
            if (cond) {
                System.out.println("Real Fancy");
            } else {
                System.out.println("regularly fancy");
            }
        }
        input.close();
    }
}