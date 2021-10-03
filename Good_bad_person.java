import java.util.Scanner;

public class Good_bad_person {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            String str = input.next();
            int lowercase = 0, uppercase = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    lowercase++;
                } else {
                    uppercase++;
                }
            }
            int chef = str.length() - lowercase;
            int brother = str.length() - uppercase;
            if (k >= chef && k >= brother) {
                System.out.println("both");
            } else if (k >= chef) {
                System.out.println("chef");
            } else if (k >= brother) {
                System.out.println("brother");
            } else {
                System.out.println("none");
            }
        }
        input.close();
    }
}