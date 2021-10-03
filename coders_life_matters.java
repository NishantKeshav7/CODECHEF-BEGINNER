import java.util.Scanner;

public class coders_life_matters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int arr[] = new int[30];
            boolean cond = true;
            int count = 0;
            for (int i = 0; i < 30; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < 30; i++) {
                if (arr[i] == 1) {
                    count++; //
                }
                if (count > 5) {
                    cond = false;
                    break;
                }
                if (arr[i] == 0) {
                    count = 0;
                }
            }
            if (cond) {
                System.out.println("#allcodersarefun");
            } else {
                System.out.println("#coderlifematters");
            }
        }
        input.close();
    }
}