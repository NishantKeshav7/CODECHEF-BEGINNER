import java.util.Scanner;

public class snake_procession {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String str = input.next();
            String str2 = "";
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == 'H' || str.charAt(i) == 'T') {
                    str2 += str.charAt(i);
                }
            }
            int Hs = 0, Ts = 0, Dots = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == 'H') {
                    Hs++;
                } else if (str.charAt(i) == 'T') {
                    Ts++;
                } else {
                    Dots++;
                }
            }
            if (Dots > 0 && Hs == 0 && Ts == 0) {
                System.out.println("Valid");
            } else if (Hs != Ts) {
                System.out.println("Invalid");
            } else {
                if (!(str2.charAt(0) == 'H' && str2.charAt(str2.length() - 1) == 'T')) {
                    System.out.println("Invalid");
                } else {
                    boolean cond = true;
                    for (int i = 0; i < str2.length() - 1; i += 2) {
                        if (!(str2.charAt(i) == 'H' && str2.charAt(i + 1) == 'T')) {
                            cond = false;
                            break;
                        }
                    }
                    if (cond) {
                        System.out.println("Valid");
                    } else {
                        System.out.println("Invalid");
                    }
                }
            }
        }
        input.close();
    }
}