import java.util.Scanner;

public class chef_and_cookOff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String str[] = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = input.next();
            }
            int cakewalk = 0, simple = 0, easy = 0, medium = 0, hard = 0;
            for (int i = 0; i < n; i++) {
                if (str[i].equals("cakewalk")) {
                    cakewalk++;
                } else if (str[i].equals("simple"))
                    simple++;
                else if (str[i].equals("easy"))
                    easy++;
                else if (str[i].equals("medium") || str[i].equals("easy-medium"))
                    medium++;
                else if (str[i].equals("hard") || str[i].equals("medium-hard"))
                    hard++;
            }
            if (cakewalk > 0 && simple > 0 && easy > 0 && medium > 0 && hard > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        input.close();
    }
}