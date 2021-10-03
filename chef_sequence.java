import java.util.Scanner;

public class chef_sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            long arr1[] = new long[N];
            for (int i = 0; i < N; i++) {
                arr1[i] = input.nextLong();
            }
            int M = input.nextInt();
            long arr2[] = new long[M];
            for (int i = 0; i < M; i++) {
                arr2[i] = input.nextLong();
            }
            long count = 0;
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if (arr2[i] == arr1[j]) {
                        count++;
                    }
                }
            }
            if (count == arr2.length) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}