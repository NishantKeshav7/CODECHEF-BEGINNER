import java.util.Scanner;

public class ada_crayons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            char arr[] = str.toCharArray();
            int count = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] != arr[i + 1])
                    count++;
            }
            System.out.println((count + 1) / 2);
        }
        input.close();
    }
}
