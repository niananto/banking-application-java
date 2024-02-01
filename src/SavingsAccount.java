import java.time.LocalDate;

public class SavingsAccount extends Account {

    private static final double SAVINGS_ACCOUNT_MIN_BALANCE = 1000;

    static Account getSavingsAccount(String name, int accountNumber, LocalDate dateOfCreation, double balance) {
        if (balance < SAVINGS_ACCOUNT_MIN_BALANCE) {
            System.out.println("Initial balance for a savings account must be at least " + SAVINGS_ACCOUNT_MIN_BALANCE);
            return new NullAccount();
        }
        return new SavingsAccount(name, accountNumber, dateOfCreation, balance);
    }

    private SavingsAccount(String name, int accountNumber, LocalDate dateOfCreation, double balance) {
        super(name, accountNumber, dateOfCreation, balance);
        System.out.println("Created a savings account");
        System.out.println(this);
    }

}
