import java.util.*;

public class chef_Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0 ; i < t ; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a == b) {
                System.out.println("=");
            } else if (a > b) {
                System.out.println(">");
            } else {
                System.out.println("<");
            }
        }
        input.close();
    }
}
