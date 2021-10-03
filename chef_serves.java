import java.util.Scanner;

public class chef_serves {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int chef = input.nextInt(), cook = input.nextInt();
            int k = input.nextInt();
            int ans = ((chef + cook) / k) % 2;
            if (ans == 0) {
                System.out.println("CHEF");
            } else {
                System.out.println("COOK");
            }
        }
        input.close();
    }
}
