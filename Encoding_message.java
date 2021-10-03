import java.util.Scanner;

public class Encoding_message {
    public static void main(String[] args) {
        char arr[] = new char[26];
        for (int i = 0; i < 26; i++) {
            if (i == 0) {
                arr[i] = 'a';
            } else {
                arr[i] = (char) (arr[i - 1] + 1);
            }
            // System.out.println(arr[i] + " ");
        }
        char arr2[] = new char[26];
        for (int i = 0, j = 25; i < 26; i++, j--) {
            arr2[i] = arr[j];
            // System.out.print(arr2[i] + " ");
        }
        //
        //
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String str = input.next();
            int length = str.length();
            if (str.length() % 2 == 1) {
                length = str.length() - 1; //
            }
            String str2 = "";
            for (int i = 0; i < length; i += 2) {
                char ch1 = str.charAt(i);
                char ch2 = str.charAt(i + 1);
                char temp = ch1;
                ch1 = ch2;
                ch2 = temp;
                str2 += ch1 + "" + ch2;
            }
            if (str.length() % 2 == 1) {
                str2 += str.charAt(str.length() - 1);
            }
            String str3 = "";
            for (int i = 0; i < str2.length(); i++) {
                str3 += getChar(arr, arr2, str2.charAt(i));
            }
            // System.out.println(str2);
            System.out.println(str3);
        }
        input.close();
    }

    static char getChar(char arr1[], char arr2[], char ch) {
        int num = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (ch == arr1[i]) {
                num = i;
                break; //
            }
        }
        return arr2[num];
    }
}
