import java.time.LocalDate;

public class SalaryAccount extends Account {


    static Account getSalaryAccount(String name, int accountNumber, LocalDate dateOfCreation, double balance) {
        return new SalaryAccount(name, accountNumber, dateOfCreation, balance);
    }

    private SalaryAccount(String name, int accountNumber, LocalDate dateOfCreation, double balance) {
        super(name, accountNumber, dateOfCreation, balance);
        System.out.println("Created a salary account");
        System.out.println(this);
    }

    @Override
    public Boolean withdraw(double withdrawAmount) {
        if (!this.withdrawBasicChecks(withdrawAmount)) {
            return false;
        }
        this.balance -= withdrawAmount;
        System.out.println("Withdrew " + withdrawAmount + " from account " + this.accountNumber);
        return true;
    }
}
