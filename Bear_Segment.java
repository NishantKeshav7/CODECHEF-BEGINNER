import java.util.Scanner;

public class Bear_Segment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            int count1 = 0, count0 = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1')
                    count1++;
                else
                    count0++;
            }
            if (count1 == 0) {
                System.out.println("NO");
            } else {
                // System.out.println(count);
                int arr[] = new int[count1];
                for (int i = 0, j = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '1') {
                        arr[j] = i;
                        j++;
                    }
                }
                // for (int i = 0; i < arr.length; i++) {
                // System.out.print(arr[i] + " ");
                // }
                // System.out.println(arr[0] + " " + arr[arr.length - 1]);
                boolean cond = true;
                for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
                    if (str.charAt(i) == '0') {
                        cond = false;
                        break;
                    }
                }
                if (cond) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            input.close();
        }
    }
}
