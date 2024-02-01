import java.time.LocalDate;

public class SalaryAccount extends Account {

    SalaryAccount(String name, int accountNumber, LocalDate dateOfCreation, double balance) {
        super(name, accountNumber, dateOfCreation, balance);
        System.out.println("Created a salary account");
        System.out.println(this);
    }
}
