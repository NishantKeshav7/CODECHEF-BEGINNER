import java.util.Scanner;

public class Block_breakers {
    public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while(t-- > 0) {
        int s = input.nextInt();
        int w1 = input.nextInt();
        int w2 = input.nextInt();
        int w3 = input.nextInt();
        if (s >= (w1 + w2 + w3)) {
            System.out.println(1);
        } else if ((s >= (w1 + w2)) || (s >= (w2 + w3))) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
    input.close();    
    }
}