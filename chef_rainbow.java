import java.util.*;

public class chef_rainbow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int N = input.nextInt();
            int newarr[] = new int[N];
            for (int i = 0; i < newarr.length; i++) {
                newarr[i] = input.nextInt();
            }
            if (N % 2 == 0) {
                System.out.println("no");
            } else {
                int middle = N / 2;
                if (newarr[0] != 1 || newarr[middle] > 7) {
                    System.out.println("no");
                } else {
                    int arr1[] = new int[middle];
                    int arr2[] = new int[middle];
                    for (int i = 0; i < middle; i++) {
                        arr1[i] = newarr[i];
                        // System.out.print(arr1[i] + " ");
                    }
                    for (int i = 0, j = middle + 1; i < middle; i++, j++) {
                        arr2[i] = newarr[j];
                        // System.out.print(arr2[i] + " ");
                    }
                    Arrays.sort(arr1);
                    Arrays.sort(arr2);
                    boolean cond = true;
                    for (int i = 0; i < middle; i++) {
                        if (arr1[i] != arr2[i]) {
                            cond = false;
                            break;
                        }
                    }
                    if (cond) {
                        System.out.println("yes");
                    } else {
                        System.out.println("no");
                    }
                }
            }
        }
    }
}