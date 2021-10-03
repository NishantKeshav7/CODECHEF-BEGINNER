import java.util.Scanner;
public class Mahasena {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int arr[] = new int[N];
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = input.nextInt();
        }
        int lucky = 0; int unlucky = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] % 2 == 0) {
                lucky++; //
            } else {
                unlucky++; //
            }
        }
        if (lucky > unlucky) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }
        input.close();
    }
}