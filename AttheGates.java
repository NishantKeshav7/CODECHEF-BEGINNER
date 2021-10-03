import java.util.*;

public class AttheGates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            char arr[] = new char[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.next().charAt(0);
            }
            int i = n - 1;
            while (i >= 0 && k-- > 0) {
                if (arr[i] == 'H') {
                    for (int j = 0; j < n; j++) {
                        if (arr[j] == 'H') {
                            arr[j] = 'T';
                        } else if (arr[j] == 'T') {
                            arr[j] = 'H';
                        }
                    }
                }
                arr[i] = '0';
                i--;
            }
            System.out.println(Count(arr));
        }
        input.close();
    }

    public static int Count(char arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'H') {
                count++;
            }
        }
        return count;
    }
}
