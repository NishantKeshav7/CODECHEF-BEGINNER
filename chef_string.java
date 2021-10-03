import java.util.Scanner;

public class chef_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
            String str = input.next();
            int c = 0, h = 0, e = 0, f = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'C')
                    c++;
                else if (str.charAt(i) == 'H' && c > 0) {
                    h++;
                    c--;
                } else if (str.charAt(i) == 'E' && h > 0) {
                    e++;
                    h--;
                } else if (str.charAt(i) == 'F' && e > 0) {
                    f++;
                    e--;
                }
            }
            System.out.println(f);
        
    }
}
