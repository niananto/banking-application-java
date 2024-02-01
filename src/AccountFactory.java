import java.time.LocalDate;

public class AccountFactory {


    public Account getAccount(AccountType accountType, String name, int accountNumber, LocalDate dateOfCreation, double initialBalance) {
        if (name.isBlank() || initialBalance < 0) {
            System.out.println("Invalid name or initial balance");
            return new NullAccount();
        }

        switch (accountType) {
            case CURRENT -> {
                return CurrentAccount.getCurrentAccount(name, accountNumber, dateOfCreation, initialBalance);
            }
            case SAVINGS -> {
                return SavingsAccount.getSavingsAccount(name, accountNumber, dateOfCreation, initialBalance);
            }
            case SALARY -> {
                return SalaryAccount.getSalaryAccount(name, accountNumber, dateOfCreation, initialBalance);
            }
            default -> {
                System.out.println("Invalid account type");
                return new NullAccount();
            }
        }
    }
}
