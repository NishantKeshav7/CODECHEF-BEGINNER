import java.util.Scanner;

public class mathion_panagrams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int price[] = new int[26];
            for (int i = 0; i < 26; i++) {
                price[i] = input.nextInt();
            }
            int arr[] = new int[26];
            String str = input.next();
            for (int i = 0; i < str.length(); i++) {
                arr[str.charAt(i) - 97]++;
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    sum += price[i];
                }
            }
            System.out.println(sum);
        }
        input.close();
    }
}