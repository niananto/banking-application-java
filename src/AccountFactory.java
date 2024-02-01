import java.time.LocalDate;

public class AccountFactory {

    private static final double CURRENT_ACCOUNT_MIN_BALANCE = 5000;
    private static final double SAVINGS_ACCOUNT_MIN_BALANCE = 1000;
    private static final double SALARY_ACCOUNT_MIN_BALANCE = 0;

    public Account getAccount(AccountType accountType, String name, int accountNumber, LocalDate dateOfCreation, double initialBalance) {
        if (name == null || name.isBlank() || initialBalance < 0) {
            System.out.println("Invalid name or initial balance");
            return new NullAccount();
        }

        if (accountType == AccountType.CURRENT) {
            if (initialBalance < CURRENT_ACCOUNT_MIN_BALANCE) {
                System.out.println("Initial balance for a current account must be at least " + CURRENT_ACCOUNT_MIN_BALANCE);
                return new NullAccount();
            }
            return new CurrentAccount(name, accountNumber, dateOfCreation, initialBalance);
        } else if (accountType == AccountType.SAVINGS) {
            if (initialBalance < SAVINGS_ACCOUNT_MIN_BALANCE) {
                System.out.println("Initial balance for a savings account must be at least " + SAVINGS_ACCOUNT_MIN_BALANCE);
                return new NullAccount();
            }
            return new SavingsAccount(name, accountNumber, dateOfCreation, initialBalance);
        } else if (accountType == AccountType.SALARY) {
            if (initialBalance < SALARY_ACCOUNT_MIN_BALANCE) {
                System.out.println("Initial balance for a salary account must be at least " + SALARY_ACCOUNT_MIN_BALANCE);
                return new NullAccount();
            }
            return new SalaryAccount(name, accountNumber, dateOfCreation, initialBalance);
        } else {
            System.out.println("Invalid account type");
            return new NullAccount();
        }
    }
}
