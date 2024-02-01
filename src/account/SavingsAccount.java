package account;

import java.time.LocalDate;

class SavingsAccount extends Account {

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

    @Override
    public Boolean withdraw(double withdrawAmount) {
        if (!this.withdrawBasicChecks(withdrawAmount)) {
            return false;
        }
        if ((this.balance - withdrawAmount) < SAVINGS_ACCOUNT_MIN_BALANCE) {
            System.out.println("Savings account balance cannot go below " + SAVINGS_ACCOUNT_MIN_BALANCE);
            System.out.println("Savings account balance is " + this.balance);
            return false;
        }
        this.balance -= withdrawAmount;
        System.out.println("Withdrew " + withdrawAmount + " from account " + this.accountNumber);
        return true;
    }
}
