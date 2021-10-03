import java.util.Scanner;

public class brackets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            char arr[] = str.toCharArray();
            int k = count(arr);
            for (int i = 0; i < k; i++) {
                System.out.print("(");
            }
            for (int i = 0; i < k; i++) {
                System.out.print(")");
            }
            System.out.println();
        }
        input.close();
    }

    static int count(char arr[]) {
        int balance = 0, max_balance = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                balance++;
            } else {
                balance--;
            }
            max_balance = (Math.max(balance, max_balance));
        }
        return max_balance;
    }
}
