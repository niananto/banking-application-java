import java.time.LocalDate;

public class SavingsAccount extends Account {

    SavingsAccount(String name, int accountNumber, LocalDate dateOfCreation, double balance) {
        super(name, accountNumber, dateOfCreation, balance);
        System.out.println("Created a savings account");
        System.out.println(this);
    }

}
