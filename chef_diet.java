import java.util.Scanner;

public class chef_diet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int a = input.nextInt();
            int k = input.nextInt();
            int arr[] = new int[a + 1];
            for (int i = 0; i < a; i++) {
                arr[i] = input.nextInt();
            }
            boolean cond = true;
            int diff = 0;
            int index = 0;
            for (int i = 0; i < a; i++) {
                if (arr[i] >= k) {
                    diff = arr[i] - k;
                    arr[i + 1] = arr[i + 1] + diff;
                    cond = true;
                }
                if (arr[i] < k) {
                    index = i;
                    index++;
                    cond = false;
                    break;
                }
            }
            if (cond && index == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO " + index);
            }
        }
        input.close();
    }
}