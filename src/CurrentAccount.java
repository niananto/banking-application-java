import java.time.LocalDate;

class CurrentAccount extends Account {

    private static final double CURRENT_ACCOUNT_MIN_BALANCE = 5000;

    static Account getCurrentAccount(String name, int accountNumber, LocalDate dateOfCreation, double balance) {
        if (balance < CURRENT_ACCOUNT_MIN_BALANCE) {
            System.out.println("Initial balance for a current account must be at least " + CURRENT_ACCOUNT_MIN_BALANCE);
            return new NullAccount();
        }
        return new CurrentAccount(name, accountNumber, dateOfCreation, balance);
    }

    private CurrentAccount(String name, int accountNumber, LocalDate dateOfCreation, double balance) {
        super(name, accountNumber, dateOfCreation, balance);
        System.out.println("Created a current account");
        System.out.println(this);
    }

    @Override
    public Boolean withdraw(double withdrawAmount) {
        if (!this.withdrawBasicChecks(withdrawAmount)) {
            return false;
        }
        if ((this.balance - withdrawAmount) < CURRENT_ACCOUNT_MIN_BALANCE) {
            System.out.println("Current account balance cannot go below " + CURRENT_ACCOUNT_MIN_BALANCE);
            System.out.println("Current account balance is " + this.balance);
            return false;
        }
        this.balance -= withdrawAmount;
        System.out.println("Withdrew " + withdrawAmount + " from account " + this.accountNumber);
        return true;
    }
}
