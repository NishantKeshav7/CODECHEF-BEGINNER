import java.util.Scanner;

public class similar_dishes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String arr1[] = new String[4];
            String arr2[] = new String[4];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = input.next();
            }
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = input.next();
            }
            int count = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i].equals(arr2[j])) {
                        count++;
                    }
                }
            }
            if (count >= 2) {
                System.out.println("similar");
            } else {
                System.out.println("dissimilar");
            }
        }
    }
}
