import java.util.Scanner;
public class Priya_AND {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0) {
            int n = input.nextInt();
            int arr[]= new int[n + 1];
            for (int i = 1 ; i <= n ; i++) {
                arr[i] = input.nextInt();
            }
            int count = 0;
            for (int i = 1 ; i <= n ; i++) {
                for (int j = 1 ; j <= n ; j++) {
                    if (i < j) {
                        if ((arr[i]&arr[j]) == arr[i]) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}