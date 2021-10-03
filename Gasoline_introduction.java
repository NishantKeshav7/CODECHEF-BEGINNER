import java.util.Scanner;

public class Gasoline_introduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            int gas = arr[0], dist = 0;
            for (int i = 1; i < n; i++) {
                if (gas == 0) {
                    break;
                }
                dist++;
                gas = (gas - 1) + (arr[i]);
            }
            System.out.println(gas + dist);
        }
        input.close();
    }
}
