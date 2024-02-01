import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Bank bank = new Bank();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Create a new account");
            System.out.println("2. Display all accounts");
            System.out.println("3. Update an account");
            System.out.println("4. Delete an account");
            System.out.println("5. Deposit an amount");
            System.out.println("6. Withdraw an amount");
            System.out.println("7. Search for an account");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = scanner.next();
                    System.out.println("Enter account number:");
                    int number = scanner.nextInt();
                    System.out.println("Enter creation date:");
                    String creationDate = scanner.next();
                    System.out.println("Enter initial balance:");
                    double initialBalance = scanner.nextDouble();
//                    bank.createAccount(name, number, creationDate, initialBalance);
                    break;

                case 2:
//                    bank.displayAllAccounts();
                    break;

                case 3:
                    System.out.println("Enter account number to update:");
                    int accountToUpdate = scanner.nextInt();
                    System.out.println("Enter new balance:");
                    double newBalance = scanner.nextDouble();
//                    bank.updateAccount(accountToUpdate, newBalance);
                    break;

                case 4:
                    System.out.println("Enter account number to delete:");
                    int accountToDelete = scanner.nextInt();
//                    bank.deleteAccount(accountToDelete);
                    break;

                case 5:
                    System.out.println("Enter account number to deposit:");
                    int accountToDeposit = scanner.nextInt();
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
//                    bank.deposit(accountToDeposit, depositAmount);
                    break;

                case 6:
                    System.out.println("Enter account number to withdraw:");
                    int accountToWithdraw = scanner.nextInt();
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
//                    bank.withdraw(accountToWithdraw, withdrawAmount);
                    break;

                case 7:
                    System.out.println("Enter account number to search:");
                    int accountToSearch = scanner.nextInt();
//                    bank.searchAccount(accountToSearch);
                    break;

                case 8:
                    System.out.println("Exiting application.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        }
    }
}