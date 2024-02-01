import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Bank {

    private static Bank bank = null;

    public static Bank getInstance() {
        if (bank == null) bank = new Bank();
        return bank;
    }

    private static int accountNumber = 0;
    private HashMap<Integer, Account> accounts = new HashMap<>();
    private AccountFactory accountFactory = new AccountFactory();

    private Bank() {}

    public void createAccount(AccountType accountType, String name, LocalDate dateOfCreation, double initialBalance) {
        Account account = accountFactory.getAccount(accountType, name, accountNumber++, dateOfCreation, initialBalance);
        if (account instanceof NullAccount) {
            System.out.println("Account creation failed");
            return;
        }
        accounts.put(accountNumber, account);
    }

    public void displayAllAccounts() {
        System.out.println("Total number of accounts: " + accounts.size());
        for (Account account : accounts.values()) {
            System.out.println(account);
        }
    }

    public Boolean updateAccount(int accountToUpdate, String newName) {
        Account account = accounts.get(accountToUpdate);
        if (account == null) {
            System.out.println("Account with account number " + accountToUpdate + " does not exist");
            return false;
        }
        account.setName(newName);
        System.out.println("Updated account: " + accountToUpdate);
        return true;
    }


    public Boolean deleteAccount(int accountToDelete) {
        Account account = accounts.get(accountToDelete);
        if (account == null) {
            System.out.println("Account with account number " + accountToDelete + " does not exist");
            return false;
        }
        accounts.remove(accountToDelete);
        System.out.println("Deleted account: " + accountToDelete);
        return true;
    }

    public Boolean deposit(int accountToDeposit, double depositAmount) {
        Account account = accounts.get(accountToDeposit);
        if (account == null) {
            System.out.println("Account with account number " + accountToDeposit + " does not exist");
            return false;
        }
        return account.deposit(depositAmount);
    }

    public Boolean withdraw(int accountToWithdraw, double withdrawAmount) {
        if (withdrawAmount < 0) {
            System.out.println("Withdraw amount cannot be negative");
            return false;
        }
        Account account = accounts.get(accountToWithdraw);
        if (account == null) {
            System.out.println("Account with account number " + accountToWithdraw + " does not exist");
            return false;
        }
        return account.withdraw(withdrawAmount);
    }

    public void searchAccount(int accountToSearch) {
        Account account = accounts.get(accountToSearch);
        if (account == null) {
            System.out.println("Account with account number " + accountToSearch + " does not exist");
            return;
        }
        System.out.println(account);
    }
}
