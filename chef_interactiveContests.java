import java.util.Scanner;

public class chef_interactiveContests {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] >= r) {
                System.out.println("Good boi");
            } else {
                System.out.println("Bad boi");
            }
        }
        input.close();
    }
}