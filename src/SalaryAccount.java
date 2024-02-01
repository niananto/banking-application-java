import java.time.LocalDate;

public class SalaryAccount extends Account {

    private static final double SALARY_ACCOUNT_MIN_BALANCE = 0;

    static Account getSalaryAccount(String name, int accountNumber, LocalDate dateOfCreation, double balance) {
        if (balance < SALARY_ACCOUNT_MIN_BALANCE) {
            System.out.println("Initial balance for a salary account must be at least " + SALARY_ACCOUNT_MIN_BALANCE);
            return new NullAccount();
        }
        return new SalaryAccount(name, accountNumber, dateOfCreation, balance);
    }

    private SalaryAccount(String name, int accountNumber, LocalDate dateOfCreation, double balance) {
        super(name, accountNumber, dateOfCreation, balance);
        System.out.println("Created a salary account");
        System.out.println(this);
    }
}
