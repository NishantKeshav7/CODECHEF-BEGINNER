import java.util.*;

public class simple_Statistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            // System.out.print("Enter the Length of the array : ");
            int n = input.nextInt();
            // System.out.print("Enter the Numbers to Be Deleted : ");
            int Num = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
            for (int i = Num; i <= (arr.length - 1 - Num); i++) {
                count++;
            }

            int newarr[] = new int[count];
            for (int i = Num, j = 0; i <= (arr.length - 1 - Num); i++, j++) {
                newarr[j] = arr[i];
            }
            // for (int i = 0; i < newarr.length; i++) {
            // System.out.print(newarr[i] + " ");
            // }
            // System.out.println(Sum(newarr));
            // System.out.println(newarr.length);
            Aver(newarr);
        }
    }

    // static int Sum(int arr[]) {
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // sum += arr[i];
    // }
    // return sum;
    // }

    static void Aver(int arr[]) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        System.out.println(String.format("%.6f",avg));
    }
}