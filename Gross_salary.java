import java.util.*;

public class Gross_salary {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int basicSalary = input.nextInt();
            double HRA = 0;
            double DA = 0;
            if (basicSalary < 1500) {
                HRA = (double) 10 / 100 * basicSalary;
                DA = (double) 90 / 100 * basicSalary;
            } else {
                HRA = 500;
                DA = (double) 98 / 100 * basicSalary;
            }
            double salary =(basicSalary + HRA + DA);
            System.out.println(salary);
        }
        input.close();
    }
}
