package Notes;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter income: ");
        double income = scan.nextDouble();
        System.out.println("Are you married? (Y/N) ");
        String ans = scan.next();
        int status;
        if (ans.equals("y") || ans.equals("Y")) {
            status = TaxReturn.MARRIED;
        } else {
            status = TaxReturn.SINGLE;
        }

        TaxReturn tr = new TaxReturn(income, status);
        System.out.println("Tax: " + tr.getTax());
    }
}
