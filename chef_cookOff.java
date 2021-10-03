import java.util.*;
public class chef_cookOff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int arr[] = new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Beginner");
            } else if (count == 1) {
                System.out.println("Junior Developer");
            } else if (count == 2) {
                System.out.println("Middle Developer");
            } else if (count == 3) {
                System.out.println("Senior Developer");
            } else if (count == 4) {
                System.out.println("Hacker");
            } else {
                System.out.println("Jeff Dean");
            }
        }
    }
}
