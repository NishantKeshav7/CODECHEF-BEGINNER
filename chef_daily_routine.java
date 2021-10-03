import java.util.Scanner;

public class chef_daily_routine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            char arr[] = str.toCharArray();
            boolean cond = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 'C') {
                    if ((arr[i] == 'C' && arr[i + 1] == 'C')) {
                        cond = true;
                    } else if ((arr[i] == 'C' && arr[i + 1] == 'E')) {
                        cond = true;
                    } else if ((arr[i] == 'C' && arr[i + 1] == 'S')) {
                        cond = true;
                    } else {
                        cond = false;
                        break;
                    }
                } else if (arr[i] == 'E') {
                    if ((arr[i] == 'E' && arr[i + 1] == 'E')) {
                        cond = true;
                    } else if ((arr[i] == 'E' && arr[i + 1] == 'S')) {
                        cond = true;
                    } else {
                        cond = false;
                        break;
                    }
                } else if (arr[i] == 'S') {
                    if ((arr[i] == 'S' && arr[i + 1] == 'S')) {
                        cond = true;
                    } else {
                        cond = false;
                        break;
                    }
                }
            }
            if (cond) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        input.close();
    }
}