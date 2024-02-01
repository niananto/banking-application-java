import java.time.LocalDate;

class CurrentAccount extends Account {

    CurrentAccount(String name, int accountNumber, LocalDate dateOfCreation, double balance) {
        super(name, accountNumber, dateOfCreation, balance);
        System.out.println("Created a current account");
        System.out.println(this);
    }
}
