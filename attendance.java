import java.util.Scanner;

public class attendance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            String arr[][] = new String[N][2];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = input.next();
                }
            }
            boolean cond[] = new boolean[N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (arr[i][0].equals(arr[j][0]) && (i != j)) {
                        cond[i] = true;
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                if (cond[i]) {
                    System.out.println(arr[i][0] + " " + arr[i][1]);
                } else {
                    System.out.println(arr[i][0]);
                }
            }
        }
        input.close();
    }
}
