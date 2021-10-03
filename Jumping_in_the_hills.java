import java.util.Scanner;

public class Jumping_in_the_hills {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int u = input.nextInt();
            int d = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            int count = 1;
            boolean cond = true;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                } else if (arr[i] < arr[i+1]) {
                    if ((arr[i+1]-arr[i]) <= u) {
                        count++;
                    } else{
                        break;
                    }
                } else if (arr[i] > arr[i+1]) {
                    if ((arr[i]-arr[i+1]) <= d) {
                        count++;
                    } else if (cond) {
                        count++;
                        cond = false;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}
