/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class movie_weekend {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int[] L = new int[n];
            for (int i = 0; i < n; i++)
                L[i] = in.nextInt();
            int[] R = new int[n];
            for (int i = 0; i < n; i++)
                R[i] = in.nextInt();
            int max = 0, r = 0, ind = -1;
            for (int i = 0; i < n; i++)
                if (L[i] * R[i] > max) {
                    max = L[i] * R[i];
                    ind = i;
                    r = R[i];
                } else if (L[i] * R[i] == max) {
                    if (R[i] > r) {
                        r = R[i];
                        max = R[i] * L[i];
                        ind = i;
                    } else if (R[i] == r)
                        max = R[i] * L[i];
                }
            System.out.println(ind + 1);
        }
    }
}
