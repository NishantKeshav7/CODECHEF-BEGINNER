import java.util.*;
public class validRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int arr[] = new int[4];
            for (int i = 0 ; i < 4 ; i++) {
                arr[i]= input.nextInt();
            }
            Arrays.sort(arr);
            if ((arr[0] == arr[1]) && (arr[2] == arr[3])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}