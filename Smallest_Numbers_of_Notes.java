import java.util.Scanner;

public class Smallest_Numbers_of_Notes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int j = 0; j < t; j++) {
            int N = input.nextInt();
            int count = 0;
            int arr[] = { 100, 50, 10, 5, 2, 1 };
            for (int i = 0; i < arr.length; i++) {
                int rem = N / arr[i];
                count = count + rem;
                N = N % arr[i];
            }
            System.out.println(count);
        }
        input.close();
    }
}