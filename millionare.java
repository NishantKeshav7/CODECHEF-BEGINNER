import java.util.Scanner;

public class millionare{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        try {
            int t = input.nextInt();
            while (t-- > 0) {
                input.nextLine();
                int n = input.nextInt();
                String str1 = input.next();
                String str2 = input.next();
                char arr1[] = str1.toCharArray();
                char arr2[] = str2.toCharArray();
                int newarr[] = new int[n + 1];
                for (int i = 0; i <= n; i++) {
                    newarr[i] = input.nextInt();
                }
                int correctCount = 0;
                for (int i = 0; i < n; i++) {
                    if (arr1[i] == arr2[i])
                        correctCount++;
                }
                if (correctCount == n) {
                    System.out.println(newarr[correctCount]);
                } else {
                    int max = newarr[0];
                    for (int i = 0; i <= correctCount; i++) {
                        max = Math.max(max, newarr[i]);
                    }
                    System.out.println(max);
                }
            }
        } catch (

        Exception e) {

        }
    }
}