import java.util.Scanner;

public class chef_snackdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int year = input.nextInt();
            if (year == 2010 || year == 2015 || year == 2016 || year == 2017 || year == 2019) {
                System.out.println("HOSTED");
            } else {
                System.out.println("NOT HOSTED");
            }
        }
        input.close();
    }
}
