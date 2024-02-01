import java.time.LocalDate;

public abstract class Account {
    protected String name;
    protected int accountNumber;
    protected LocalDate dateOfCreation;
    protected double balance;

    protected Account(String name, int accountNumber, LocalDate dateOfCreation, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.dateOfCreation = dateOfCreation;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", dateOfCreation=" + dateOfCreation +
                ", balance=" + balance +
                '}';
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Boolean deposit(double depositAmount) {
        if (depositAmount < 0) {
            System.out.println("Deposit amount cannot be negative");
            return false;
        }
        this.balance += depositAmount;
        System.out.println("Deposited " + depositAmount + " into account " + this.accountNumber);
        return true;
    }

    protected Boolean withdrawBasicChecks(double withdrawAmount) {
        if (withdrawAmount < 0) {
            System.out.println("Withdraw amount cannot be negative");
            return false;
        }
        if (withdrawAmount > this.balance) {
            System.out.println("Withdraw amount cannot be greater than balance");
            return false;
        }
        return true;
    }

    public abstract Boolean withdraw(double withdrawAmount);
}
