import java.util.*;
public class Tanu_head_bob {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0 ; i < t ; i++) {
            int N = input.nextInt();
            String str = input.next();
            int indian = 0;
            int notIndian = 0;
            int Notsure = 0;
            for (int j = 0 ; j < N ; j++) {
                if (str.charAt(j) == 'I') {
                    indian++;
                } else if (str.charAt(j) == 'N') {
                    Notsure++;
                } else if (str.charAt(j) == 'Y') {
                    notIndian++;
                }
            }
            if (indian > 0) {
                System.out.println("INDIAN");
            } else if (notIndian > 0) {
                System.out.println("NOT INDIAN");
            } else if (Notsure > 0 && indian == 0 && notIndian == 0){
                System.out.println("NOT SURE");
            }
        }
    }
}
