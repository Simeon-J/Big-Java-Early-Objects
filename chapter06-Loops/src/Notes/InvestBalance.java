package Notes;

public class InvestBalance {
    public static void main(String[] args) {
        double balance = 10_000.00;
        final double INTEREST_RATE = 0.05;
        int year = 0;
        while (balance < 20_000) {
            year++;
            double interest = balance * INTEREST_RATE;
            balance += interest;
        }
        System.out.println("Balance: " + balance + "\nYears: " + year);
    }
}
