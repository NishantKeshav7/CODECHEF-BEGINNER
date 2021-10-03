package CodechefEasy;

import java.util.*;

public class sed_sequences {
    public static void main(String[] args) {
        // your code goes here
        try {
            Scanner input = new Scanner(System.in);
            int t = input.nextInt();
            for (int i = 0; i < t; i++) {
                int n = input.nextInt();
                int k = input.nextInt();
                int a[] = new int[n];
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    a[j] = input.nextInt();
                    sum +=  a[j];
                }
                int div = sum % k;
                int count = 0;
                if (div != 0) {
                    count++;
                    sum++;
                }
                System.out.println(count);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
