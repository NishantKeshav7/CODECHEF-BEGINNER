import java.util.Arrays;
import java.util.Scanner;

public class total_correct_submissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int size = n * 3;
            String str[] = new String[size];
            int numarr[] = new int[size];
            for (int i = 0; i < size; i++) {
                str[i] = input.next();
                numarr[i] = input.nextInt();
            }
            int count = 1;
            for (int i = 0; i < size - 1; i++) {
                if (!(str[i].equals(str[i + 1]))) {
                    count++;
                }
            }
            String str2[] = new String[count];
            for (int i = 0, j = 0; i < size - 1; i++) {
                if (!(str[i].equals(str[i + 1]))) {
                    str2[j] = str[i];
                    j++;
                }
            }
            if (!isAvaliable(str[size - 1], str)) {
                str2[count - 1] = str[size - 1];
            }
            int k = 0;
            int answers[] = new int[count];
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < size; j++) {
                    if (str2[i].equals(str[j])) {
                        answers[k] += numarr[j];
                    }
                }
                k++;
            }
            Arrays.sort(answers);
            for (int i = 0; i < count; i++) {
                System.out.print(answers[i] + " ");
            }
            System.out.println();
        }
    }

    static boolean isAvaliable(String s, String str[]) {
        for (int i = 0; i < str.length - 1; i++) {
            if (s == str[i]) {
                return true;
            }
        }
        return false;
    }
}
