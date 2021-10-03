import java.util.Scanner;

public class multiplechoice_Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int t = input.nextInt();
            while (t-- > 0) {
                int n = input.nextInt();
                String str1 = input.next();
                String str2 = input.next();
                char arr1[] = str1.toCharArray();
                char arr2[] = str2.toCharArray();
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (arr2[i] == arr1[i]) {
                        count++; //
                    } else if (arr2[i] == 'N') {
                        count += 0;
                    } else if (arr2[i] != arr1[i]) {
                        ++i;
                    }
                }
                System.out.println(count);
            }
        } catch (Exception e) {

        }
        input.close();
    }
}